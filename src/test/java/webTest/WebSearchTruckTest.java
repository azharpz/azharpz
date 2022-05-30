package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.WebPickupdate;
import pageObject.WebSearchTruck;
import pageObject.WebSelectCity;
import pageObject.WebTruckCategory;
import pageObject.WebTruckWeight;
import resources.WebLaunch;

public class WebSearchTruckTest extends WebLaunch{
	
	@Test
	public  void Searchtruck() throws IOException, InterruptedException 
    {
	
		WebDriver driver=capabilities();
		 WebSelectCity   homepage = new  WebSelectCity  ();
		 WebPickupdate   dateselection = new  WebPickupdate  ();
		 WebTruckCategory   truckselection = new  WebTruckCategory  ();
		 WebTruckWeight   truckweight = new  WebTruckWeight  ();
		 WebSearchTruck   searchtruck = new  WebSearchTruck  ();



		 
		 
		 homepage.fromCity(driver);
		 homepage.toCity(driver);
		 dateselection.pickupDate(driver);
		 truckselection.trucktype(driver);
		 truckweight.truckWeight(driver);
		 searchtruck.searchTruck(driver);
		
		
		
		
	}
	

}