package BasicAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}
