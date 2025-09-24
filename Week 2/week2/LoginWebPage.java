package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebPage {

	public static void main(String[] args) {
		            // Launch the browser
					ChromeDriver driver=new ChromeDriver();
					
					//Load the Url
					driver.get("https://www.facebook.com/");
					
					//Maximize the screen
					driver.manage().window().maximize();
					
					//To Enter email
					WebElement emailField = driver.findElement(By.id("email"));
					emailField.sendKeys("testleaf.2023@gmail.com");
					
					//To Enter Password
					driver.findElement(By.id("pass")).sendKeys("Tuna@321");
					
					//To click on Login
					driver.findElement(By.name("login")).click();
					
					//To get title
					String pageTitle = driver.getTitle();
					System.out.println("The Title of the page is:"+pageTitle);
	}

}
