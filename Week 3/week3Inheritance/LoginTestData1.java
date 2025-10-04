package week3Inheritance;

public class LoginTestData1 extends TestData1 {
	
	public void enterUsername() {
		System.out.println("Username");
	}
	public void enterPassword() {
		System.out.println("Password");
	}

	public static void main(String[] args) {
		LoginTestData1 obj2 = new LoginTestData1();
		obj2.enterCredentials();
		obj2.navigateToHomePage();
		obj2.enterUsername();
		obj2.enterPassword();

	}

}
