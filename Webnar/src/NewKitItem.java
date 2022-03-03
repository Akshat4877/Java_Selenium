import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewKitItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://nvd.ca-test.com");
		driver.findElement(By.cssSelector("[placeholder=\"Email Address\"]")).sendKeys("propertymanagement@commonareas.work.dev");
		driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("1234567Aa");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.xpath("//div[@class=\"fill-height d-flex align-center justify-center plus-button-wrapper col\"]//span[@class=\"v-btn__content\"]//i"))
		.click();
		driver.findElement(By.xpath("//div[@class=\"my-3 text-center col-md-2 col-3\"]//*[contains(text(),\"Available Spaces\")]")).click();
		
	}

}
