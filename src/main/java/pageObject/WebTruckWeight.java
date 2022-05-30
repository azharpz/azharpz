package pageObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class WebTruckWeight {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void truckWeight(WebDriver driver) throws InterruptedException
	
	{

	driver.findElement(By.xpath("//span[.='Select Weight']")).click();
	 Thread.sleep(3000);
	 int	truckweight= driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).size();

     System.out.println("no of truckweight is   "  + truckweight);
     
   //  String trucknames=	driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(trucktypes).getText();
     
  
   // System.out.println("name of truck is   "  + trucknames);


	 driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(2).click();
	
	              
}


	
		
	
		
				




	

}
