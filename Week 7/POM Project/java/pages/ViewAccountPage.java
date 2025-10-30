package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewAccountPage extends BaseClass {
	
	public ViewAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public void verifyLead() {
		System.out.println("Lead is created");

	}

}
