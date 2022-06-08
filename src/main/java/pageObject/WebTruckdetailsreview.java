package pageObject;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import resources.WebLaunch;

public class WebTruckdetailsreview    {
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;
	  //WebDriver driver;

	


    FileInputStream reader;
    Properties p;
  //  String price=driver.findElement(By.xpath("//span[@class='truckPrice-area'] ")).getText();
	
    public void gettruckdetails(WebDriver driver) throws InterruptedException

{
	
	// this.driver = driver;

	Thread.sleep(7000);
     
    String pickupcity=	driver.findElement(By.xpath("(//p[position()=1])[2] ")).getText();
     
  
    System.out.println("name of pickupcity is   "  + pickupcity);
    
    
    String dropcity=	driver.findElement(By.xpath("(//p[position()=1])[3] ")).getText();
     
  
    System.out.println("name of dropcity is   "  + dropcity);
    
    String pickupdate=	driver.findElement(By.xpath("(//p[position()=1])[4] ")).getText();
    
    
    System.out.println("pickupdate is   "  + pickupdate);


   
    
    String truckweight=	driver.findElement(By.xpath("(//p[position()=1])[5] ")).getText();
    
    
    System.out.println("name of truckweight is   "  + truckweight);
    
    driver.findElement(By.xpath("//button[.='Next'] ")).click();
    
    
    String loaddate=	driver.findElement(By.xpath("//span[@class='right-top-area'] ")).getText();
    
    
    System.out.println("name of loaddate is   "  + loaddate);
    
   String loadweight=	driver.findElement(By.xpath("(//p[@class='m-0 color-black'] )[2]")).getText();
    
    
    System.out.println("name of loadweight is   "  + loadweight);
    
 String loadheight=	driver.findElement(By.xpath("//p[@class='m-0 color-black'] ")).getText();
    
    
    System.out.println("feet is   "  + loadheight);
    	
    softAssert.assertEquals(truckweight, loadweight);
    
   // ElementNames el=new ElementNames();
    
    
   String price=	driver.findElement(By.xpath("//span[@class='truckPrice-area'] ")).getText();

     
    System.out.println("price   "  +price);
     
     Thread.sleep(3000);
     
     driver.findElement(By.xpath("//div[@style='visibility: visible;'] ")).click();

     
     driver.findElement(By.xpath("//button[.='Next'] ")).click();

    
    

	              
}


}



