package week5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		        //To launch chromedriver
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				
				
				//To implicity wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//To Maximize the screen 
				driver.manage().window().maximize();
				
				//To switch to frame
				driver.switchTo().frame("iframeResult");
				
				
				//To click on Try it button
				driver.findElement(By.xpath("//button[text()='Try it']")).click();
				
				//To click on accept alert
				driver.switchTo().alert().accept();
				
				//To get text
				String element = driver.findElement(By.id("demo")).getText();
				System.out.println(element);
				
				//To close window
				driver.quit();
				

	}

}
