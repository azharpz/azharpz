package pageObject;

import io.appium.java_client.android.AndroidDriver;

public class AndroidSelectCity {
	
	
	public static void fromCity(AndroidDriver driver)

	{
   
		driver.findElementById("com.hss.android.viaetruck:id/pickUpLocation_txt").click();
			driver.findElementById("com.hss.android.viaetruck:id/places_autocomplete_search_bar").sendKeys("nel");
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();

	}
	
	public static void toCity(AndroidDriver driver)

	{
   
		driver.findElementById("com.hss.android.viaetruck:id/dropLocation_txt").click();
			driver.findElementById("com.hss.android.viaetruck:id/places_autocomplete_search_bar").sendKeys("ong");
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();

	}
	
}

