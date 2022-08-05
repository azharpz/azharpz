package pageObject;

import java.awt.Dimension;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidElement;

public class AndroidS9SliderPage {
static SoftAssert softAssert=new SoftAssert()	;

	
	public static void enabbleonline(AndroidDriver driver) throws InterruptedException

	{
		
   
	            Thread.sleep(2000);	
		        String status=driver.findElementById("com.s9truck.driver:id/txtOfflineStatus").getText();
		       softAssert.assertEquals(status, "OFFLINE");
		        System.out.println("driver status is   "  + status);
		        
	            Thread.sleep(5000);	

	           // MobileElement swt = (MobileElement)driver.findElementById("com.s9truck.driver:id/sliderOfflineButton");
	            
	        //    AndroidElement slider =(AndroidElement) driver.findElementById("com.s9truck.driver:id/sliderOfflineButton");
	           
		    //	Actions action = new Actions(driver);
		    	//slider.click();
		  //  action.moveToElement(slider, 0, 100).perform();
		    
		   // action.moveByOffset(0, 100).perform();
		    

	            driver.findElementById("com.s9truck.driver:id/layoutBottomSheet").click();
			String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Next\").instance(0))";
			driver.findElementByAndroidUIAutomator(scrollElement).click();	

		       
		        
		    	 
		        softAssert.assertAll();
		        
		        
	}
	
	public static void scroll(AndroidDriver driver) throws InterruptedException

	{
		
   
	            Thread.sleep(2000);	
		        String status=driver.findElementById("com.s9truck.driver:id/txtOfflineStatus").getText();
		       softAssert.assertEquals(status, "OFFLINE");
		        System.out.println("driver status is   "  + status);
		        
	            Thread.sleep(5000);	

	           // MobileElement swt = (MobileElement)driver.findElementById("com.s9truck.driver:id/sliderOfflineButton");
	            
	        //    AndroidElement slider =(AndroidElement) driver.findElementById("com.s9truck.driver:id/sliderOfflineButton");
	           
		    //	Actions action = new Actions(driver);
		    	//slider.click();
		  //  action.moveToElement(slider, 0, 100).perform();
		    
		   // action.moveByOffset(0, 100).perform();
		    

	            driver.findElementById("com.s9truck.driver:id/layoutBottomSheet").click();
			String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Next\").instance(0))";
			driver.findElementByAndroidUIAutomator(scrollElement).click();	

		       
		        
		    	 
		        softAssert.assertAll();
		        
		        
	}
}
