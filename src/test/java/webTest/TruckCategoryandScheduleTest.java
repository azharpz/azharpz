package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.PickupandDropDetails;
import pageObject.SelectCity;
import pageObject.TruckCategoryandSchedule;
import resources.WebLaunch;

public class TruckCategoryandScheduleTest extends WebLaunch{
	
	@Test
	public  void TC_1_PickupandDropVerify() throws IOException, InterruptedException 
    {
	
		WebDriver driver=capabilities();
		SelectCity   homepage = new  SelectCity  ();
		homepage.fromCity(driver);
		homepage.toCity(driver);
		homepage.requestaQuote(driver);
		PickupandDropDetails   bookingpage = new  PickupandDropDetails  ();
		bookingpage.pickupCity(driver);
		//bookingpage.dropCity(driver);
		bookingpage.next(driver);
		//bookingpage.viewpickupCity(driver);
		TruckCategoryandSchedule   truckpage = new  TruckCategoryandSchedule  ();
		truckpage.truckSelection(driver);
		truckpage.trucktypeSelection(driver);
		truckpage.dateSelection(driver);
		truckpage.timeSelection(driver);
		truckpage.next(driver);
		
		
    }	
	}