package BasicAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./newexxfiles3/chromedriver.exe");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions option=new ChromeOptions();
		option.merge(dc);
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://expired.badssl.com/");
		
		
		
	}

}
