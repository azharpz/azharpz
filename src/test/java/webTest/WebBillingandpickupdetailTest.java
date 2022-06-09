package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.WebBillinganddetailsPages;
import pageObject.WebLoaddetails;
import pageObject.WebLogin;
import pageObject.WebPickupdate;
import pageObject.WebSearchTruck;
import pageObject.WebSelectCity;
import pageObject.WebTripsPage;
import pageObject.WebTruckCategory;
import pageObject.WebTruckWeight;
import pageObject.WebTruckdetailsreview;
import resources.WebLaunch;

public class WebBillingandpickupdetailTest extends WebLaunch{
	
	@Test
	public  void loaddetails() throws IOException, InterruptedException 
    {
	
		WebDriver driver=capabilities();
		 WebSelectCity   homepage = new  WebSelectCity  ();
		 WebPickupdate   dateselection = new  WebPickupdate  ();
		 WebTruckCategory   truckselection = new  WebTruckCategory  ();
		 WebTruckWeight   truckweight = new  WebTruckWeight  ();
		 WebSearchTruck   searchtruck = new  WebSearchTruck  ();
		 WebLogin   login = new  WebLogin  ();
		 WebTruckdetailsreview   gettruckdetails = new  WebTruckdetailsreview  ();
		 WebLoaddetails   loadselection = new  WebLoaddetails  ();
		 WebBillinganddetailsPages   review = new  WebBillinganddetailsPages  ();
		 WebTripsPage   trips = new  WebTripsPage  ();





		 
		 
		 homepage.fromCity(driver);
		 homepage.toCity(driver);
		 dateselection.pickupDate(driver);
		 truckselection.trucktype(driver);
		 truckweight.truckWeight(driver);
		 searchtruck.searchTruck(driver);
		 login.login(driver);
		 gettruckdetails.gettruckdetails(driver);
		 loadselection.loaddetails(driver);
		 review.pickupDetails(driver);
		 review.priceDetails(driver);
		 trips.allTrips(driver);
		 
		
		
		
		
	}
	

}
