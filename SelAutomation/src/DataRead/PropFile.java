package DataRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropFile {
	
	static Properties prop=new Properties();
	
	public static void getproperty() throws IOException {
		File file=new File("C:/Users/developer/eclipse-workspace/SelAutomation/config.properties");
		FileInputStream fis=new FileInputStream(file);
		prop.load(fis);
		System.out.println(prop.get("Browser"));	
	}
	
	
	public static void setproperty() throws IOException {
		FileOutputStream fos=new FileOutputStream("C:/Users/developer/eclipse-workspace/SelAutomation/config.properties");
		prop.setProperty("Browser", "firefox");
		prop.store(fos, null);	
	}
	
	//Browser=Chrome,
	//set as above in properties file
	
	public static void main(String[] args) throws IOException  {
		getproperty();
		setproperty();	
	}

}
