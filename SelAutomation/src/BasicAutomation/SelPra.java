package BasicAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelPra {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BrowserFactory.LaunchBrowser("chrome");
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[ng-model=\"Adress\"]")).sendKeys("sdasdsa");
		driver.findElement(By.xpath("//*[text()=\" Male \"]")).click();
		WebElement chekbox = driver.findElement(By.id("checkbox1"));
		chekbox.click();
		Thread.sleep(3000);
		chekbox.click();

		if (chekbox.isSelected()) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Scrolling

		// scrolling to this element
		WebElement Element = driver.findElement(By.id("countries"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scrolling down the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
		// js.executeScript("window.scrollBy(0,300)", "");
		// js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		WebElement languageDD = driver.findElement(By.id("msdd"));

		languageDD.click();
		driver.findElement(By.xpath("//*[text()=\"Bulgarian\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Catalan\"]")).click();

		WebElement dropdown = driver.findElement(By.id("Skills"));
		Select sel = new Select(dropdown);
		sel.selectByValue("Art Design");
		// sel.selectByIndex(1);

		WebElement country = driver.findElement(By.id("countries"));
		Select sel2 = new Select(country);
		sel2.selectByValue("Belgium");
		
		driver.findElement(By.cssSelector("[aria-labelledby=\"select2-country-container\"]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Australia')]")).click();
		
		
		WebElement month = driver.findElement(By.cssSelector("[placeholder=\"Month\"]"));
		Select sel21 = new Select(month);
		sel21.selectByValue("February");
		
		WebElement day = driver.findElement(By.cssSelector("[placeholder=\"Day\"]"));
		Select sel22 = new Select(day);
		sel22.selectByValue("3");
		
		
	}

}
