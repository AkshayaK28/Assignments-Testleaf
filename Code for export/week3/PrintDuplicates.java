package week3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		//Type 1 - using for loop
        //To declare multiple numbers in array
		 int num[] ={2, 5, 7, 7, 5, 9, 2, 3};
		 
		 for(int i =0;i<num.length-1;i++)
		 {
			 Arrays.sort(num);
			 if(num[i] == num[i+1])
			 {
				 System.out.println("The duplicate values in array are:" +num[i]); 
			 }
			 
		 }
		 
	    //Type 2 -Using 2 for loops
		 
//         int num[] ={2, 5, 7, 7, 5, 9, 2, 3};
//		 
//		 for(int i =0;i<num.length;i++) {
//			 for(int j =i+1;j<num.length;j++) {
//				 if(num[i] == num[j]) {
//					 System.out.println("The duplicate values in array are:" +num[i]);
//				 }
//			 }
//		 }
//				 
	}

}
