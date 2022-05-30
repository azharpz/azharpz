package androidTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.serverevents.ServerEvents;
import pageObject.AndroidHomePage;
import pageObject.AndroidLoginPage;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.PickupandDropDetails;
import pageObject.SelectCity;
import pageObject.TruckCategoryandSchedule;
import resources.AndroidLaunch;
import resources.WebLaunch;

public class AndroidLoginTest extends AndroidLaunch  {

	@Test
	public  void homePage() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		AndroidLoginPage al = new AndroidLoginPage();
		al.androidLogin(driver);

		
    }	
	}