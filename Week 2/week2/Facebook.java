package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
	
				// Launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the Url
				driver.get("https://en-gb.facebook.com/");
				
				//Maximize the screen
				driver.manage().window().maximize();  
				
				//Implicit wait till the page loads
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//To click on Create Account
				driver.findElement(By.linkText("Create new account")).click();
				
				//To enter details in create account screen
				driver.findElement(By.name("firstname")).sendKeys("Aks");
				driver.findElement(By.name("lastname")).sendKeys("K");
				
				//To select radio buttons
				driver.findElement(By.name("sex")).click();
				
				//Handle date dropdown
				WebElement day = driver.findElement(By.id("day"));
			    Select options1 = new Select(day);
			    options1.selectByVisibleText("28");
			    
				WebElement month = driver.findElement(By.id("month"));
			    Select options2 = new Select(month);
			    options2.selectByValue("7");

				WebElement year = driver.findElement(By.id("year"));
			    Select options3 = new Select(year);
			    options3.selectByVisibleText("2000");
			    
			    driver.findElement(By.name("reg_email__")).sendKeys("axya@yopmail.com");
			    driver.findElement(By.name("reg_passwd__")).sendKeys("Axya@10");
			    
			    //To click on Signup
			    driver.findElement(By.name("websubmit")).click();
			    
		        // Close the browser
		        driver.quit();
				
			    
	}

}
