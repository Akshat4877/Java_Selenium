package ImpTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasicAutomation.BrowserFactory;

public class Alert {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =BrowserFactory.LaunchBrowser("chrome");
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("8777");					
        driver.findElement(By.name("submit")).submit();	
      
		//Simple alert
         org.openqa.selenium.Alert alert = driver.switchTo().alert();
         
         String alertmsg=driver.switchTo().alert().getText();
         System.out.println(alertmsg);
         Thread.sleep(2000);
         //dismiss
        alert.dismiss();
         //alert.accept();
//         Thread.sleep(2000);
//         String secondalert=driver.switchTo().alert().getText();
//         System.out.println(secondalert);
         
        
        
         
		
	}

}
