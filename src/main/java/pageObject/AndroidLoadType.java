package pageObject;

import io.appium.java_client.android.AndroidDriver;

public class AndroidLoadType {
	
	public static void loadType(AndroidDriver driver) throws InterruptedException

	{
   
		
		driver.findElementById("com.hss.android.viaetruck:id/autocomplete_loadType").sendKeys("test");
		driver.findElementById("com.hss.android.viaetruck:id/edt_lengthLoad").sendKeys("5");
		driver.findElementById("com.hss.android.viaetruck:id/edt_breadthLoad").sendKeys("5");
		driver.findElementById("com.hss.android.viaetruck:id/edt_heightLoad").sendKeys("5");
		driver.findElementById("com.hss.android.viaetruck:id/edt_weightLoad").sendKeys("5");
		driver.findElementById("com.hss.android.viaetruck:id/edt_packagesLoad").sendKeys("5");
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView").click();
        Thread.sleep(2000);
		driver.findElementById("com.hss.android.viaetruck:id/btn_addLoad").click();
		driver.findElementById("com.hss.android.viaetruck:id/linear_todayLoad").click();


	}
	
	
}
