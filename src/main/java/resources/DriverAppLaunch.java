package resources;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverAppLaunch {

	private static AndroidDriver driver;

	@SuppressWarnings("rawtypes")
	public static AndroidDriver capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		 DesiredCapabilities capability=new DesiredCapabilities();
			//AndroidDriver<AndroidElement>  driver=capabilities();




		    capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi A3");
		    capability.setCapability(MobileCapabilityType.PLATFORM, "Android");
		    capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		 capability.setCapability("automationName", "UiAutomator2");
		// capability.setCapability("noSign", "true");
		capability.setCapability("noReset", "true");
	   capability.setCapability("appPackage", "com.s9truck.driver");
	capability.setCapability("appActivity", "com.s9truck.driver.ui.activities.SplashActivity");


		//  capability.setCapability("appPackage", "com.hss.android.viaetruck");


		//	capability.setCapability("appActivity", "com.hss.android.viaetruck.activity.SplashScreen");
			
			
			AndroidDriver driver1=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    return driver1;
	   
	}
	
	

}
