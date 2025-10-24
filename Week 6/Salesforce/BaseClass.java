package week6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	

	
	public ChromeDriver driver;
	
//    @Parameters({"url", "username", "password"})
	@BeforeMethod
	public void preConditions() throws InterruptedException 
    {
    	String url = "https://login.salesforce.com/";
    	String username = "axyakrishnaraj758@agentforce.com";
    	String password = "Akshayak@28";
	    //To disable the notification like Allow/Cancel
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		//To launch browser
		driver = new ChromeDriver(opt);
		
		//Navigate to site
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Perform actions
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(20000);
        driver.findElement(By.xpath("//input[@id='save']")).click(); 

	}
	
	@AfterMethod
	//To Close browser window
	public void postConditions() {
		
		//To close the browser
		driver.close();
		
	}
}
