package pageObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.MobileData;

public class AndroidDriverFareBrakeupPage extends MobileData {
	static SoftAssert softAssert=new SoftAssert()	;

	public static void ReviewRouteDetails(AndroidDriver<AndroidElement> driver) throws IOException

	{
   
		    String fromcity=driver.findElementById("com.s9truck.driver:id/txtFrom").getText();
		//   softAssert.assertEquals(fromcity,getfromcity());
	        System.out.println("selected fromcity displayed as  "  + fromcity);
	        
	        String tocity=driver.findElementById("com.s9truck.driver:id/txtTo").getText();
	     //  softAssert.assertEquals(tocity,gettocity());
	        System.out.println("selected tocity displayed as  "  + tocity);
	        
	        
	        String date=driver.findElementById("com.s9truck.driver:id/txtDate").getText();
		//	Assert.assertEquals(tocity,gettocity());
	        System.out.println("selected date displayed as  "  + date);
	        
	        String truck=driver.findElementById("com.s9truck.driver:id/txtTruckNum").getText();
			//Assert.assertEquals(tocity,gettocity());
	        System.out.println("selected truck displayed as  "  + truck);
	                              
	}
	
	public static void farebrakeup(AndroidDriver driver) throws InterruptedException, IOException

	{
   
		  String actualroutefare=driver.findElementById("com.s9truck.driver:id/txtRouteFare").getText();
	      //  String[] strArray = totalprice.split("₹");
	    	
	     //   String tax1value = strArray[1].trim();
	      int actualroutefares = (int) Float.parseFloat(actualroutefare);
	        
	      
		//	
	        System.out.println("actualroutefare  "  + actualroutefares);
	       softAssert.assertEquals(actualroutefares, gettruckprice());
	        
			
	        
	        String tax2=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[3]").getText();
			  int taxtwovalue = (int) Float.parseFloat(tax2); 
			  System.out.println("tax2 "  + taxtwovalue);

	        
	        int tax2percentage =actualroutefares*5/100 ;
	        System.out.println("Expected tax2percentage  is"  +tax2percentage);
	        
	        String tax1=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[3]").getText();
			  int taxtonealue = (int) Float.parseFloat(tax1); 
			  System.out.println("tax1 "  + taxtonealue);
	        
	        int totaltax =taxtwovalue+taxtonealue ;
	        System.out.println("Expected totaltax deduction  is"  +totaltax);
	        
	        int totalfare =actualroutefares-totaltax ;
	        System.out.println("Actual totalfare  is"  +totalfare);
	        
	        String exproutefare=driver.findElementById("com.s9truck.driver:id/txtTotalFare").getText();
		      //  String[] strArray = totalprice.split("₹");
		    	
		     //   String tax1value = strArray[1].trim();
		      int exproutefares = (int) Float.parseFloat(exproutefare);
		        
		      
			//	
		        System.out.println("exproutefares  "  + exproutefares);

		       // softAssert.assertAll();
	}
	
public static void CreateRoute(AndroidDriver driver) throws InterruptedException, IOException

     
	
	{

	driver.findElementById("com.s9truck.driver:id/chkTerms").click();	

	Thread.sleep(2000);

	String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Create Route\").instance(0))";

	driver.findElementByAndroidUIAutomator(scrollElement).click();	
	
	
	

	//price.sendKeys(getprice());


}


public static void Returntohomepage(AndroidDriver<AndroidElement> driver) throws IOException

{

	    String toastmsg=driver.findElementById("com.s9truck.driver:id/txtBooking").getText();
	
        System.out.println("toastmsg displayed as  "  + toastmsg);
        softAssert.assertEquals(toastmsg,"Waiting for bookings");
        
   
                              
}

	public static   String getfromcity() throws IOException
	{
		return getpropertyObject().getProperty("fromcity");
	}
	
	public static String gettocity() throws IOException
	{
		return getpropertyObject().getProperty("tocity");
	}
	public static  String getdate() throws IOException
	{
		return getpropertyObject().getProperty("PickDate");
	}
	public static  String gettruckprice() throws IOException
	{
		return getpropertyObject().getProperty("TruckPrice");
	}
}


