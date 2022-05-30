package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.WebPickupdate;
import pageObject.WebSelectCity;
import pageObject.WebTruckCategory;
import resources.WebLaunch;

public class WebTruckCategoryTest extends WebLaunch{
	
	@Test
	public  void Selecttrucktype() throws IOException, InterruptedException 
    {
	
		WebDriver driver=capabilities();
		 WebSelectCity   homepage = new  WebSelectCity  ();
		 WebPickupdate   dateselection = new  WebPickupdate  ();
		 WebTruckCategory   truckselection = new  WebTruckCategory  ();


		 
		 
		 homepage.fromCity(driver);
		 homepage.toCity(driver);
		 dateselection.pickupDate(driver);
		 truckselection.trucktype(driver);
		
		
		
		
	}
	

}
