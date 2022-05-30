package pageObject;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class LoadCategory {
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	

public void loadType(WebDriver driver) throws InterruptedException

{
Thread.sleep(4000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,250)", "");
driver.findElement(By.xpath("(//input[position()=1])[4]")).sendKeys("test");
driver.findElement(By.xpath("(//input[position()=1])[5]")).sendKeys("4");
driver.findElement(By.xpath("(//input[position()=1])[6]")).sendKeys("4");
driver.findElement(By.xpath("(//input[position()=1])[7]")).sendKeys("4");
driver.findElement(By.xpath("(//input[position()=1])[8]")).sendKeys("4");
driver.findElement(By.xpath("(//input[position()=1])[9]")).sendKeys("4");

//driver.findElement(By.xpath("(//input[position()=1])[2]")).click();



	}
	
public void packageType(WebDriver driver) throws InterruptedException

{
Thread.sleep(4000);


//driver.findElement(By.xpath("(//input[position()=1])[2]")).click();

driver.findElement(By.xpath("//div[@class='mat-select-trigger ng-tns-c73-19']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//span[normalize-space()='Box']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-visitor-booking[1]/div[2]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/form[1]/div[3]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//span[normalize-space()='Kg']")).click();
driver.findElement(By.xpath("//div[@class='md-off']")).click();

driver.findElement(By.xpath("//button[contains(text(),'ADD')]")).click();
JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("window.scrollBy(0,250)", "");



//WebElement packagetype=driver.findElement(By.xpath("//div[@class='mat-select-panel-wrap ng-tns-c73-216 ng-trigger ng-trigger-transformPanelWrap ng-star-inserted']"));

//Select packagetypes =new Select(packagetype);
	
//packagetypes.selectByVisibleText("Bag");
//driver.findElement(By.xpath("//div[@class='mat-select-trigger ng-tns-c73-19']")).click();
//Thread.sleep(3000);


//List<WebElement>	packagetype=  driver.findElements(By.xpath("//div[@class='mat-select-trigger ng-tns-c73-19']"));
	// int packagetypes =	driver.findElements(By.xpath("//div[@class='mat-select-trigger ng-tns-c73-19']")).size();
	
		// for(int i=0; i<packagetypes; i++)
	//{
	//String text=	driver.findElements(By.xpath("//div[@class='mat-select-trigger ng-tns-c73-19']")).get(i).getText();
		//if(text.equalsIgnoreCase("Bag"))
		//{
	
	
	//driver.findElements(By.xpath("//div[@class='mat-select-trigger ng-tns-c73-19']")).get(i).click();
		//	break;
		//}}



	}
	



                 

public void next(WebDriver driver) throws InterruptedException

{
	Thread.sleep(4000);


driver.findElement(By.xpath("//button[contains(@class,'md-raised login_popup_button_book md-button md-ink-ripple marginleft55px')]")).click();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,450)", "");

           
}




}
