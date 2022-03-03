package BasicAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./newexxfiles3/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List col=driver.findElements(By.xpath("//div[@id=\"leftcontainer\"]//table//thead//tr//th"));
		//System.out.println(col.size());
		List row=driver.findElements(By.xpath("//div[@id=\"leftcontainer\"]//table//tbody//tr//td"));
        //System.out.println(row.size());
       WebElement BaseTable=driver.findElement(By.tagName("table"));
       
       
       for(int i=1; i<=col.size(); i++) {
    	  
    	   for(int j=1; j<=col.size(); j++) {
    		   WebElement data =BaseTable.findElement(By.xpath("//div[@id=\"leftcontainer\"]"
       	       		+ "//table//tbody//tr["+i+"]//td["+j+"]"));
       	        System.out.println(data.getText());		
    	   }
    	   
       }
       
       	
	}

}
