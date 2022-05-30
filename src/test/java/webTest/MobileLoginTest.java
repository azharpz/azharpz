package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObject.LoginPage;
import resources.WebLaunch;

public class MobileLoginTest extends WebLaunch 
{
	
	
@Test
	public  void TC_1_Login() throws IOException, InterruptedException 
    {
		
		WebDriver driver=capabilities();
		SoftAssert softAssert=new SoftAssert()	;	
		LoginPage loginpage = new LoginPage();
		loginpage.loginWindow(driver);
		loginpage.mobileLogin(driver);
		loginpage.continueButton(driver);
		loginpage.password(driver);
		loginpage.clickonloginbutton(driver);
		loginpage.getTitle(driver);

		
	}
	
						
}
