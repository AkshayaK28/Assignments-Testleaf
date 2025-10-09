package week4;

import java.util.ArrayList;


public class ListInterface {

	public static void main(String[] args) {
		//1st array list
		ArrayList<Integer> digits = new ArrayList<>();
		digits.add(3);
		digits.add(2);
		digits.add(11);
		digits.add(4);
		digits.add(6);
		digits.add(7);
		
		//2nd array list
		ArrayList<Integer> digits2 = new ArrayList<>();
		digits2.add(1);
		digits2.add(2);
		digits2.add(8);
		digits2.add(4);
		digits2.add(9);
		digits2.add(7);
		
		//Create an array list to store the intersection
		ArrayList<Integer> intersection = new ArrayList<>();
		
		//Iterate through each value and compare & find intersection
		for(int i=0;i<digits.size();i++) {
			Integer num = digits.get(i);
			if(digits2.contains(num)) {
				intersection.add(num);
					
				}
				
			}
		//To print the intersection
		System.out.println(intersection);

	}

}
