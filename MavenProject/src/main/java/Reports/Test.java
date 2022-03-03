package Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utilities.Base;

public class Test {
	
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeClass
	void gearup() {
	
		
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@org.testng.annotations.Test
	public void setup()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("SetupReport.html");
		 extent = new ExtentReports();
		extent.attachReporter(spark);
	}
	
	
	@org.testng.annotations.Test
	void test() {
		
		 ExtentTest test=extent.createTest("My first test");
		 test.log(Status.INFO, "Starting test case");
		
		 driver.get("https://www.google.co.in");
		 if(driver.getTitle().equals("Google"))
		 {
		 test.log(Status.PASS, "Navigated to the specified URL");
		 }
		 else
		 {
		 test.log(Status.FAIL, "Test Failed");
		 }
		 
		
	}
	
	@AfterSuite
	public void ueast()
	{
		
		extent.flush();
	}

}
