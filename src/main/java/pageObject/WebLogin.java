package pageObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import resources.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;  


public class WebLogin extends Data{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;
	
	
	
	
public void login(WebDriver driver) throws InterruptedException, IOException

       
	
	{

	driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys(getmobileno());
	driver.findElement(By.xpath("//button[.='Send OTP ']")).click();
	Thread.sleep(10000);
    String  username=	driver.findElement(By.xpath("//span[contains(@style,'text-transform: capitalize;')]")).getText();

    System.out.println("username is   "  + username);
    softAssert.assertEquals(username, "azharios");




	 

	}

	
	
	
		public  String getmobileno() throws IOException
		{
			return getpropertyObject().getProperty("MobileNumber");
		}
		
}

