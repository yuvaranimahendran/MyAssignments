package week2.assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		// Open browser
		ChromeDriver driver=new ChromeDriver();
		
		// pass url 
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement create=driver.findElement(By.linkText("Create new account"));
		create.click();
		
		WebElement first=driver.findElement(By.name("firstname"));
		first.sendKeys("Yuva001");
		
		WebElement last=driver.findElement(By.name("lastname"));
		last.sendKeys("Mahi001");
		
		WebElement phonenumber=driver.findElement(By.xpath("//input[@type,'text']"));
		phonenumber.sendKeys("9690878978");
		
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Year@2022");
		
		WebElement birthdaymonth = driver.findElement(By.xpath("//select[@title='Month']")); 
		new Select(birthdaymonth).selectByValue("July");
		
		
		WebElement birthdayday = driver.findElement(By.name("birthday_day")); 
		new Select(birthdayday).selectByIndex(12);
		
		WebElement birthdayyear = driver.findElement(By.id("year")); 
		new Select(birthdayyear).selectByVisibleText("1992"); 
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.id("u_5_s_tx")).click();
//		
		}}