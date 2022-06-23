package adminTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.LoginPage;
import pageObject.WebLoginNew;
import resources.AdminLaunch;

public class LoginTest extends AdminLaunch{
	
	@Test
	public  void login() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		 
		
          login.Enterlogincredential(driver);
          login.Submitlogin(driver);
          login.Verifyusername(driver);
		 
		
		
	}
	

}
