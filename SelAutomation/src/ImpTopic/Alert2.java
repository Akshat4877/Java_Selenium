package ImpTopic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicAutomation.BrowserFactory;

public class Alert2 {

public static void main(String[] args) {
	
	WebDriver driver =BrowserFactory.LaunchBrowser("chrome");
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick=\"alertbox()\"]"))).click();
	//driver.findElement(By.className("btn btn-danger")).click();
	Alert alert = driver.switchTo().alert();
	String alertText=driver.switchTo().alert().getText();
	System.out.println(alertText);
	alert.accept();
	
	
	
}
	
	
	
	

}
