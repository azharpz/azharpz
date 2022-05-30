package pageObject;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidHomePage {

	
	public static void voLogin(AndroidDriver<AndroidElement> driver) throws InterruptedException

	{

		
	
		driver.findElementById("com.hss.android.viaetruck:id/bookLayout").click();
		
		//String shgname=driver.findElementById("com.nrlm.vprp:id/txt_name").getText();
	//	Assert.assertEquals(shgname, "testvo3");
	//	System.out.println("shgname is"  + shgname);
	

		

	}

}