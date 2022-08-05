package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidS9SliderPage;
import pageObject.AndroidS9selectcities;
import resources.AndroidLaunch;
import resources.DriverAppLaunch;

public class AndroidS9SliderTest extends DriverAppLaunch   {

	@Test
	public  void selectcities() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		AndroidS9SliderPage sc = new AndroidS9SliderPage();

		AndroidS9SliderPage.enabbleonline(driver);

}
	

	}
