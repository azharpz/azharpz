package pageObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class PaymentDetails {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	

public void pickUpandDrop(WebDriver driver) throws InterruptedException

{
Thread.sleep(2000);

driver.findElement(By.xpath("(//input[position()=1])[2]")).sendKeys("azhar");
driver.findElement(By.xpath("(//input[position()=1])[3]")).sendKeys("9487122244");
//driver.findElement(By.xpath("(//input[position()=1])[4]")).sendKeys("javeed");
//driver.findElement(By.xpath("(//input[position()=1])[5]")).sendKeys("8888888888");
driver.findElement(By.xpath("//body//app-root//div[@layout='row']//div//div//div//div[2]//div[1]//i[1]")).click();
driver.findElement(By.xpath("//tbody/tr[1]")).click();


   }

public void paymentType(WebDriver driver) throws InterruptedException

{
Thread.sleep(2000);


String fullamount=driver.findElement(By.xpath("//span[@class='amount_disper']")).getText();
//System.out.println("tax1 displayed as  "  + tax1);

	String[] strArray = fullamount.split("/-");
	
    String percent = strArray[0].trim();

    String[] strArray2 = percent.split("₹");

   String percent3 = strArray2[1].trim();




int Actualfullamount = (int) Float.parseFloat(percent3);
System.out.println("Actualfullamount is displayed as  "  +Actualfullamount);


Thread.sleep(3000);
driver.findElement(By.xpath("//li[@id='70_val']")).click();
Thread.sleep(3000);


   int seventypercentage =Actualfullamount*70/100 ;
   System.out.println("Expected seventypercentage  is"  +seventypercentage);

  String Actualseventypercent=driver.findElement(By.xpath("//span[@id='payment_value']")).getText();
	int Actualseventypercentage = (int) Float.parseFloat(Actualseventypercent);

//System.out.println("tax1 displayed as  "  + tax1);
  
 // String[] strArray4 = seventypercent.split("/-");
	
 // String seventypercentages = strArray[0].trim();

 // String[] strArray5 = seventypercentages.split("₹");

// String percent6 = strArray2[1].trim();

  //  int Actualseventypercent = (int) Float.parseFloat(percent6);
   System.out.println("AActualseventypercent is displayed as  "  +Actualseventypercentage);


   softAssert.assertEquals(Actualseventypercentage, seventypercentage);
	

   int expectedbalanceamount = Actualfullamount-Actualseventypercentage;
   System.out.println("expectedbalanceamount is  "  + expectedbalanceamount);


   }

public void paymentMethod(WebDriver driver) throws InterruptedException

{
Thread.sleep(2000);



driver.findElement(By.xpath("//li[@id='offline']")).click();

driver.findElement(By.xpath("//button[contains(@class,'md-raised login_popup_button_book marginleft55px md-button md-ink-ripple')]")).click();


 }
	
}
