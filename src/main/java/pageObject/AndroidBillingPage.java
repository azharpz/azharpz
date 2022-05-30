package pageObject;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class AndroidBillingPage {
	
	
	public static void taxType(AndroidDriver driver)

	{
   
		driver.findElementById("com.hss.android.viaetruck:id/chk_consigner").click();
		String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Get a Quote\").instance(0))";
		driver.findElementById("com.hss.android.viaetruck:id/linear_getAQuote").click();
		  String text=driver.findElementById("com.hss.android.viaetruck:id/dialog_txt").getText();
		//	Assert.assertEquals(text, "BTM");
	        System.out.println("quote created  "  + text);
		driver.findElementById("com.hss.android.viaetruck:id/dialog_btn").click();


	}
	
	public static void toCity(AndroidDriver driver)

	{
   
		driver.findElementById("com.hss.android.viaetruck:id/dropLocation_txt").click();
			driver.findElementById("com.hss.android.viaetruck:id/places_autocomplete_search_bar").sendKeys("ong");
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();

	}

}
