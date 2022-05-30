package pageObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Signin {
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	

public void signin(WebDriver driver) throws InterruptedException

{
Thread.sleep(4000);
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,550)", "");

driver.findElement(By.xpath("//div[normalize-space()='Sign In']")).click();


driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys("9589199999");
driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Shweta@123");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='LOGIN']")).click();




	}

}
