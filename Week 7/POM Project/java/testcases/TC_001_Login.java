package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_Login extends BaseClass{
	@BeforeTest
	public void passvalues() {
		filename="LoginData";
	}
	
	@Test(dataProvider = "fetch")
	public void login(String username, String Password) {
	LoginPage tc = new LoginPage(driver);
	tc.enterUsername(username)
	.enterPassword(Password)
	.clickLoginButton();
}
	
}
