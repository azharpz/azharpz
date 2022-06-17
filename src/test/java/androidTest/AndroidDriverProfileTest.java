package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidBottomMenu;
import pageObject.AndroidDriverMenuPage;
import pageObject.AndroidDriverProfilePage;
import pageObject.AndroidProfilePage;
import resources.AndroidLaunch;
import resources.DriverAppLaunch;

public class AndroidDriverProfileTest extends DriverAppLaunch  {

	@Test
	public  void getProfile() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		AndroidDriverProfilePage pp = new AndroidDriverProfilePage();

		
		AndroidBottomMenu.account(driver);
		AndroidProfilePage.getPersonnaldetails(driver);
		AndroidProfilePage.getbillingdetails(driver);
		AndroidProfilePage.getprofileimage(driver);


		
    }	
	}