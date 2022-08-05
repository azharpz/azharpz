package pageObject;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TotalCalculation {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	

	
    
		
	

public int taxdetails(WebDriver driver) throws InterruptedException

{
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,450)", "");

	String tax1=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-visitor-booking[1]/div[2]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tr[2]/td[1]/ul[1]/li[1]/span[2]/label[1]")).getText();
   // System.out.println("tax1 displayed as  "  + tax1);

	String[] strArray = tax1.split("₹");
	
   String tax1value = strArray[1].trim();
   int taxonevalue = (int) Float.parseFloat(tax1value);
   
   System.out.println("Actual tax1 is displayed as  "  +taxonevalue);
	
   String tax2=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-visitor-booking[1]/div[2]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tr[2]/td[1]/ul[1]/li[2]/span[2]/label[1]")).getText();
   System.out.println("tax2 displayed as  "  + tax2);

	String[] strArray2 = tax2.split("₹");
	
	String tax2value = strArray2[1].trim();
	int taxtwovalue = (int)Float.parseFloat(tax2value);
	
	System.out.println("Actual tax2 is displayed as  "  +taxtwovalue);
	
	
	int expectedtaxtotal = taxonevalue+taxtwovalue;
	System.out.println("Expected taxtotal is  "  + expectedtaxtotal);
	 
	String taxtotal=driver.findElement(By.xpath("(//label[position()=1])[7]")).getText();

	String[] strArray3 = taxtotal.split("₹");
		
		
	String taxtotals = strArray3[1].trim();
	int taxtotalcalculation = (int) Float.parseFloat(taxtotals);
	
	System.out.println("Actual taxtotal displayed as  "  +taxtotalcalculation);
	 
	 
	softAssert.assertEquals(expectedtaxtotal, taxtotalcalculation);
	
	
	String estimateprice=driver.findElement(By.xpath("(//li[1]//span[2])[2]")).getText();
	//System.out.println("Expected estimateprice displayed as  "  +estimateprice);

	String[] strArray5 = estimateprice.split("₹");
		
	String estimate = strArray5[1].trim();
	int totalestimate = (int)Float.parseFloat(estimate);
		
	System.out.println("Expected estimateprice displayed as  "  +totalestimate);
		
	int tax1percentageof3 =totalestimate*3/100 ;
	System.out.println("Actual tax1  with 3%  is"  +tax1percentageof3);
	softAssert.assertEquals(tax1percentageof3, totalestimate);

	float tax2percentageof12 =totalestimate*12/100 ;
	System.out.println("Actual tax2  with 12%  is "  +tax2percentageof12);
	//softAssert.assertEquals(tax2percentageof12, totalestimate);

	
	int expectedtotalprice = totalestimate+expectedtaxtotal;
	System.out.println("expectedtotalprice is  "  + expectedtotalprice);

	return taxtwovalue;

	}



public void totalamount(WebDriver driver) throws InterruptedException

{

     String totalamounts=driver.findElement(By.xpath("//li[3]//span[2]")).getText();
   //System.out.println("totalamount displayed as  "  + totalamounts);
     String[] strArray = totalamounts.split("₹");

     String totalamount = strArray[1].trim();
 	 int totalprice = (int)Float.parseFloat(totalamount);

    // float totalprice = Float.parseFloat(totalamount);
	 System.out.println("Actual totalprice displayed as  "  +totalprice);
	
	
	 String distance=driver.findElement(By.xpath("(//span[position()=2])[12]")).getText();
	   //System.out.println("totalamount displayed as  "  + totalamounts);
	     String[] strArray1 = distance.split(":");

	     String estimatedistance = strArray1[1].trim();
	 //	 int actualestdistance = (int)Float.parseFloat(estimatedistance);

	    // float totalprice = Float.parseFloat(totalamount);
		 System.out.println("estimatedistance displayed as  "  +estimatedistance);
	
	}

public void next(WebDriver driver) throws InterruptedException

{
	Thread.sleep(2000);


driver.findElement(By.xpath("//button[contains(@class,'md-raised login_popup_button_book md-button md-ink-ripple marginleft55px')]")).click();


           
}
}










