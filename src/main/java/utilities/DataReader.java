package utilities;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;  



public class DataReader {

	//public static void main(String[] args)
	
	
		public static Properties getpropertyObject() throws IOException
		{
			
			FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\properties\\EmailLoginTest.properties");  
		      
		    Properties p=new Properties();  
		    p.load(reader);  
		    
		    return p;
		      
		  //  System.out.println(p.getProperty("user"));  
		   // System.out.println(p.getProperty("password"));  
              
	}
		public static  String getmobileno() throws IOException
		{
			return getpropertyObject().getProperty("MobileNumber");
		}
		
}

