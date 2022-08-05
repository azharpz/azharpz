package pageObject;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import resources.Data;

public class WebBillinganddetailsPages extends Data  {
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;
	
	
	 
	
	
public void priceDetails(WebDriver driver) throws InterruptedException, IOException

       
	
	{

	Thread.sleep(3000);
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,550)", "");
	
	String actualprice=driver.findElement(By.xpath("(//div[@class='card-details-right'])[1]")).getText();
	//System.out.println("Expected estimateprice displayed as  "  +estimateprice);

	String[] strArray5 = actualprice.split("₹");
		
	String estimate = strArray5[1].trim();
	int totalactualprice = (int)Float.parseFloat(estimate);
		
	System.out.println("actualprice displayed as  "  +totalactualprice);

		String tax1=driver.findElement(By.xpath("(//div[@class='card-details-right'])[3]")).getText();
	   // System.out.println("tax1 displayed as  "  + tax1);

		String[] strArray = tax1.split("₹");
		
	   String tax1value = strArray[1].trim();
	   int taxonevalue = (int) Float.parseFloat(tax1value);
	   
	   System.out.println("GST displayed as  "  +taxonevalue);
	   
	   float tax1percentageof12 =totalactualprice*12/100 ;
		System.out.println("GST displayed as  with 12%  is "  +tax1percentageof12);
		//softAssert.assertEquals(tax1percentageof12, taxonevalue);
		
		
		String tax2=driver.findElement(By.xpath("(//div[@class='card-details-right'])[2]")).getText();
		   // System.out.println("tax1 displayed as  "  + tax1);

			String[] strArray1 = tax2.split("₹");
			
		   String tax2value = strArray1[1].trim();
		   int tax2evalue = (int) Float.parseFloat(tax2value);
		   
		   System.out.println("Internet handling charges displayed as  "  +tax2evalue);
		   
		   double tax2percentageof2andhalf=totalactualprice*2.50/100 ;
			System.out.println("Internet handling charges displayed as  with 2.50%  is "  +tax2percentageof2andhalf);
		//	softAssert.assertEquals(tax2percentageof2andhalf, tax2evalue);
			
			
			String totalprice=driver.findElement(By.xpath("(//div[@class='card-details-right'])[4]")).getText();
			//System.out.println("Expected estimateprice displayed as  "  +estimateprice);

			String[] strArray7 = totalprice.split("₹");
				
			String totalprices = strArray7[1].trim();
			int totalamount = (int)Float.parseFloat(totalprices);
				
			System.out.println("totalamount displayed as  "  +totalamount);
			
			int expectedtotalamount = (int) (totalactualprice+tax1percentageof12+tax2percentageof2andhalf);
			System.out.println("expectedtotalamount displayed as  "  +expectedtotalamount);

			softAssert.assertEquals(expectedtotalamount, totalamount);
			
			String payingamount=driver.findElement(By.xpath("//div[@class='col-sm-6']//div[6]")).getText();
			//System.out.println("Expected estimateprice displayed as  "  +estimateprice);

			String[] strArray8 = payingamount.split("₹");
				
			String payingamounts = strArray8[1].trim();
			//String[] strArray9 = payingamounts.split("₹");
			int amounttobepaid = (int)Float.parseFloat(payingamounts);
				
			System.out.println("amounttobepaid displayed as  "  +amounttobepaid);
			
			
			float paidamountpercentageof20 =expectedtotalamount*20/100 ;
			System.out.println("Expected paid  displayed as  with 20%  is "  +paidamountpercentageof20);
			
			
			String balanceamount=driver.findElement(By.xpath("(//span[position()=2])[13]")).getText();
			//System.out.println("Expected estimateprice displayed as  "  +estimateprice);

			String[] strArray9 = balanceamount.split("₹");
				
			String balance = strArray9[1].trim();
			//String[] strArray9 = payingamounts.split("₹");
			//int balanceprice = (int)Float.parseFloat(balance);
			//String[] strArray91 = balance.split("will");
			//String balances = strArray91[1].trim();
		//	int balanceprice = (int)Float.parseFloat(balances);


				
			System.out.println("balanceamount displayed as  "  +balance);
			Thread.sleep(3000);
			
		     driver.findElement(By.xpath("//label[@for='mat-checkbox-1-input']//span[@class='mat-checkbox-inner-container'] ")).click();
		     driver.findElement(By.xpath("//label[@for='mat-checkbox-2-input']//span[@class='mat-checkbox-inner-container'] ")).click();
		     
		     driver.findElement(By.xpath("//button[normalize-space()='Pay Now']")).click();


			
			
			
		
	  
		return ;


	}


public void pickupDetails(WebDriver driver) throws InterruptedException, IOException



{

Thread.sleep(3000);
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,450)", "");


		
driver.findElement(By.xpath("//input[@data-placeholder='Pickup Name*']")).sendKeys(pickup());
driver.findElement(By.xpath("//input[@formcontrolname='pickupMobile']")).sendKeys(pickupnumber());
driver.findElement(By.xpath("//input[@data-placeholder='Dropup Name*']")).sendKeys(drop());
driver.findElement(By.xpath("//input[@formcontrolname='dropupMobile']")).sendKeys(dropupnumber());

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,150)", "");



}

	
	
	
		public  String pickup() throws IOException
		{
			return getpropertyObject().getProperty("pickupname");
		}
		
		public  String pickupnumber() throws IOException
		{
			return getpropertyObject().getProperty("pickupnumber");
		}
		
		public  String drop() throws IOException
		{
			return getpropertyObject().getProperty("dropupname");
		}
		
		
		
		public  String dropupnumber() throws IOException
		{
			return getpropertyObject().getProperty("dropupnumber");
		}
		
}




