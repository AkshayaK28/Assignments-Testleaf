package week3;

public class StringMethods {

	public static void main(String[] args) {
		String companyName= "TestLeaf";
		char[] charArray = companyName.toCharArray();
		
		for(int i=companyName.length()-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}

	}

}
