package pageObject;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import resources.Data;

public class WebLoginNew extends Data{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="//a[normalize-space()='Login / Signup']") 
	WebElement clickonlogin;
	
	@FindBy(xpath="//input[@id='mat-input-3']") 
	WebElement mobileNumber;
	
	@FindBy(how=How.XPATH,using="//button[.='Send OTP ']") 
	WebElement SendOTP;
	
	@FindBy(xpath="//span[contains(@style,'text-transform: capitalize;')]") 
	  WebElement  username;
	
	

	
public void login(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	clickonlogin.click();
	mobileNumber.sendKeys(getmobileno());
	SendOTP.click();
	Thread.sleep(10000);
	String userid = username.getText();


    System.out.println("username is   "  + userid);
    softAssert.assertEquals(userid, "azharios");
  


	}

public  String getmobileno() throws IOException
{
	return getpropertyObject().getProperty("MobileNumber");
}

}
