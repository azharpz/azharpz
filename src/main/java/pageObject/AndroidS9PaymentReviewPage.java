package pageObject;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.MobileData;

public class AndroidS9PaymentReviewPage extends MobileData {
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
   
		  String actualroutefare=driver.findElementById("com.s9truck.customer:id/txtActualPrice").getText();
	    //   String[] strArray = actualroutefare.split(".");
	    	
	      //  String actualroutefares = strArray[1].trim();
	      int actualroutefaress = (int) Float.parseFloat(actualroutefare);
	        
	      
		//	
	        System.out.println("actualroutefare  "  + actualroutefaress);
	       softAssert.assertEquals(actualroutefaress, gettruckprice());
	        
			
	        
	        String tax1=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[3]").getText();
			  int taxonevalue = (int) Float.parseFloat(tax1); 
			  System.out.println("tax1 "  + taxonevalue);

	        
	        int tax1percentage =actualroutefaress*5/100 ;
	        System.out.println("Expected tax1percentage  is"  +tax1percentage);
	        
	        String tax2=driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[3]").getText();
			  int taxtwoalue = (int) Float.parseFloat(tax2); 
			  System.out.println("tax2 "  + taxtwoalue);
	        
	        int totaltax =taxtwoalue+taxonevalue ;
	        System.out.println("Expected totaltax   is"  +totaltax);
	        
	        int totalfare =actualroutefaress+totaltax ;
	        System.out.println("Actual totalfare  is"  +totalfare);
	        
	        String exproutefare=driver.findElementById("com.s9truck.customer:id/txtTotalAmount").getText();
		    //   String[] strArray1 = exproutefare.split(".");
		    	
		    //   String exproutefares = strArray[1].trim();
		      int exproutefaress = (int) Float.parseFloat(exproutefare);
		        
		      
			//	
		        System.out.println("exproutefares  "  + exproutefaress);
		        
		        
		        String amountpaid=driver.findElementByXPath("com.s9truck.customer:id/txtAmountToBePaid").getText();
				  int amountpaids = (int) Float.parseFloat(amountpaid); 
				  System.out.println("actual amountpaid "  + amountpaids);

		     
		     int expamountpaid =exproutefaress*20/100 ;
		     System.out.println("Expectedexpamountpaid  is"  +expamountpaid);

		       // softAssert.assertAll();
	}
	
public static void CreateQuote(AndroidDriver driver) throws InterruptedException, IOException

     
	
	{
	
	
	 

	driver.findElementById("com.s9truck.customer:id/chkBalanceAmount").click();	
	
    
    String ba=driver.findElementById("com.s9truck.customer:id/txtBalanceAmount").getText();
    String[] strArray = ba.split("amount");
	
    String actualbalance = strArray[1].trim();   
    
    System.out.println("actualbalance displayed as  "  + actualbalance);
	driver.findElementById("com.s9truck.customer:id/chkAgree").click();	

	Thread.sleep(2000);

	String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Proceed to payment\").instance(0))";

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


