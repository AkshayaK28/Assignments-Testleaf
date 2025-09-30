package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
        
        //To click on Accounts tab
        driver.findElement(By.linkText("Accounts")).click();
        
        //To click on Create Account button
        driver.findElement(By.linkText("Create Account")).click();

        //To Give account name, description
        driver.findElement(By.id("accountName")).sendKeys("Akshaya");
      
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        
        //To select Industry dropdown by using select class
        //Step 1 - Find webelement and assign to variable
        WebElement dropdown1 = driver.findElement(By.name("industryEnumId"));
        //Step 2 - Need to call Slect class & Pass the webelement
        Select options1 = new Select(dropdown1);
        //Step 3 - Use the method
        options1.selectByIndex(3);
        
       //To select Ownership dropdown by using select class 
       WebElement dropdown2 = driver.findElement(By.name("ownershipEnumId"));
       Select options2 = new Select(dropdown2);
       options2.selectByVisibleText("S-Corporation");
       
       //To select Source dropdown by using select class 
       WebElement dropdown3 = driver.findElement(By.id("dataSourceId"));
       Select options3 = new Select(dropdown3);
       options3.selectByValue("LEAD_EMPLOYEE");
       
       //To select Marketing campaign dropdown by using select class
       WebElement dropdown4 = driver.findElement(By.id("marketingCampaignId"));
       Select options4 = new Select(dropdown4);
       options4.selectByIndex(6);
	
       //To select State/Province dropdown by using select class
       WebElement dropdown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
       Select options5 = new Select(dropdown5);
       options5.selectByValue("TX");
       
       //To click on Create Account button
       driver.findElement(By.className("smallSubmit")).click();
	
       //To verify that the account name is displayed correctly.(Using header text to find out if account created)
       WebElement accountName = driver.findElement(By.id("sectionHeaderTitle_accounts"));
       if (accountName.getText().contains("Account Details")) {
           System.out.println("Account created successfully.");
       } else {
           System.out.println("Account creation failed."); 
       }
       
       // Close the browser
       driver.quit();
 

	
	  }
}
