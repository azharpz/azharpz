package pageObject;

import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverMenuPage {

	public static void account(AndroidDriver driver)

	{

	
	  driver.findElementByAccessibilityId("Account").click();

	}
	
	public static void trips(AndroidDriver driver)

	{

	
	  driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Trips\"]/android.widget.FrameLayout/android.widget.ImageView").click();

	}
	
	public static void home(AndroidDriver driver)

	{

	
	  driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.FrameLayout/android.widget.ImageView").click();

	}
	



}
