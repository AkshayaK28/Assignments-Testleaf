package week3;

public class DuplicateString {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] aftersplit = text.split(" ");
		
		int count=0;
		
		for(int i =0;i<aftersplit.length; i++) //takes the 1st word
		{
			for(int j=i+1;j<aftersplit.length; j++) { //takes the 2nd word to compare with i
				if(aftersplit[i].equalsIgnoreCase(aftersplit[j])) { //compare irrespective of case sensitive
					aftersplit[i] = ""; //replace duplicates with empty string
					count++;
				}
			}
		}
		if(count>0) {
			for(String words : aftersplit) {
				if(!aftersplit.equals("")) {
					System.out.println(words + " ");
				}
				
			}
			
		} else {
			System.out.println("No Duplicates found");
		}

	}

}
