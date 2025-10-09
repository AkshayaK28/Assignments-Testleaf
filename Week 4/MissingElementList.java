package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		//To declare an array
		int array[]= {1, 2, 3, 4, 10, 6, 8};
		//To convert array as list
		List<Integer> numsequence = new ArrayList<Integer>();
		for(int i =0;i<=array.length-1;i++) {
			numsequence.add(array[i]);
		}
		//To sort the numbers in list
		Collections.sort(numsequence);
		//To compare elements using for loop
		for(int x =0;x<numsequence.size()-1; x++) {
			int current = numsequence.get(x);
			int next = numsequence.get(x+1);
			//Check difference between numers
		if(next - current >1) {
			//Print missing numbers
			for(int y=current+1;y<next;y++) {
				System.out.println("Missing Numbers are: " +y);
				
			}
			
			
		}
	}

	}

}
