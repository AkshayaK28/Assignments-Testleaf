package week6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DynamicParameterization extends BaseClass{
	
	@DataProvider(name = "fetchData")
	public String[][] dataValues() {
		
		String[][] data = new String[1][1];        //        {{"axyakrishnaraj758@agentforce.com", "Akshayak@28","Akshaya"}};
		data[0][0] = "Akshaya";

		return data;
	}
	

	@Test(dataProvider = "fetchData")
	public void salesaction(String legaln) throws InterruptedException {

		//To click toggle button
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']//parent::button")).click(); 
		
		//To click View all
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']//child::button")).click();
		Thread.sleep(20000);
		
		//To disable the notification like Allow/Cancel
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","--incognito");
		
		//To scroll & click on legal entities
		Actions action = new Actions(driver);
		WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		action.scrollToElement(legal).perform();
		legal.click();
		
		//To click on New button
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		//To send name from parameter
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(legaln);
		
		//To click on Save button
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
		//To verify name
		WebElement element = driver.findElement(By.xpath("(//slot[@class='slds-page-header__title slds-m-right--small slds-align-middle slds-line-clamp clip-text']/lightning-formatted-text)[2]"));
		System.out.println(element.getText());
		
	}

}
