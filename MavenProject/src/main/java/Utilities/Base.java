package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public static WebDriver driver;
	public String BasebrowserName;
	public String URL;

	public FileInputStream fileInput;
	public Properties prop;
	
	

     public Base getPoperties(String PropName) throws FileNotFoundException {
    	 
    	 File file=new File("C:/Users/developer/eclipse-workspace/MavenProject/src/main/resources/config.properties");
    	 
    	 try {
 			fileInput = new FileInputStream(file);
 			  prop=new Properties();
 			prop.load(fileInput);
 		} 
    	 
    	 catch (IOException e) {
 			e.printStackTrace();
 		} 
    	
    	 BasebrowserName=prop.getProperty("Browser");
    	 URL=prop.getProperty("BaseUrl");
    	 return this; 
     }
     
    
	
	public static WebDriver LaunchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		}
		else if(browserName.equalsIgnoreCase("FF")){
			System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");	
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
