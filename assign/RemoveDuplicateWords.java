package week3.assign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
			
		String input= "We learn java basics as part of java sessions in java week1";
		System.out.println(input);
		String[] collection=input.split(" ");
		System.out.println("Sentence : " + Arrays.toString(collection));
		
		List<String> repeatedWords=new ArrayList<>();
		HashSet<String> uniqueWords=new HashSet<>();
		for(String str : collection)
	      {
	          if (!uniqueWords.add(str))
	            repeatedWords.add(str);
	      }
	      System.out.println(uniqueWords);
		
	}}
		

