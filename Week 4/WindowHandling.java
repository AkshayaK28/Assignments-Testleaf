package week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) {
		 //To disable the notification like Allow/Cancel
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");

		// To launch browser
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.irctc.co.in/");
		
		//To maximize the screen & implicitly wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To click on OK in the Alert pop-up
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
       	//To click on flights
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		//To get title of child window
		String title2 = driver.getTitle();
		System.out.println("Title of 2nd window is: "+title2);
		
		//To get the address of window
		Set<String> window1 = driver.getWindowHandles();
		
		//To convert set to list and get a particular window
		List<String> address = new ArrayList<String>(window1);
		driver.switchTo().window(address.get(1));
		
		driver.close();
		}

}
