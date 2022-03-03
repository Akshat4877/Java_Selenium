package BasicAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterData {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./newexxfiles3/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://accounts.google.com/");
		WebElement webelement=driver.findElement(By.id("identifierId"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 //js.executeScript("document.getElementById('identifierId').value='heloo'",ele);
		 js.executeScript("arguments[0].value='Techndeck';",webelement );
		 
	}

}
