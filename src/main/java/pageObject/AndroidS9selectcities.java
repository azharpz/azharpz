package pageObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.MobileData;

public class AndroidS9selectcities extends MobileData {

	public static void fromCity(AndroidDriver<AndroidElement> driver) throws IOException

	{
   
		driver.findElementById("com.s9truck.customer:id/layout_pickup_location").click();
			driver.findElementById("com.s9truck.customer:id/places_autocomplete_search_bar").sendKeys(getfromcity());
			//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();
			List<AndroidElement>	fromcity= driver.findElementsById("com.s9truck.customer:id/places_autocomplete_list");

			
		//	com.s9truck.customer:id/places_autocomplete_list
			 
			 Iterator<AndroidElement> itr=fromcity.iterator();
			 int i=1;
			 String value="";
			 while(itr.hasNext())
			 {
				 AndroidElement element=itr.next();
				 value=element.getText();
				 System.out.println("name of city is   "  + value);
			 }
				
             int fromcitycount= fromcity.size();

              System.out.println(fromcitycount);

              fromcity.get(fromcitycount-1).click();
              
      		driver.findElementById("com.s9truck.customer:id/btnConfirmLocation").click();


	                              
	}
	
	public static void toCity(AndroidDriver driver) throws InterruptedException, IOException

	{
   
		driver.findElementById("com.s9truck.customer:id/txtDropLocation").click();
		driver.findElementById("com.s9truck.customer:id/places_autocomplete_search_bar").sendKeys(gettocity());
		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();
		List<AndroidElement>	tocity= driver.findElementsById("com.s9truck.customer:id/places_autocomplete_list");
		
		
		 
		 Iterator<AndroidElement> itr=tocity.iterator();
		 int i=1;
		 String value="";
		 while(itr.hasNext())
		 {
			 AndroidElement element=itr.next();
			 value=element.getText();
			 System.out.println("name of tocity is   "  + value);
		 }
			
         int fromcitycount= tocity.size();

          System.out.println(fromcitycount);

          tocity.get(fromcitycount-1).click();
    		driver.findElementById("com.s9truck.customer:id/btnConfirmLocation").click();


	}
	public static   String getfromcity() throws IOException
	{
		return getpropertyObject().getProperty("fromcity");
	}
	
	public static String gettocity() throws IOException
	{
		return getpropertyObject().getProperty("tocity");
	}
	
}

