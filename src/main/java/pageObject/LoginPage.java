package pageObject;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;



public class LoginPage  
{
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void loginWindow(WebDriver driver) throws InterruptedException
	
	{
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.switchTo().activeElement();
		
		 
        //driver.findElement(  By.xpath("//input[@class='effect-16 ng-untouched ng-pristine ng-invalid']")) .sendKeys("azharjaveedpz@gmail.com");                			
       	
	                                 
    }
	
	public void emailLogin(WebDriver driver) throws InterruptedException
	
	{
		
		//driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		//driver.switchTo().activeElement();
		Thread.sleep(3000);
		 
        driver.findElement(  By.xpath("//input[@class='effect-16 ng-untouched ng-pristine ng-invalid']")) .sendKeys("azharjaveedpz@gmail.com");                			
       	
	                                 
    }
	

	public void mobileLogin(WebDriver driver) throws InterruptedException
	
	{
		
		Thread.sleep(3000);
        driver.findElement(  By.xpath("//input[@class='effect-16 ng-untouched ng-pristine ng-invalid']")) .sendKeys("9487122244");                			

	                                 
    }
	

	
public void password(WebDriver driver) throws InterruptedException
	
	{
		
		
		Thread.sleep(3000);
		 
        driver.findElement(  By.xpath("//input[@type='password']")).sendKeys("Azhar@123");
        
	}
        public void clickonloginbutton(WebDriver driver) throws InterruptedException
    	
    	{
    		
    	
    		 
            driver.findElement(  By.xpath("//button[normalize-space()='LOGIN']")).click(); 
       	
	                                 
    }
	
	
public static void googleLogin(WebDriver driver) throws InterruptedException
	
	{
		
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.switchTo().activeElement();
		//Thread.sleep(3000);
		 
       driver.findElement(By.xpath("//button[@class='google']")).click();		
	                                 
    }

public static void facebookLogin(WebDriver driver) throws InterruptedException

{
	
	driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
	driver.switchTo().activeElement();
	//Thread.sleep(3000);
	 
    driver.findElement(By.xpath("//button[@class='facebook']")).click();		
                                 
}

public static void appleLogin(WebDriver driver) throws InterruptedException

{
	
	driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
	driver.switchTo().activeElement();
	//Thread.sleep(3000);
	 
    driver.findElement(By.xpath("//button[@class='apple']")).click();		
                                 
}

public  void continueButton(WebDriver driver) throws InterruptedException

{
	
	  driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();			
                                 
}

public  void getTitle(WebDriver driver) throws InterruptedException

{
	
	String expected_title="Zeebusinessffff";
	String actual_title=driver.getTitle();
		
	softAssert.assertEquals(expected_title, actual_title);
	softAssert.assertAll();	
	logger.info(actual_title);                             
}
	        
}
