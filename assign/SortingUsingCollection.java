package week3.assign;

import java.util.Arrays;

public class SortingUsingCollection {
	
	public static void main(String[] args) {
		
		String[] corps= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		int length=corps.length;
		
		Arrays.sort(corps);
		
		for (int i = corps.length-1; i >= 0; i--) {  
            System.out.print(corps[i] + " ");  
            
		}
	}}
