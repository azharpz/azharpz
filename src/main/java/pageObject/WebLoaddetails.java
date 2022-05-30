package pageObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class WebLoaddetails {
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

static SoftAssert softAssert=new SoftAssert()	;	

public void loaddetails(WebDriver driver) throws InterruptedException

{

 
   driver.findElement(By.xpath("//button[.='Commercial'] ")).click();
	driver.findElement(By.xpath("//span[.='Select Material']")).click();

   Thread.sleep(3000);
   int	commercialtypes= driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).size();

   System.out.println("no of commercialtypes is   "  + commercialtypes);
   
  
	 driver.findElements(By.xpath("//mat-option[contains(@aria-disabled,'false')] ")).get(2).click();
	 
     driver.findElement(By.xpath("//button[.='Next'] ")).click();







              
}


}
