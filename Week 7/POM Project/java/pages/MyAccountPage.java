package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyAccountPage extends BaseClass {
	
	public MyAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateAccountPage clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
        return new CreateAccountPage(driver); 
	}

}
