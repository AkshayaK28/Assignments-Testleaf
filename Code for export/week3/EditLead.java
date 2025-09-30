package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

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
		        WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		        fname.sendKeys("Akshayaa");
		        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Nouss");
		        WebElement title = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		        title.sendKeys("Testing");
		        driver.findElement(By.className("inputBox")).sendKeys("Testing");
		        
		        //To click on Create lead button
		        driver.findElement(By.className("smallSubmit")).click();
		        
		        //To click on Edit
		        driver.findElement(By.xpath("//a[text()='Edit']")).click();
		        
		        //To clear description field value
		        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		        
		        //To enter different data in description field
		        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).sendKeys("New Description");
		        
		        //To click on update button
		        driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		        
		        //To get title of resulting window
		        String pagetitle = driver.getTitle();
		        System.out.println("Title of the page is "+pagetitle);
		        
		        //To close the browser
		        driver.close();
		        
		        
		        

	}

}
