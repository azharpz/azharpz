package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidLaunch extends MobileData {
	
	

	private static AndroidDriver driver;

	@SuppressWarnings("rawtypes")
	public static AndroidDriver capabilities() throws IOException {
		// TODO Auto-generated method stub
		
		 DesiredCapabilities capability=new DesiredCapabilities();
			//AndroidDriver<AndroidElement>  driver=capabilities();




		    capability.setCapability(MobileCapabilityType.DEVICE_NAME, getdevice());
		    capability.setCapability(MobileCapabilityType.PLATFORM, "Android");
		    capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, getversion());
		 capability.setCapability("automationName", "UiAutomator2");
		// capability.setCapability("noSign", "true");
		capability.setCapability("noReset", "true");
	   capability.setCapability("appPackage", "com.s9truck.customer");
	capability.setCapability("appActivity", "com.s9truck.customer.ui.activities.SplashActivity");


		//  capability.setCapability("appPackage", "com.hss.android.viaetruck");


		//	capability.setCapability("appActivity", "com.hss.android.viaetruck.activity.SplashScreen");
			
			
			AndroidDriver driver1=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    return driver1;
	   
	}
	
	public static  String getdevice() throws IOException
	{
		return getpropertyObject().getProperty("devicename");
	}


	public static  String getversion() throws IOException
	{
		return getpropertyObject().getProperty("version");
	}

	
	

}
