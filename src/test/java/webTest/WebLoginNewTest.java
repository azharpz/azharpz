package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObject.WebLogin;
import pageObject.WebLoginNew;
import pageObject.WebPickupdate;
import pageObject.WebSearchTruck;
import pageObject.WebSelectCity;
import pageObject.WebTruckCategory;
import pageObject.WebTruckWeight;
import resources.WebLaunch;

public class WebLoginNewTest extends WebLaunch{
	
	@Test
	public  void login() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 WebLoginNew login = PageFactory.initElements(driver, WebLoginNew.class);
		 
		


        login.login(driver);
		 
		
		
		
		
	}
	

}
