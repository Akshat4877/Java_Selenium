import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.Base;

public class WelcomepageTest extends Base {
	
	@BeforeClass
	public void setup() throws FileNotFoundException {
		
		Base browser = this.getPoperties("Browser");
		String BaseBrowser = browser.BasebrowserName;
		System.out.println(BaseBrowser);
		
		Base url=this.getPoperties("BaseUrl");
		String BaseUrl=url.URL;
		System.out.println(BaseUrl);
		
		driver=Base.LaunchBrowser(BaseBrowser);
		driver.get(BaseUrl);
	}
	
	@Test
	void logoValidation() throws InterruptedException {
		
		driver.findElement(By.name("email")).sendKeys("akshat123@mailinator.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='reg_password']"))
		
		.sendKeys("asasasasasasasasasasasasasasa");
		driver.findElement(By.cssSelector("[name=\"register\"]")).submit();

	}

}
