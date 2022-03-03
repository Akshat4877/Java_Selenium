package ImpTopic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasicAutomation.BrowserFactory;

public class Alert3 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =BrowserFactory.LaunchBrowser("chrome");
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String EleText=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick=\"promptbox()\"]")))
		.getText();
		System.out.println(EleText);
		//assert
		boolean asseert = EleText.equals("click the button to demonstrate the prompt box ");
		System.out.println("Text is Match and it is clicked "+asseert);
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick=\"promptbox()\"]")))
		.click();
		  Alert alert = driver.switchTo().alert();
		  String alertText=driver.switchTo().alert().getText();
		  System.out.println(alertText);
		  driver.switchTo().alert().sendKeys("This is an alert");
		  Thread.sleep(2000);
		  alert.dismiss();
		  
	}

}
