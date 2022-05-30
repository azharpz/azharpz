package pageObject;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class PickupandDropDetails {

	
		private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

		static SoftAssert softAssert=new SoftAssert()	;	
		
	public void pickupCity(WebDriver driver) throws InterruptedException
		
		{
		Thread.sleep(3000);
		// driver.findElement(By.id("mat-input-23")).clear();;

		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-visitor-booking[1]/div[2]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("periamet");

		//String pickupcity = driver.findElement(By.id("mat-input-24")).getText();

		//softAssert.assertEquals(pickupcity, "Chennai");
		//.out.println("pickupcity is" + pickupcity);
		
		//String pickupstate = driver.findElement(By.id("mat-input-25")).getText();

		//softAssert.assertEquals(pickupstate, "Tamil Nadu");
		//System.out.println("pickupstate is" + pickupstate);
	 
	   // driver.findElement(By.id("mat-input-27")).sendKeys("college");
                         
	    }
	public void viewpickupCity(WebDriver driver) throws InterruptedException
	
	{
	Thread.sleep(3000);
	
	String pickupcity = driver.findElement(By.xpath("//div[@class='halfwidth liskan ng-binding flex'][normalize-space()='Periyamet']")).getText();

	softAssert.assertEquals(pickupcity, "Periyamet");
	System.out.println("pickupcity is" + pickupcity);
	
	
                     
    }
	
	public void dropCity(WebDriver driver) throws InterruptedException
	
	{
	//driver.findElement(By.id("mat-input-51")).clear();;
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-visitor-booking[1]/div[2]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("andara");

		//String dropcitys = driver.findElement(By.xpath("//div[@class='halfwidth liskan ng-binding flex'][normalize-space()='Periyamet']")).getText();
	//String dropcity = driver.findElement(By.id("mat-input-52")).getText();

	//softAssert.assertEquals(dropcity, "Periyamet");
	//System.out.println("dropcity is" + dropcity);
	
	//String dropstate = driver.findElement(By.id("mat-input-52")).getText();

	//softAssert.assertEquals(dropstate, "Karnataka");
	//System.out.println("dropstate is" + dropstate);
 
    //driver.findElement(By.id("mat-input-55")).sendKeys("dargah");
               
    }
	
public void next(WebDriver driver) throws InterruptedException
	
	{
	
    driver.findElement(By.xpath("//div[@class='show_map_area_01_l pull-right pr-0']//button[@class='md-raised login_popup_button_book md-button md-ink-ripple']")).click();

               
    }
}
