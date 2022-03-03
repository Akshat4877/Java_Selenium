package BasicAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./newexxfiles3/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Virat");
//		  new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//ul[@role=\\\"listbox\\\"]//descendant::div[@class='eIPGRd']")))
//	    .sendKeys(Keys.ARROW_DOWN);
		
		List<WebElement> GoogleEleList = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//descendant::div[@class='eIPGRd']"));
		for(WebElement i:GoogleEleList) {
			String ele=i.getText();
			System.out.println(ele);
			if(ele.contains("Virat")) {
				System.out.println("Yesssssssssssssssssssssssssssssssssssssssssss Virat Is there");
			}
			else {
				System.out.println("Oppsssssssssssssssssssssssssssssssss...Not there");
			}
			
		}
		
		
//		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
//		//Thread.sleep(4000);
//		//driver.close();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		//System.out.println(driver.getPageSource());
//		System.out.println(driver.getWindowHandle());
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		
//		driver.findElement(By.id("firstname")).sendKeys("akshat");
//		driver.findElement(By.id("lastname")).sendKeys("tyagi");
//		driver.findElement(By.id("Email")).sendKeys("tyagi@mailinator.com");
//		driver.findElement(By.id("showpassword")).click();
//		driver.findElement(By.id("password")).sendKeys("Akshat123");
		
		
//		driver.get("https://cxco.ca-build.com/#/");
//		driver.findElement(By.id("UserName")).sendKeys("tombarnes@commonareas.work.dev\r\n"
//				+ "\r\n"
//				+ "");
//		driver.findElement(By.id("Password")).sendKeys("1234567Aa");
//		driver.findElement(By.id("login_button")).click();
//		String wel=driver.findElement(By.xpath("//h2[contains(text(),'Barnes')]")).getText();
//		System.out.println("Welcomename user is "+wel);
				
	}
	

}
