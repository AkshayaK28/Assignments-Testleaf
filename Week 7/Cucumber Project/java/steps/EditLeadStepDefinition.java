package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass{
	
//    @And("Click on the Leads link")
//    public void Click_on_the_Leads_link() {
//    	driver.findElement(By.linkText("Leads")).click();
//    }

	@When("Click on find leads")
	public void click_on_find_leads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@When("Click on Phone tab")
	public void click_on_phone_tab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@Given("Enter Phone Number")
	public void enter_phone_number() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}

	@Given("Click on find lead")
	public void click_on_find_lead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@Given("Click on lead from list")
	public void click_on_lead_from_list() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Given("Click on Edit")
	public void click_on_edit() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Given("Enter company name as {string}")
	public void enter_company_name_as_company(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}

	@When("Click on Update")
	public void click_on_update() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Lead should be updated")
	public void lead_should_be_updated() {
	    WebElement element = driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']"));
	    if(!element.getText().isBlank()) {
	    	System.out.println("Lead Updated successfully");
	    } else {
	    	System.out.println("Lead not updated");
	    }
	}

}
