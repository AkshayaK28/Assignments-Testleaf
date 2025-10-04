package week3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// To declare two strings
		String text1= "stops";
		String text2 = "potss";
		//compare if length of the string is same
		if(text1.length()==text2.length())
		{
			//Convert String to char and save it in a Array variable
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 =text2.toCharArray();
			//Sort the Character array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			//Compare the char array and check if they are same or not
			if(Arrays.equals(charArray1, charArray2))
			{
				 System.out.println("The given strings are Anagram.");
	        } else {
	            System.out.println("The given strings are not an Anagram.");
			}
			
		} else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}

}
