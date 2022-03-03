package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasicAutomation.BrowserFactory;
import DataRead.ReadDataMethod;

public class DataProvider {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver=BrowserFactory.LaunchBrowser("chrome");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
	}
	
	
	@org.testng.annotations.DataProvider
	public Object[][] getData() {
		
		ReadDataMethod d=new ReadDataMethod("./TestExeclData/SignUpData.xlsx");
		//SheetIndex as argument
		int row=d.getRowNum(0);
		
		Object[][] data=new Object[row][3];
		
		for(int i=1; i<row; i++) {
			data[i][0]=d.getExcelData("sheet1", i, 0);
			data[i][1]=d.getExcelData("sheet1", i, 1);
			data[i][2]=d.getExcelData("sheet1", i, 2);
		    data[i][3]=d.getExcelData("sheet1", i, 3);	
		}
		
		return data;	
	}
	
	@Test(dataProvider = "getData")
	public void SignUp(String FirstName, String LastName, String Email, String Password) {
		
		//elements of sign up page
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(FirstName);
		
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(LastName);
		
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(Email);
		
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("showpassword")).click();
		driver.findElement(By.id("password")).sendKeys(Password);
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
