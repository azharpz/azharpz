package pageObject;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class WebSignin {
	
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;
	
	
	    FileInputStream reader;
	    Properties p;
	
	
public void signin(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	driver.findElement(By.xpath("//a[normalize-space()='Login / Signup']")).click();
    driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys(getmobileno());
	driver.findElement(By.xpath("//button[.='Send OTP ']")).click();
	Thread.sleep(10000);
    String  username=	driver.findElement(By.xpath("//span[contains(@style,'text-transform: capitalize;')]")).getText();

    System.out.println("username is   "  + username);
    softAssert.assertEquals(username, "azharios");




	 

	}

	
	
		public Properties getpropertyObject() throws IOException
		{
			//reader=new FileInputStream(System.getProperty("user.dir")+"\\EmailLoginTest.properties");
			//p.load(reader);
			//p.getProperty("MobileNumber");
			
		//return p;
			
			FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\properties\\EmailLoginTest.properties");  
		      
		   Properties p=new Properties();  
		   p.load(reader);  
		    
		    return p;
		      
		  //  System.out.println(p.getProperty("user"));  
		   // System.out.println(p.getProperty("password"));  
              
	}
		public  String getmobileno() throws IOException
		{
			return getpropertyObject().getProperty("MobileNumber");
		}
		
}

