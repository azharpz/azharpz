package pageObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class WebLogin {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void login(WebDriver driver) throws InterruptedException
	
	{

	driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys("9487122244");
	driver.findElement(By.xpath("//button[.='Send OTP ']")).click();
	Thread.sleep(10000);
    String  username=	driver.findElement(By.xpath("//span[contains(@style,'text-transform: capitalize;')]")).getText();

    System.out.println("username is   "  + username);
    softAssert.assertEquals(username, "azharios");




	 

	}
	

}
