package ImpTopic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasicAutomation.BrowserFactory;

public class WindowHandle {
	
	
public static void main(String[] args) {
	
	WebDriver driver =BrowserFactory.LaunchBrowser("chrome");
	driver.get("http://demo.automationtesting.in/Windows.html");
	String parentwindow = driver.getWindowHandle();
	System.out.println("This is my Parent Window Id :-"+parentwindow);
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//a//button[@class=\"btn btn-info\"]")).click();
	Set<String> allWindows=driver.getWindowHandles();
	System.out.println("Number of Windows are :-"+allWindows.size());
	
	Iterator<String> i = allWindows.iterator();
	
	while(i.hasNext()){
		String childWindow=i.next();
		System.out.println("Child windows IDs are :-"+childWindow);
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());	
	}
	
	driver.findElement(By.cssSelector("[href=\"https://support.eji.org/give/153413/#!/donation/checkout\"]"))
	.click();
	Set<String> otherwindow = driver.getWindowHandles();
	System.out.println("Size :-"+otherwindow.size());
	Iterator<String> i2 = otherwindow.iterator();
	while(i2.hasNext()) {
		String newwindow = i2.next();
		System.out.println(newwindow);
		driver.switchTo().window(newwindow);
		System.out.println(driver.getTitle());
		
	}	
}	
	
}
