package resources;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MobileData {

	

    FileInputStream reader;
    Data p;
	
	public static Properties getpropertyObject() throws IOException
	{
		//reader=new FileInputStream(System.getProperty("user.dir")+"\\EmailLoginTest.properties");
		//p.load(reader);
		//p.getProperty("MobileNumber");
		
	//return p;
		
		FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\properties\\MobileLoginTest.properties");  
	      
	   Properties p=new Properties();  
	   p.load(reader);  
	    
	    return p;
	      
	  //  System.out.println(p.getProperty("user"));  
	   // System.out.println(p.getProperty("password"));  
          
}
	
}