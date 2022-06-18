package resources;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Data {

	
	Properties p=new Properties();  
    FileInputStream reader;
    //Data p;
	
//	public Properties getpropertyObject() throws IOException
//	{
		//reader=new FileInputStream(System.getProperty("user.dir")+"\\EmailLoginTest.properties");
		//p.load(reader);
		//p.getProperty("MobileNumber");
		
	//return p;
		
	//	FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\properties\\EmailLoginTest.properties");  
	      
	//   Properties p=new Properties();  
	//   p.load(reader);  
	    
	//    return p;
	      
	  //  System.out.println(p.getProperty("user"));  
	   // System.out.println(p.getProperty("password"));  
          
//}
	
	public Properties getpropertyObject() throws IOException
	{
		  //  Properties p=new Properties();  
		    String path=System.getProperty("user.dir");
			InputStream reader=new FileInputStream(path+"\\src\\main\\java\\properties\\EmailLoginTest.properties");  

		   p.load(reader);  
		    
		    return p;

          }
	
}
