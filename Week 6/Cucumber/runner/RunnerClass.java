package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features/Login.feature" , glue = "steps" )
public class RunnerClass extends AbstractTestNGCucumberTests{

}
