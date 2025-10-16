package week5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ErailTables {

	public static void main(String[] args) {
		 //To disable the notification like Allow/Cancel
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");

		// To launch browser
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://erail.in/");
		
		//To maximize the screen & implicitly wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To send values in From
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		
		//To & disable sort on date checkbox
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//To locate table & get train names
		WebElement fullTable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		List<WebElement> trainNames = fullTable.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		//Using for loops to retrieve the names from list, using gettext to retrieve text from webelement
		for(int i =0;i<trainNames.size(); i++) {
			String text = trainNames.get(i).getText();
			System.out.println("List of train names from MAS to MDU are: "+text);
		}
	
		//To close the window
		driver.quit();

	}

}
