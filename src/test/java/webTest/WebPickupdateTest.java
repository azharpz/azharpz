package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.PickupandDropDetails;
import pageObject.SelectCity;
import pageObject.WebPickupdate;
import pageObject.WebSelectCity;
import resources.WebLaunch;

public class WebPickupdateTest extends WebLaunch{
	
	@Test
	public  void Pickupdate() throws IOException, InterruptedException 
    {
	
		WebDriver driver=capabilities();
		 WebSelectCity   homepage = new  WebSelectCity  ();
		 WebPickupdate   dateselection = new  WebPickupdate  ();

		 
		 
		 homepage.fromCity(driver);
		 homepage.toCity(driver);
		 dateselection.pickupDate(driver);
		
		
		
		
	}
	

}
