package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidDriverFareBrakeupPage;
import pageObject.AndroidS9CreateRoutePage;
import pageObject.AndroidS9selectcities;
import resources.AndroidLaunch;
import resources.DriverAppLaunch;

public class AndroidS9CreateRouteTest extends DriverAppLaunch  {

	@Test
	public  void createRoute() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		AndroidS9CreateRoutePage sc = new AndroidS9CreateRoutePage();

		
		AndroidS9CreateRoutePage.fromCity(driver);
		AndroidS9CreateRoutePage.toCity(driver);
		AndroidS9CreateRoutePage.Pricedetails(driver);
		AndroidS9CreateRoutePage.dateSelect(driver);
		AndroidS9CreateRoutePage.GoNext(driver);
		AndroidDriverFareBrakeupPage.ReviewRouteDetails(driver);
		AndroidDriverFareBrakeupPage.farebrakeup(driver);
		AndroidDriverFareBrakeupPage.CreateRoute(driver);
		AndroidDriverFareBrakeupPage.Returntohomepage(driver);

		

}
	

	}