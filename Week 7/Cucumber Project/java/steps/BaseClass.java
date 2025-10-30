package steps;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests{
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("guest");
	driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	}
	
	@AfterMethod
	public void closebrowser() {
	driver.close();

}
}