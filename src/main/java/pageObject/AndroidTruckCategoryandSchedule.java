package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidTruckCategoryandSchedule {
	
	
	public static void truckCategory(AndroidDriver driver)

	{
   
		
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout").click();

	}
	
	public static void truckType(AndroidDriver driver)

	{
   
		
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]").click();

	}
	
	public void dateSelection(AndroidDriver driver) throws InterruptedException

	{
	
		driver.findElementById("com.hss.android.viaetruck:id/linear_today").click();
Thread.sleep(2000);
	
	//List<AndroidElement>	dates=  driver.findElementsById("android:id/month_view");
		//int count= driver.findElementsById("android:id/month_view").size();
		
	//	for(int j=0; j<count; j++)
	//	{
	//	AndroidElement texts=	 (AndroidElement) driver.findElementsById("android:id/month_view").get(j);
		//	if(texts.equals("23"))
		//	{
			//	((AndroidElement) ((List<AndroidElement>) driver.findElementsById("android:id/month_view")).get(j)).click();
			//	break;
		//}

	                 
	//}
	// driver.findElementById("android:id/button2").click();
}
	public void timeSelection(AndroidDriver driver) 
	{
	
		//driver.findElementById("//android.widget.FrameLayout[@content-desc=\"Hours circular slider: 6\"]/android.view.View[4]").click();

		
	//	List<AndroidElement>	dates=  (List<AndroidElement>) driver.findElementsById("//android.widget.FrameLayout[@content-desc=\"Hours circular slider: 6\"]/android.view.View[4]");
		//	int count= driver.findElementsById("//android.widget.FrameLayout[@content-desc=\"Hours circular slider: 6\"]/android.view.View[4]").size();
			
		//	for(int j=0; j<count; j++)
		//	{
		//	AndroidElement texts=	 ((List<AndroidElement>) driver.findElementsById("android:id/month_view")).get(j);
			//	if(texts.equals("10"))
			//	{
			//		((AndroidElement) ((List<AndroidElement>) driver.findElementsById("//android.widget.FrameLayout[@content-desc=\"Hours circular slider: 6\"]/android.view.View[4]")).get(j)).click();
					//break;
				//}
		 driver.findElementById("com.hss.android.viaetruck:id/mdtp_ok").click();

	}

	                 
	
	
	public void ok(AndroidDriver driver)

	{
	
	 driver.findElementById("android:id/button2").click();
	 
	                 
	}

}
