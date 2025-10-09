package week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonListInterface {

	public static void main(String[] args) {
		//To launch chromedriver
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=774088017322&hvpos=&hvnetw=g&hvrand=15119872658928317097&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300009&hvtargid=kwd-64107830&hydadcr=14452_2429115&gad_source=1");
		
		//To Maximize the screen 
		driver.manage().window().maximize();
		
		//To implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To search for phones
		driver.findElement(By.xpath("//input[@ID='twotabsearchtextbox']")).sendKeys("Phones");;
		
		//To click on Phones under 15k
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
		
		//To get the price of all the phones in this page by using findElements
		List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//Above one will print text, now should extract prizes from them
		List<Integer> prices = new ArrayList<>();
		for(WebElement priceElement : priceElements) {
			//Extracts the text and then ignores the text and gets only the numbers
			String extractText = priceElement.getText().replaceAll("[^0-9]", "");
			//converts string to integer
			if(!extractText.isEmpty()) {
				prices.add(Integer.parseInt(extractText));		
			}
		}
		//Sort the Prices in ascending order to get lowest price
		Collections.sort(prices);
		
		//To print the prices
		if(!prices.isEmpty()) {
			System.out.println("The lowest price in the list of mobiles is "+prices.get(0));
		} else {
			System.out.println("No prices found");
		}
		
		//To close the window
		driver.quit();
	}

}
