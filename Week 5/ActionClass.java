package week5;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws IOException {
		//To launch the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//To maximize the screen
		driver.manage().window().maximize();
		//To implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//To Scroll and locate element
		Actions scrollaction = new Actions(driver);
		WebElement scrollText = driver.findElement(By.linkText("Conditions of Use & Sale"));
		scrollaction.scrollToElement(scrollText).perform();
		System.out.println(scrollText.getText());
		//To take Screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//Allocating destination for screenshot
		File destination = new File("./Screenshots/Amazon_Condition.png");
		//Storing the file
		FileUtils.copyFile(source, destination);
		//To close the window
		driver.quit();
			

	}

}
