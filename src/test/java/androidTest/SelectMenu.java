package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidBottomMenu;
import pageObject.AndroidLoginPage;
import resources.AndroidLaunch;

public class SelectMenu extends AndroidLaunch  {

	@Test
	public  void selectAccount() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		AndroidBottomMenu al = new AndroidBottomMenu();
		AndroidBottomMenu.account(driver);

		
    }	
	}