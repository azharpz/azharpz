package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidBottomMenu;
import pageObject.AndroidProfilePage;
import resources.AndroidLaunch;

public class AndroidProfileTest extends AndroidLaunch  {

	@Test
	public  void getProfile() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		AndroidProfilePage pp = new AndroidProfilePage();

		
		AndroidBottomMenu.account(driver);
		AndroidProfilePage.getPersonnaldetails(driver);
		AndroidProfilePage.getbillingdetails(driver);
		AndroidProfilePage.getprofileimage(driver);


		
    }	
	}