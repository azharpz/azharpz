package pageObject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class WebSearchTruck {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void searchTruck(WebDriver driver) throws InterruptedException
	
	{

	driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	 

	}
	

}
