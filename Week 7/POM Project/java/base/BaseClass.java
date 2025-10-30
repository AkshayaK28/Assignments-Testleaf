package base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utills.ReadExcel;

public class BaseClass {
	
public ChromeDriver driver;
public String filename;

@BeforeMethod
public void preConditions() {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("guest");
	driver=new ChromeDriver(opt);
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();

}
@AfterMethod
public void postConditions() {
	driver.close();

}	
@DataProvider(name = "fetch")
public String[][] sendData() throws IOException {
	String[][] excelData = ReadExcel.readExcelData(filename);  //classname.methodname
	return excelData;
}
}
