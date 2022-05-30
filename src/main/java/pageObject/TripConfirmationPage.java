package pageObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class TripConfirmationPage {
	
	private static final Object[] strArray = null;

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	


  String Actualtripid = Tripidview();
  
public   void Tripidview(WebDriver driver) throws InterruptedException

{

Thread.sleep(4000);

String tripid=driver.findElement(By.xpath("//div[@class='page_main_title ng-binding flex-50']")).getText();
String[] strArray = tripid.split(":");

String Actualtripid = strArray[1].trim();

System.out.println("Actualtripid is displayed as  "  +Actualtripid);

return;

	}
	
private String Tripidview() {
	// TODO Auto-generated method stub
	return null;
}

public void paymentview(WebDriver driver,String Actualtripid) throws InterruptedException

{
Thread.sleep(3000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,550)", "");
String paymentdetails=driver.findElement(By.xpath("(//li[position()=1])[1]")).getText();
//String[] strArray = tripid.split(":");

//String Actualtripid = strArray[1].trim();

System.out.println("paymentdetails is displayed as  "  +paymentdetails);

System.out.println("Actualtripid is test as  "  +Actualtripid);

softAssert.assertEquals(Actualtripid, paymentdetails);

	}

	
	

}
