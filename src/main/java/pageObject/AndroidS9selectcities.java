package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidS9selectcities {

	public static void fromCity(AndroidDriver<AndroidElement> driver)

	{
   
		driver.findElementById("com.s9truck.customer:id/layout_pickup_location").click();
			driver.findElementById("com.s9truck.customer:id/places_autocomplete_search_bar").sendKeys("kotamitta");
			//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();
			List<AndroidElement>	fromcity= driver.findElementsById("com.s9truck.customer:id/places_autocomplete_list");

			 
				
             int fromcitycount= fromcity.size();

              System.out.println(fromcitycount);

              fromcity.get(fromcitycount-1).click();

	                              
	}
	
	public static void toCity(AndroidDriver driver) throws InterruptedException

	{
   
		driver.findElementById("com.s9truck.customer:id/bottomSheetLayout").click();
		driver.findElementById("com.s9truck.customer:id/places_autocomplete_search_bar").sendKeys("Nellore");
		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView[1]").click();
		List<AndroidElement>	tocity= driver.findElementsById("com.s9truck.customer:id/places_autocomplete_list");
		 
			
         int fromcitycount= tocity.size();

          System.out.println(fromcitycount);

          tocity.get(fromcitycount-1).click();

	}
	
}

