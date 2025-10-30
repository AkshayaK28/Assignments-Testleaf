package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateAccountPage extends BaseClass{
	
	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateAccountPage enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
        return this;
	}
	public CreateAccountPage enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
        return this;
	}
	
	public CreateAccountPage enterLastName(String LastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
        return this;
	}
	
	public ViewAccountPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
        return new ViewAccountPage(driver);
	}

}
