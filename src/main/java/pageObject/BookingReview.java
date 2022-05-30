package pageObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class BookingReview {
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	

public void reviewpage(WebDriver driver) throws InterruptedException

{
Thread.sleep(2000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(40,0)", "");

String paidamount=driver.findElement(By.xpath("//div[@class='amount_disp_b2']")).getText();




String[] strArray = paidamount.split("/-");

String percent = strArray[0].trim();

String[] strArray2 = percent.split("₹");

String percent3 = strArray2[1].trim();




int Actualpaidamount = (int) Float.parseFloat(percent3);
System.out.println("paidamount is displayed as  "  +Actualpaidamount);



JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,450)", "");


String balanceamount=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-visitor-booking[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[3]/div[2]/div[2]")).getText();

System.out.println("Actual balanceamount is displayed as in review page  "  +balanceamount);



   }
public void next(WebDriver driver) throws InterruptedException

{
	Thread.sleep(2000);


driver.findElement(By.xpath("//body/app-root/app-visitor-booking/div/div/div/div/div/button[1]")).click();


           
}
	
public void payNow(WebDriver driver) throws InterruptedException

{
Thread.sleep(2000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(650,150)", "");
Thread.sleep(2000);

driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();

driver.findElement(By.xpath("//button[contains(.,'Pay Now')]")).click();





   }


}
