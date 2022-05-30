package pageObject;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidS9TruckCategory {
	
	public static void truckType(AndroidDriver<AndroidElement> driver) throws InterruptedException

	{
   
		Thread.sleep(3000);
		driver.findElementById("com.s9truck.customer:id/imgTruck").click();
		}
	
	public static void truckWeight(AndroidDriver<AndroidElement> driver) throws InterruptedException

	{
   
		
		driver.findElementById("com.s9truck.customer:id/spinnerWeight").click();

		
		List<AndroidElement>	tons= driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView");
		 
		
		 int totaltons =	driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView").size();
		
			 for(int i=0; i<totaltons; i++)
		{
		String weight=	driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView").get(i).getText();
			if(weight.equalsIgnoreCase("10 Ton"))
			{
		
		
				driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView").get(i).click();
				break;
			}
			}
			 
			 
				driver.findElementById("com.s9truck.customer:id/txtPickupDate").click();
				driver.findElementByAccessibilityId("15 May 2022").click();
				driver.findElementById("android:id/button1").click();
				driver.findElementById("com.s9truck.customer:id/btnSearch").click();



				
                    
	}
	
	public static void dateSelect(AndroidDriver<AndroidElement> driver) throws InterruptedException

	{
                Thread.sleep(3000);
				driver.findElementById("com.s9truck.customer:id/txtPickupDate").click();
				driver.findElementByAccessibilityId("15 May 2022").click();
				driver.findElementById("android:id/button1").click();
				driver.findElementById("com.s9truck.customer:id/btnSearch").click();
                  
	}
	}
