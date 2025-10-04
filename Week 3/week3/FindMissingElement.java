package week3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// To find missing element
		int array[] = {1, 4,3,2,8, 6, 7}; 
		
		Arrays.sort(array); //1 2 3 4 6 7 8
		for(int i =0; i<array.length-1; i++) {
			//1st find the position & find the consecutive number
			//array[i+1] finds the index & prints the values in index, array[i]+1- adds the value form the index
			if(array[i+1] != array[i]+1) {
				// 1 = 1, 2 = 2, 3 = 3, 4 = 4, 
				System.out.println("The missing number is "+(array[i]+1));
				break;
			}
		}

	}

}
