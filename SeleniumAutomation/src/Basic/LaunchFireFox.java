package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		
	}

}
