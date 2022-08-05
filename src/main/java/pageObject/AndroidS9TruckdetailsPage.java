package pageObject;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.MobileData;

public class AndroidS9TruckdetailsPage extends MobileData {
	
	public static void truckDetails(AndroidDriver<AndroidElement> driver) throws InterruptedException, IOException

	{
		
   
		Thread.sleep(3000);
		
	        
	        
	        String date=driver.findElementById("com.s9truck.customer:id/txtDate").getText();
		//	Assert.assertEquals(tocity,gettocity());
	        System.out.println("selected date displayed as  "  + date);
	        
	        String truckprice=driver.findElementById("com.s9truck.customer:id/txtPrice").getText();
	       // String[] strArray = truckprice.split(".");
	    	
		 //   String truckprices = strArray[1].trim();
		  //  int actualtruckprice = (int) Float.parseFloat(truckprices);
		        
		     
		        System.out.println("actualroutefare  "  + truckprice);
		//Assert.assertEquals(actualtruckprice,gettruckprice());
	                              		}
	
	public static void selecttrucks(AndroidDriver<AndroidElement> driver) throws InterruptedException, IOException

	{
		
   
		Thread.sleep(3000);
		
	        
	        
	        driver.findElementById("com.s9truck.customer:id/imgTruck").click();
		
	                              		}
	
	public static void truckWeights(AndroidDriver<AndroidElement> driver) throws InterruptedException

	{
   
		
		driver.findElementById("com.s9truck.customer:id/spinnerWeight").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();


		
	
				
                    
	}
	
	
	public static void truckWeight(AndroidDriver<AndroidElement> driver) throws InterruptedException

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
			if(weight.equalsIgnoreCase("32 Ton"))
			{
		
		
				driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView").get(j).click();
				break;
			}
			}
			 
			 
				//driver.findElementById("com.s9truck.customer:id/txtPickupDate").click();
				
				
				//driver.findElementByAccessibilityId("15 May 2022").click();
				//driver.findElementById("android:id/button1").click();
				//driver.findElementById("com.s9truck.customer:id/btnSearch").click();



				
                    
	}
	
	public static void dateSelect(AndroidDriver<AndroidElement> driver) throws InterruptedException, IOException

	{
                Thread.sleep(3000);
				driver.findElementById("com.s9truck.customer:id/txtPickupDate").click();
				
				// Thread.sleep(3000);
				//	List<AndroidElement>	tons= driver.findElementsByXPath("android:id/month_view");
				//	int count= driver.findElements(By.xpath("android:id/month_view")).size();
					
				//	for(int j=0; j<count; j++)
				//	{
					//String texts=	driver.findElements(By.xpath("android:id/month_view")).get(j).getText();
						//if(texts.equalsIgnoreCase(getdate()))
					//	{
						//	driver.findElements(By.xpath("android:id/month_view")).get(j).click();
						//	break;
						//}
					//	}   
					
				//	}

				driver.findElementByAccessibilityId(getdate()).click();
				driver.findElementById("android:id/button1").click();
				driver.findElementById("com.s9truck.customer:id/btnSearch").click();
                  
	}
	
	public static  String getdate() throws IOException
	{
		return getpropertyObject().getProperty("PickDate");
	}
	
	
	}
