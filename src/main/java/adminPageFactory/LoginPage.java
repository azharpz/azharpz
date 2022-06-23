package adminPageFactory;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import resources.AdminData;

public class LoginPage extends AdminData{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="(//input[@aria-required='true'])[1]") 
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']") 
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Login']") 
	WebElement submitlogin;
	
	@FindBy(xpath="//a[@aria-haspopup='true']") 
	static  WebElement   usernamedisplay;
	
	

	
public void Enterlogincredential(WebDriver driver) throws InterruptedException, IOException

       
	
	{
    
	Thread.sleep(10000);

	username.sendKeys(getusername());
	password.sendKeys(getpassword());

}


public void Submitlogin(WebDriver driver) throws InterruptedException, IOException

{

	submitlogin.click();
    
}


public void Verifyusername(WebDriver driver) throws InterruptedException, IOException

{

	
    Thread.sleep(10000);
   String userid = usernamedisplay.getText();


    System.out.println("username is   "  + userid);
   softAssert.assertEquals(userid, "Hi");
   
 
}

public  String getusername() throws IOException
{
	return getpropertyObject().getProperty("username");
}

public  String getpassword() throws IOException
{
	return getpropertyObject().getProperty("password");
}

}
