package assignmenttwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int a,arm=0,n,temp;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
	            	n = Integer.parseInt(in.readLine());
		temp=n;
		while(n!=0)
		{
			a=n%10;
			arm=arm+(a*a*a);
			n=n/10;
		}
		if(arm==temp)
		System.out.println(temp+" is a armstrong number ");
		else
		System.out.println(temp+" is not a armstrong number ");

	}

}
