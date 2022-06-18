package resources;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MobileData {

	static Properties p1=new Properties(); 

    FileInputStream reader;
     Data p;
	
	//public static Properties getpropertyObject() throws IOException
	//{
		//reader=new FileInputStream(System.getProperty("user.dir")+"\\EmailLoginTest.properties");
		//p.load(reader);
		//p.getProperty("MobileNumber");
		
	//return p;
		
	//	FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\properties\\MobileLoginTest.properties");  
	      
	//   Properties p=new Properties();  
	//   p.load(reader);  
	    
	//    return p;
	      
	  //  System.out.println(p.getProperty("user"));  
	   // System.out.println(p.getProperty("password"));  
          
//}
	
	//public static Properties getpropertyObject() throws IOException
	//{
		  //  Properties p=new Properties();  
		   // String path=System.getProperty("user.dir");
			//InputStream reader=new FileInputStream(path+"\\src\\main\\java\\properties\\MobileLoginTest.properties");  

		//   p.load(reader);  
		    
		 //   return p;

          
//}
    public static Properties getpropertyObject() throws IOException
	{
		  //  Properties p=new Properties();  
		    String path=System.getProperty("user.dir");
			InputStream reader=new FileInputStream(path+"\\src\\main\\java\\properties\\MobileLoginTest.properties");  

		   p1.load(reader);  
		    
		    return p1;

          }
	
}
