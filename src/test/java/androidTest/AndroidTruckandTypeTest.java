package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidLoginPage;
import pageObject.AndroidSelectCity;
import pageObject.AndroidTruckCategoryandSchedule;
import resources.AndroidLaunch;

public class AndroidTruckandTypeTest extends AndroidLaunch  {

	@Test
	public  void TruckCategoryandType() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	
		AndroidTruckCategoryandSchedule tr = new AndroidTruckCategoryandSchedule();

        
		AndroidLoginPage.androidLogin(driver);
        AndroidSelectCity.fromCity(driver);
        AndroidSelectCity.toCity(driver);
        AndroidTruckCategoryandSchedule.truckCategory(driver);
        AndroidTruckCategoryandSchedule.truckType(driver);
        tr.dateSelection(driver);
        tr.timeSelection(driver);



		
    }	
	}