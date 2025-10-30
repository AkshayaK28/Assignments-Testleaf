package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_002_CreateAccount extends BaseClass {
	
	@BeforeTest
	public void passvalues() {
		filename="CreateAccountData";
	}
	
	@Test(dataProvider = "fetch")
	public void createLead(String username, String password, String companyName, String firstName, String lastName) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton()
		.verifyLead();

	}

}
