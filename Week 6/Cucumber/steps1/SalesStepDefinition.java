package steps1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesStepDefinition {
	
	public ChromeDriver driver;
	
	@Given("Launch the Chrome browser")
	public void launch_the_chrome_browser() {
		ChromeOptions opt=new ChromeOptions();
	  	opt.addArguments("--disable-notifications");  
	    driver = new ChromeDriver(opt);
	}

	@Given("Load the Salesforce URL")
	public void load_the_salesforce_url() {
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Enter Username as {string}")
	public void enter_username_as(String userString) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userString);
	}

	@Given("Enter Password as {string}")
	public void enter_password_as(String passString) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passString);
	}

	@When("Click on Loginin button")
	public void Click_on_Loginin_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(20000);
        driver.findElement(By.xpath("//input[@id='save']")).click();
        
	}
	
	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']//parent::button")).click();
	}

	@When("Click view All")
	public void click_view_all() throws InterruptedException {
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']//child::button")).click();
		Thread.sleep(10);
		//To disable the notification like Allow/Cancel
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
	}

	@When("Click Sales from App Launcher")
	public void click_sales_from_app_launcher() throws InterruptedException {
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    Thread.sleep(10);
	    //To disable the notification like Allow/Cancel
	  	
 
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
	    driver.findElement(By.xpath("(//span[text()='Accounts'])[1]")).clear();
		
	}

	@When("Click on New button")
	public void click_on_new_button() {
	    driver.findElement(By.xpath("//div[@title='New']/parent::a")).click();
	}

	@Given("Enter {string} as account name")
	public void enter_as_account_name(String name) {
	    driver.findElement(By.xpath("(//input[@class='slds-input']/parent::div)[5]")).sendKeys(name);
	}

	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
	    WebElement element = driver.findElement(By.xpath("//button[@id='combobox-button-325']"));
	    element.click();
	    Select options = new Select(element);
	    options.selectByIndex(1);
	}

	@When("Click save")
	public void click_save() {
	    driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand']/parent::lightning-button)[3]")).click();
	}

	@Then("Verify Account name")
	public void verify_account_name() {
	    WebElement text1 = driver.findElement(By.xpath("//records-entity-label[text()='Account']/following::lightning-formatted-text"));
	    text1.getText();
	    System.out.println("Account name is: "+text1.getText());
	}

}
