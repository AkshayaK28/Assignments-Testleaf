package assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 8;
		int first =0, second = 1;
		
		for(int i=1;i<num;i++)
		{
			int next = first+second;
			first = second;
			second = next;
			
			System.out.println(first);
		}

	}

}
