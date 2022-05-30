package pageObject;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class TruckCategoryandSchedule {
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void truckSelection(WebDriver driver) throws InterruptedException
	
	{
	Thread.sleep(3000);
	 driver.findElement(By.name("category_id")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

                     
    }

public void trucktypeSelection(WebDriver driver) throws InterruptedException

{
Thread.sleep(3000);
 driver.findElement(By.name("type_id")).click();
 JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollBy(0,250)", "");

                 
}


public void dateSelection(WebDriver driver) throws InterruptedException

{
Thread.sleep(4000);
 driver.findElement(By.xpath("//mat-radio-button[@id='radio_6']")).click();
 Thread.sleep(3000);
 List<WebElement>	dates=  driver.findElements(By.xpath("//div[@class='cal_come_next_line ng-star-inserted']"));
	int count= driver.findElements(By.xpath("//div[@class='cal_come_next_line ng-star-inserted']")).size();
	
	for(int j=0; j<count; j++)
	{
	String texts=	driver.findElements(By.xpath("//div[@class='cal_come_next_line ng-star-inserted']")).get(j).getText();
		if(texts.equalsIgnoreCase("24"))
		{
			driver.findElements(By.xpath("//div[@class='cal_come_next_line ng-star-inserted']")).get(j).click();
			break;
		}}
                 
}

public void timeSelection(WebDriver driver) throws InterruptedException

{
Thread.sleep(3000);
 driver.findElement(By.xpath("//td[normalize-space()='10 AM']")).click();
 
                 
}



public void next(WebDriver driver) throws InterruptedException

{

driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,250)", "");

           
}

}
