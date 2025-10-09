package week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeaftapsWindowHandling {

	public static void main(String[] args) {
		// To login as guest in leaftaps
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
				
        // To launch browser
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//To Maximize the screen 
		driver.manage().window().maximize();
		
		//To implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To give username & password
		WebElement emailField = driver.findElement(By.id("username"));
		emailField.sendKeys("DemoCSR");
				
		//To Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//To click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//To click on "CRM/SFA" link
        driver.findElement(By.linkText("CRM/SFA")).click();
		
		//To click on Contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//To click on Merge Contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//To click on the widget of the "From Contact"
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		//To get all window's address
		Set<String> windowHandles1 = driver.getWindowHandles();
		//To convert set to list to select individual window using index
		List<String> listHandles1 = new ArrayList<String>(windowHandles1);
		
		//To switch focus to 2nd window
		driver.switchTo().window(listHandles1.get(1));
		
		//To click the 1st element
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		//To switch focus to first window
		driver.switchTo().window(listHandles1.get(0));
	
		//To click on the widget of the "To Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		//To switch focus to 2nd window
		Set<String> windowHandles2 = driver.getWindowHandles();
		//To convert set to list to select individual window using index
		List<String> listHandles2 = new ArrayList<String>(windowHandles2);
		
		//To switch focus to first window
		driver.switchTo().window(listHandles2.get(1));
		
		//To click the 2nd element
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		//To switch focus to first window
		driver.switchTo().window(listHandles2.get(0));
		
		//To click on Merge button
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		//To accept alert pop-up
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		//To get title of the page
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		
		//To close all windows
		driver.quit();
		
				

	}

}
