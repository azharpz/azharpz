package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class AdminData {

	
	Properties p=new Properties();  
    FileInputStream reader;
    public static  Logger logger = null;
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
			InputStream reader=new FileInputStream(path+"\\src\\main\\java\\properties\\Admin.properties");  

		   p.load(reader);  
		    
		    return p;

          }
	@BeforeTest
	public   void loadLog4j() throws IOException
	{
		  String log4jpath=System.getProperty("user.dir");
			InputStream reader=new FileInputStream(log4jpath+"\\src\\main\\java\\properties\\log4j.properties");  
			PropertyConfigurator.configure(reader);

		
		 	   
	}
	
	public   void clickElement(WebElement element) throws IOException
	{
		 
		element.click();
		 	   
	}
	
	public   void SelectDropDownElement(List<WebElement> element) throws IOException
	{

	 
	    List<WebElement>	truck=  element;
	    Iterator<WebElement> itr=truck.iterator();
	    int i=1;
	    String value="";
	    while(itr.hasNext())
	 {
		 WebElement element1=itr.next();
		 value=element1.getText();
		 System.out.println("name of selected dropdown is   "  + value);
	 }

	 
	   int	dropdownsizes= element.size();

	   System.out.println("no of dropdownsize is   "  + dropdownsizes);
	   element.get(2).click();
	  

	   
	 
	}
	//public void setValue(By selector, String value){
		// does work of driver.findElement(By.id("ainput")).sendKeys("10");
	//	driver.findElement(selector).sendKeys(value);
	//}
	
	
	
}
