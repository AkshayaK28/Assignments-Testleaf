package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public ChromeDriver driver;

	@Given("Launch the browser")
	public void launch_the_browser() {
	    driver = new ChromeDriver();
	}

	@Given("Load the URL")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter username as {string}")
	public void enter_username_as(String username1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(username1);
	}


	@Given("Enter password as {string}")
	public void enter_password_as(String password1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(password1);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should navigate to next page")
	public void it_should_navigate_to_next_page() {
		System.out.println("Successfully Logged in");
	}
}
