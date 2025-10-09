package week4;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumber {

	public static void main(String[] args) {
		// To declare an array
		int array[]= {3, 2, 11, 4, 6, 7};
		
		//To create an list to hold the value
		ArrayList<Integer> list = new ArrayList<>();
		
		//To pass the array values to list
		for(int i=0;i<array.length;i++) {
			list.add(array[i]);
		}
		
		//To sort the list in ascending order
		Collections.sort(list);
		
		//To pick 2nd element from last
		int secondlargest = list.get(4);
		
		System.out.println("The 2nd largest element is: "+secondlargest);

	}

}
