package week3.assign;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNumbers {
	
public static void main(String[] args) {
		
		int[] data={4,3,6,8,29,1,2,4,7,8};
		
		 Set<Integer> duplicates = new HashSet<Integer>();
		 
		for (int i = 0; i < data.length; i++) 
		
		{ 
			for (int j = 1; j < data.length; j++) 
	 
			if (data[i] == data[j] && i != j)
			{
				// duplicate element found 
				duplicates.add(data[i]);
				break; } 
			} 
       System.out.println(duplicates);
}
			}
	
	