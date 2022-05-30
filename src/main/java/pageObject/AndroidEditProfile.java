package pageObject;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;

public class AndroidEditProfile {
	
static SoftAssert softAssert=new SoftAssert()	;

	
	public static void clickeditbutton(AndroidDriver driver) throws InterruptedException

	{
		
   
	            Thread.sleep(3000);	
		       driver.findElementById("com.s9truck.customer:id/txtEdit").click();
		        
		        
		       	}
	
	public static <AndroidElement> void editpersonnaldetail(AndroidDriver driver) throws InterruptedException

	{
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[1]/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.Spinner/android.widget.TextView").click();
	       
	        java.util.List options=driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout");
	       
	        System.out.println("Total number of options available in dropdown:"+options.size());
		        
		       	}
	
	public static void editimage(AndroidDriver driver) throws InterruptedException

	{
		
   
		       driver.findElementById("com.s9truck.customer:id/profileImage").click();

				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView").click();
			       Thread.sleep(5000);
   
				driver.findElementById("com.android.camera:id/v9_camera_picker").click();
			       Thread.sleep(5000);

				driver.findElementById("com.android.camera:id/v9_shutter_button_internal").click();
			       Thread.sleep(5000);
			       driver.findElementById("com.android.camera:id/intent_done_apply").click();
			       Thread.sleep(10000);

			   	String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"GST No.\").instance(0))";

				driver.findElementByAndroidUIAutomator(scrollElement).click();
				driver.findElementById("com.s9truck.customer:id/edtGst").clear();


				driver.findElementById("com.s9truck.customer:id/edtGst").sendKeys("Rashid");
				
				driver.findElementById("com.s9truck.customer:id/btnSave").click();
			       Thread.sleep(2000);

				String toastmessage=	 driver.findElementByXPath("//android.widget.Toast").getText();
				System.out.println(toastmessage);

		        
		       	}
	
	public static void updateprofile(AndroidDriver driver) throws InterruptedException

	{
		
   
		       driver.findElementById("com.s9truck.customer:id/txtEdit").click();
		        
		        
		       	}


}
