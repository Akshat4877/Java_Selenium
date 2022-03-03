package ImpTopic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicAutomation.BrowserFactory;

public class WindowHandle2 {
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =BrowserFactory.LaunchBrowser("chrome");
	driver.get("http://demo.automationtesting.in/Windows.html");
	String parentwindow = driver.getWindowHandle();
	System.out.println("Parent Window ID is :-"+parentwindow);
	driver.findElement(By.cssSelector("[href=\"#Multiple\"]")).click();
	driver.findElement(By.cssSelector("[onclick=\"multiwindow()\"]")).click();
	Set<String> Windows=driver.getWindowHandles();
	int size=Windows.size();
	System.out.println("Number of Windows are :-"+size);
	
	for(String child:Windows) {
		
		System.out.println("All windows :-"+child);
		
		if(!parentwindow.equalsIgnoreCase(child)) {
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			//driver.findElement(By.id("email")).sendKeys("email@mailinator.com");
			Thread.sleep(3000);
		}
		
	}
	driver.switchTo().window(parentwindow);
	System.out.println(driver.getTitle());
	
	
//	Iterator<String> i = Windows.iterator();
//	
//	while(i.hasNext()) {
//		String window=i.next();
//		System.out.println(window);
//	}
}

}
