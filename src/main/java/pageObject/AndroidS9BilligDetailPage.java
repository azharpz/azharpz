package pageObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.MobileData;

public class AndroidS9BilligDetailPage extends MobileData {
	
	public static void pickupDetails(AndroidDriver<AndroidElement> driver) throws InterruptedException, IOException

	{
		
   
		Thread.sleep(2000);
		
	        
	        
        driver.findElementById("com.s9truck.customer:id/edtPickupName").sendKeys(getpickupname());
        
        driver.findElementById("com.s9truck.customer:id/edtPickupNumber").sendKeys(getpickupno());

                    		}
	
	public static void dropoffDetails(AndroidDriver<AndroidElement> driver) throws InterruptedException, IOException

	{
		
   
		Thread.sleep(2000);
		
	        
	        
        driver.findElementById("com.s9truck.customer:id/edtDropoffName").sendKeys(getdropoffname());
        
        driver.findElementById("com.s9truck.customer:id/edtDropoffNumber").sendKeys(getdropoffno());

                    		}
	
	public static void Gonext(AndroidDriver<AndroidElement> driver) throws InterruptedException, IOException

	{
		
   
		
	        
	        
	        driver.findElementById("com.s9truck.customer:id/btnNext").click();
		
	                              		}
	
	
	
	
	
	public static  String getpickupname() throws IOException
	{
		return getpropertyObject().getProperty("PickName");
	}
	

	public static  String getpickupno() throws IOException
	{
		return getpropertyObject().getProperty("PickNo");
	}
	
	public static  String getdropoffname() throws IOException
	{
		return getpropertyObject().getProperty("dropName");
	}
	

	public static  String getdropoffno() throws IOException
	{
		return getpropertyObject().getProperty("DropNo");
	}
	
	
	}
