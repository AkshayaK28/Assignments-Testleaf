package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
		// To declare String array
		String companies[] = {"HCL","Wipro","Aspire Systems","CTS"};
		
		//To convert array to list
		List<String> companiesList = new ArrayList<String>();
		//To push array values into list
		for(int i =0;i<companies.length;i++) {
		companiesList.add(companies[i]);
		//To sort in reverse order
		Collections.sort(companiesList,Collections.reverseOrder());
		System.out.println(companiesList);
	}

}
}
