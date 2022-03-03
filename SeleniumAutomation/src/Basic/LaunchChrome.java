package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.close();
	}

}
