package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DeleteLeadDefinition extends BaseClass{
	
	@And("Click on the Delete button")
	public void Click_on_the_Delete_button() {
		driver.findElement(By.linkText("Delete")).click();
	}
	

}
