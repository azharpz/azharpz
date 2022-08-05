package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidBottomMenu;
import pageObject.AndroidCreateRoutePage;
import pageObject.AndroidDriverProfilePage;
import pageObject.AndroidProfilePage;
import resources.DriverAppLaunch;

public class AndroidDriverCreateRouteTest  extends DriverAppLaunch  {

	@Test
	public  void getProfile() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//AndroidCreateRoutePage pp = new AndroidCreateRoutePage();
		//AndroidCreateRoutePage cr = PageFactory.initElements(driver, AndroidCreateRoutePage.class);

		
		AndroidCreateRoutePage.EnableOnline(driver);
		//AndroidCreateRoutePage.Routeldetails(driver);
		//AndroidCreateRoutePage.SelecttDate(driver);
		//AndroidCreateRoutePage.Pricedetails(driver);
		//cr.CreateRoute(driver);


		
    }	
	}