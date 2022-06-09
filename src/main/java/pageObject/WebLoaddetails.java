package pageObject;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class WebLoaddetails {
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

static SoftAssert softAssert=new SoftAssert()	;	

public void loaddetails(WebDriver driver) throws InterruptedException

{

 
   driver.findElement(By.xpath("//button[.='Commercial'] ")).click();
	driver.findElement(By.xpath("//span[.='Select Material']")).click();

   Thread.sleep(3000);
   List<WebElement>	load=  driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')]"));
	 Iterator<WebElement> itr=load.iterator();
	 int i=1;
	 String value="";
	 while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getText();
		 System.out.println("name of load is   "  + value);
	 }

   
   
   
   int	commercialtypes= driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).size();

   System.out.println("no of commercialkoad is   "  + commercialtypes);
   
  
	 driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(1).click();
	 
     driver.findElement(By.xpath("//button[.='Next'] ")).click();







              
}


}
