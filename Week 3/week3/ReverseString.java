package week3;

public class ReverseString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split = test.split(" ");
		
		for(int i =0; i<split.length; i++) {
			if(i%2!=0) {
				String reversed = "";
				for(int j=split[i].length()-1;j>=0; j--) {
					reversed += split[i].charAt(j);
				}
				split[i] = reversed;
			}
			
		}
		for(String word: split) {
			System.out.println(word + " ");
		}
		

	}

}
