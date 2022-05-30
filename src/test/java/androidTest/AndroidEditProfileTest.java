package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidBottomMenu;
import pageObject.AndroidEditProfile;
import pageObject.AndroidProfilePage;
import resources.AndroidLaunch;

public class AndroidEditProfileTest extends AndroidLaunch  {

	@Test
	public  void getProfile() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		AndroidProfilePage pp = new AndroidProfilePage();
		AndroidEditProfile ep = new AndroidEditProfile();


		
		AndroidBottomMenu.account(driver);
		AndroidEditProfile.clickeditbutton(driver);
		//AndroidEditProfile.editpersonnaldetail(driver);
		AndroidEditProfile.editimage(driver);

	


		
    }	
	}