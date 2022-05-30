package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidLoginPage;
import pageObject.AndroidSelectCity;
import resources.AndroidLaunch;

public class AndroidPickupandDropTest extends AndroidLaunch  {

	@Test
	public  void TC_1_PickupandDropVerify() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		AndroidLoginPage al = new AndroidLoginPage();
		AndroidSelectCity pd = new AndroidSelectCity();
        
		al.androidLogin(driver);
        pd.fromCity(driver);
        pd.toCity(driver);
		
    }	
	}