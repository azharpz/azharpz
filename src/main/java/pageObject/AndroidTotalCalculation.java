package pageObject;

import io.appium.java_client.android.AndroidDriver;

public class AndroidTotalCalculation {
	
	public static void totalCalculation(AndroidDriver driver)

	{
   
		        String actualtotalprice=driver.findElementById("com.hss.android.viaetruck:id/txt_price_value").getText();
		      //  String[] strArray = totalprice.split("₹");
		    	
		     //   String tax1value = strArray[1].trim();
		     //   int taxonevalue = (int) Float.parseFloat(tax1value);
		        
		      
			//	Assert.assertEquals(text, "BTM");
		        System.out.println("actualtotalprice  "  + actualtotalprice);
		        

		        String estprice=driver.findElementById("com.hss.android.viaetruck:id/txt_est_price").getText();
		        String[] strArray = estprice.split("₹");
		    	
		        String estprices = strArray[1].trim();
		        int estamount = (int) Float.parseFloat(estprices);
		        
//		    	Assert.assertEquals(text, "BTM");
		        System.out.println("estimateprice  "  + estamount);
		        
		        String tax=driver.findElementById("com.hss.android.viaetruck:id/txt_est_price").getText();
		        String[] strArray1 = tax.split("₹");
		    	
		        String totaltax = strArray[1].trim();
		        int totaltax1 = (int) Float.parseFloat(totaltax);
		        
		      
			//	Assert.assertEquals(text, "BTM");
		        System.out.println("actualtotaltax is  "  + totaltax1);
		        
		        int expectedtotalprice = estamount+totaltax1;
		    	System.out.println("expectedtotalprice is  "  + expectedtotalprice);
		    	
				driver.findElementById("com.hss.android.viaetruck:id/btn1").click();
				
		        String actualthirtypercent=driver.findElementById("com.hss.android.viaetruck:id/txt_pay_amount").getText();
                String[] strArray2 = actualthirtypercent.split("₹");
		    	
		        String actualthirtypercents = strArray[1].trim();
		        int actualthirtypercentss = (int) Float.parseFloat(actualthirtypercents);
		        
		      
			//	Assert.assertEquals(text, "BTM");
		        System.out.println("actualthirtypercent is  "  + actualthirtypercentss);
		        
		        int expectedthirtypercentage =expectedtotalprice*30/100 ;
		        System.out.println("Expected seventypercentage  is"  +expectedthirtypercentage);
		        
		        
		        int tax1 =estamount*12/100 ;
		        System.out.println("Expected tax1  is"  +tax1);

		        
		        int tax2 =estamount*3/100 ;
		        System.out.println("Expected tax2  is"  +tax2);
		        
		        int expectedtotaltax = tax1+tax2;
		    	System.out.println("expectedexpectedtotaltax is  "  + expectedtotaltax);

		    	 
		        
		        
		        
	}
	

}
