package assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 20;
		boolean isPrime=true;
		

			for(int i=2;i<number;i++)
			{
				if(number%i == 0)
				{
					isPrime=false;
					break;
				}
			}
		if(isPrime)
		{
			System.out.println(number + "  is a prime number");
		} else
			System.out.println(number + "  is not a prime number");

	}

}
