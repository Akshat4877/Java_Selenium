package BasicAutomation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./newexxfiles3/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org");
		driver.findElement(By.id("searchInput")).sendKeys("Virat Kohli");
		driver.findElement(By.xpath("//i[@data-jsl10n=\"search-input-button\"]")).click();
		Set<String> window=driver.getWindowHandles();
		System.out.println(window);
		
		Iterator itr=window.iterator();
		while(itr.hasNext()) {
			String child=(String) itr.next();
			System.out.println(child);
		}
		String head=driver.findElement(By.id("firstHeading")).getText(); 
		System.out.println(head);
		
		

		
		
		
		
		
		
		
		
		
		
//		//driver.findElement(By.nam).sendKeys("Virat kholi");
//		//driver.findElement(By.className("gNO89b")).click();
//		//driver.findElement(By.cssSelector("[name=\"q\"]")).clear();
//		
////		
////		//Thread.sleep(10000);
////		driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys("Virat kholi");
////	    Point text=driver.findElement(By.cssSelector("[name=\"q\"]")).getLocation();
////	    System.out.println(text);
//	    new WebDriverWait(driver,20)
//	    .until(ExpectedConditions.elementToBeClickable(By.className("gNO89b"))).click();
//	    //new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.className("gNO89b"))).click();
//	    //driver.findElement(By.className("gNO89b")).click();
//	    Point s=driver.manage().window().getPosition();
//	    System.out.println(s);
//	    System.out.println(driver.getTitle());
//	    System.out.println(driver.getCurrentUrl());
//	    
//	    List<WebElement> links = driver.findElements(By.tagName("a"));
//	    System.out.println(links.size());
//	    for(WebElement MyAllLinks:links) {
//	    	String linkText=MyAllLinks.getText();
//	    	System.out.println(linkText);	
//	    }
//	    
//	    
	}

}
