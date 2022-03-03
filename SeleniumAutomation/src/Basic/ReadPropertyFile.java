package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\developer\\eclipse-workspace"
				 +"\\SeleniumAutomation\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		
		
	}

}
