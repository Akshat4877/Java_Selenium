import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
		
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement ele = driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]"));
		ele.sendKeys("virat");
		Thread.sleep(3000);
		//ele.clear();
		//ele.sendKeys("hello");
		//Locator
		//driver.close();	
	}
	

}
