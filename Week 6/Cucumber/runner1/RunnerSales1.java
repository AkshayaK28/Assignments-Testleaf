package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\main\\java\\feature1\\LoginSales.feature" , glue = "steps1" )
public class RunnerSales1 extends AbstractTestNGCucumberTests{

}
