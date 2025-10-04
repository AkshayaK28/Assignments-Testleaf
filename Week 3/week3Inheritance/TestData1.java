package week3Inheritance;

public class TestData1 {
	
	public void enterCredentials() {
		System.out.println("Enter the credentials");
	}
	public void navigateToHomePage() {
		System.out.println("Click to navigate to home page");
	}

	public static void main(String[] args) {
		TestData1 obj1 = new TestData1();
		obj1.enterCredentials();
		obj1.navigateToHomePage();

	}

}
