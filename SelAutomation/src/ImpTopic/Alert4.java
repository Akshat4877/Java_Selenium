package ImpTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasicAutomation.BrowserFactory;

public class Alert4 {
	
	public static void main(String[] args) {
		
		WebDriver driver =BrowserFactory.LaunchBrowser("chrome");
		//Format is "http://username:pwd@URL"
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		driver.manage().deleteAllCookies();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(text);
			
	}

}
