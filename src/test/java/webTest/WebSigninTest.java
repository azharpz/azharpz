package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.WebLogin;
import pageObject.WebPickupdate;
import pageObject.WebSearchTruck;
import pageObject.WebSelectCity;
import pageObject.WebSignin;
import pageObject.WebTruckCategory;
import pageObject.WebTruckWeight;
import resources.WebLaunch;

public class WebSigninTest extends WebLaunch{
	
	@Test
	public  void signin() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 WebSignin   login = new  WebSignin  ();



		 login.signin(driver);		 
		
		
		
		
	}
	

}

