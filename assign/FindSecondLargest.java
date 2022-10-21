package week3.assign;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	int[] data = {3,2,11,4,6,7,2,3,3,6,7};
	
	Set<String> tset = new TreeSet<>();
	for (int i = 0; i < data.length; i++) 
	
	{ 
		tset.add(data[i]);
		
	}
	List<String> list=new ArrayList<String>();
	list.addAll(tset);
	{
		System.out.println(list);
	}
}
}
