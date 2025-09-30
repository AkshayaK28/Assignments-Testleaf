package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		// To login as guest in leaftaps
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		
		
		// Launch the browser
		ChromeDriver driver=new ChromeDriver(opt);
		
		//Load the Url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//To Enter email
		WebElement emailField = driver.findElement(By.id("username"));
		emailField.sendKeys("DemoCSR");
		
		//To Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//To Enter Password
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To click on "CRM/SFA" link
        driver.findElement(By.linkText("CRM/SFA")).click();
        
        //To click on Link tab
        driver.findElement(By.linkText("Leads")).click();
        
        //To click on Create Lead button
        driver.findElement(By.linkText("Create Lead")).click();
        
        //To enter first name, last name, Company name & Title
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akshaya");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Nous");
        WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
        title.sendKeys("Testing");
        //Step 1 - Store expected in a variable. This String is introduced to compare value in created page
        String expectedTitle = title.getText();
        
        //To click on Create lead button
        driver.findElement(By.className("smallSubmit")).click();
        
        //To verify that the account name is displayed correctly.
        
        WebElement verifyTitle = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
       //Step 2 - Store actual in a varible.
        String actualTitle = verifyTitle.getText();
        if (actualTitle == expectedTitle)
        {
        	System.out.println("Title matches");
        } else
        {
        	System.out.println("Title does not match");
        }
        
        // Close the browser
        driver.quit(); 
	}

}
