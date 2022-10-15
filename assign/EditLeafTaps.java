package week2.assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafTaps {

	public static void main(String[] args) {
		
		
		// set up driver
		WebDriverManager.chromedriver().setup();
		// Open browser
		ChromeDriver driver=new ChromeDriver();
		// pass url 
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximise window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//enter username and password 
		WebElement ElementUsername=driver.findElement(By.id("username"));
		ElementUsername.sendKeys("Demosalesmanager");
		WebElement ElementPassword=driver.findElement(By.id("password"));
		ElementPassword.sendKeys("crmsfa");
		//click login
		WebElement ElementLogin = driver.findElement(By.className("decorativeSubmit"));
		ElementLogin.click();
		//click CRM/SFA link 
		WebElement ElementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		ElementCRMSFA.click();
		WebElement ElementLeads = driver.findElement(By.linkText("Leads"));
		ElementLeads.click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Yuvarani");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.linkText("Yuvarani")).click();
		
		//how to verify the title of the page
		
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		// how to confirm if the changed name appears 
		

    	driver.close();		

	}

}
