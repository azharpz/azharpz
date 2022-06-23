package pageObject;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class WebTruckCategory {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void trucktype(WebDriver driver) throws InterruptedException
	
	{

	 driver.findElement(By.xpath("//span[.='Truck Category']")).click();
	 Thread.sleep(3000);
	 
	 List<WebElement>	truck=  driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')]"));
	 Iterator<WebElement> itr=truck.iterator();
	 int i=1;
	 String value="";
	 while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getText();
		 System.out.println("name of truck is   "  + value);
	 }

	 
	 
	 
	 int	trucktypes= driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).size();

     System.out.println("no of truck is   "  + trucktypes);
     
   //  String trucknames=	driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(trucktypes).getText();
     
  
   // System.out.println("name of truck is   "  + trucknames);


	 driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(1).click();
	
	              
}

}
