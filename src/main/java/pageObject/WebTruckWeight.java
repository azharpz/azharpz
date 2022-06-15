package pageObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class WebTruckWeight {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void truckWeight(WebDriver driver) throws InterruptedException
	
	{

	driver.findElement(By.xpath("//span[.='Select Weight']")).click();
	 Thread.sleep(3000);
	 
	 
	 List<WebElement>	weight=  driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')]"));
	 Iterator<WebElement> itr=weight.iterator();
	 int i=1;
	 String value="";
	 while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getText();
		 System.out.println("name of truckwight is   "  + value);
	 }
	 
	 
	 int	truckweight= driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).size();

     System.out.println("no of truckweight is   "  + truckweight);
     
   //  String trucknames=	driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(trucktypes).getText();
     
  
   // System.out.println("name of truck is   "  + trucknames);


	 driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(2).click();
	
	              
}


	



	
		
		}
