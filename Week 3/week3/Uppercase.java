package week3;

public class Uppercase {

	public static void main(String[] args) {
		// To declare a string
		String test = "changeme";
		//Convert string to char array
		char[] chartext = test.toCharArray();
		//Iterate through for loop and find the odd index
		for(int i =0; i<chartext.length; i++)
		{
			//Condition to find odd number
			if(i%2!=0)
			{
				chartext[i] = Character.toUpperCase(chartext[i]);
			}
		}
		String result = new String(chartext);
		System.out.println(result);
   
	}

}
