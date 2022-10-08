package assignmenttwo;

import java.util.Arrays;

public class FindTheSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {1,67,45,89,34,6,9};
		int length=numbers.length;
		Arrays.sort(numbers);
		System.out.println(numbers[length-2]);

	}

}
