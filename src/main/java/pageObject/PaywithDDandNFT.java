package pageObject;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class PaywithDDandNFT {
	
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	

public void paywithDD(WebDriver driver) throws InterruptedException

{
Thread.sleep(2000);


driver.findElement(By.xpath("//span[contains(@class,'mat-checkbox-inner-container')]")).click();

driver.findElement(By.xpath("(//input[position()=1])[3]")).sendKeys("SBI");
driver.findElement(By.xpath("(//input[position()=1])[5]")).sendKeys("9487122244");

   }

public void paymentdate(WebDriver driver) throws InterruptedException

{
Thread.sleep(2000);


driver.findElement(By.xpath("//button[@aria-label='Open calendar']")).click();
Thread.sleep(3000);
List<WebElement>	dates=  driver.findElements(By.xpath("//td[@class='mat-calendar-body-cell ng-star-inserted']"));
	int count= driver.findElements(By.xpath("//td[@class='mat-calendar-body-cell ng-star-inserted']")).size();
	
	for(int j=0; j<count; j++)
	{
	String texts=	driver.findElements(By.xpath("//td[@class='mat-calendar-body-cell ng-star-inserted']")).get(j).getText();
		if(texts.equalsIgnoreCase("1"))
		{
			driver.findElements(By.xpath("//td[@class='mat-calendar-body-cell ng-star-inserted']")).get(j).click();
			break;
		}}

   }

public void paymentMethod(WebDriver driver) throws InterruptedException

{
Thread.sleep(2000);


driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-visitor-booking[1]/div[2]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]")).click();
Thread.sleep(3000);
List<WebElement>	paymenttype=  driver.findElements(By.xpath("//span[@class='mat-option-text']"));
int paymenttypes=	driver.findElements(By.xpath("//span[@class='mat-option-text']")).size();

	for(int i=0; i<paymenttypes; i++)
{
String text=	driver.findElements(By.xpath("//span[@class='mat-option-text']")).get(i).getText();
	if(text.equalsIgnoreCase("RTGS"))
	{


driver.findElements(By.xpath("//span[@class='mat-option-text']")).get(i).click();
		break;
	}}}

	
	public void confirmpayment(WebDriver driver) throws InterruptedException

	{
	Thread.sleep(2000);

	driver.findElement(By.xpath("//button[@type='submit']")).click();
	

	
   }


}
