package assignments;

public class NumPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 121121;
		int temp=input; 
		
		int output = 0;
		
		while(input != 0)
		{
			output=output*10 + input%10;
			input=input/10;
		}
       if(temp == output)
       {
    	   System.out.println(output + " Is a Palindrome number");
       } else {
    	   System.out.println(output + " Not a Palindrome number");  
       }
    	   
	}

}
