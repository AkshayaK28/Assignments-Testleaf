package week4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlertInteractions {

	public static void main(String[] args) {
		        // To launch browser
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.leafground.com/alert.xhtml");
				
				//To Maximize the screen 
				driver.manage().window().maximize();
				
				//To implicity wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//1.) Simple Dialog - To click on Alert
				driver.findElement(By.xpath("(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-outlined'])[1]")).click();
		        //To navigate focus to alert box
				Alert alert1 = driver.switchTo().alert();
				//To accept alert popup
				alert1.accept();
				
				//2.) Confirm Dialog - To click on Alert
				driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		        //To navigate focus to alert box
				Alert alert2 = driver.switchTo().alert();
				//To dismiss alert popup
				alert2.dismiss();
				
				//3.) Prompt Dialog - To click on Alert
				driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		        //To navigate focus to alert box
				Alert alert3 = driver.switchTo().alert();
				//To Send text & accept alert popup
				System.out.println(alert3.getText());
				alert3.sendKeys("Successfully Typed");
				alert3.accept();
				
				//4.) To handle Sweet alert
				driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left']")).click();
				//To click on dismiss button using direct xpath 
				driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary']")).click();				
				
				//To close window
				driver.close();
				



	}

}
