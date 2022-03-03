package BasicAutomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {

	public WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = BrowserFactory.LaunchBrowser("chrome");
		driver.get("https://google.com");	
	}
	
	void takeScreenShot(String filespath) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			Files.copy(source, new File(filespath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the Screenshot is taken");	
	}
	
	
}
