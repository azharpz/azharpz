package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.Bredcrum;
import pageObject.WebSignin;
import pageObject.WebTripsPage;
import resources.WebLaunch;

public class WebTripListTest extends WebLaunch{
	
	@Test
	public  void signin() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 WebSignin   login = new  WebSignin  ();
		 Bredcrum   menu = new  Bredcrum  ();
		 WebTripsPage   trips = new  WebTripsPage  ();



		 login.signin(driver);	
		 menu.tripsSelection(driver);
		 trips.allTrips(driver);
		
		
		
		
	}
	

}

