package pageObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.MobileData;

public class AndroidS9Loadategory extends MobileData {
	
	
	
	public static void tloadSelection(AndroidDriver<AndroidElement> driver) throws InterruptedException

	{
   
		
		driver.findElementById("com.s9truck.customer:id/spinnerWeight").click();

		
		List<AndroidElement>	tons= driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView");
		 
		 Iterator<AndroidElement> itr=tons.iterator();
		 int i=1;
		 String value="";
		 while(itr.hasNext())
		 {
			 AndroidElement element=itr.next();
			 value=element.getText();
			 System.out.println("name of truckwight is   "  + value);
		 }
		 
		 
		
		
		
		 int totaltons =	driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView").size();
		
			 for(int j=0; j<totaltons; j++)
		{
		String weight=	driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView").get(j).getText();
			if(weight.equalsIgnoreCase("10 Ton"))
			{
		
		
				driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView").get(j).click();
				break;
			}
			}
	}
			 
			
	
	public static  String getdate() throws IOException
	{
		return getpropertyObject().getProperty("PickDate");
	}
	}
