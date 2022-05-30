package webTest;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import resources.WebLaunch;

public class EmailLoginTest extends WebLaunch 
{
	
	
@Test
	public  void TC_1_Login() throws IOException, InterruptedException 
    {
	
		WebDriver driver=capabilities();
		
		LoginPage loginpage = new LoginPage();
		loginpage.loginWindow(driver);
		loginpage.emailLogin(driver);
		loginpage.continueButton(driver);
		loginpage.password(driver);
		loginpage.clickonloginbutton(driver);
		loginpage.getTitle(driver);
		
		//LoginPage openpopup = new LoginPage();
		//LoginPage.loginWindow(driver);
		
		//LoginPage enteremail = new LoginPage();
		//LoginPage.emailLogin(driver);
		
		//LoginPage continuebutton = new LoginPage();
		//LoginPage.continueButton(driver);
		
		//LoginPage gettitle = new LoginPage();
		//LoginPage.getTitle(driver);

		
	}
	
						
}
