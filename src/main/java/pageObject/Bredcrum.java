package pageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Bredcrum  {
	
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;
	
	
	  
	
public void tripsSelection(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(1000);

	driver.findElement(By.xpath("//h5[normalize-space()='Trips']")).click();
	

}

public void bookATrip(WebDriver driver) throws InterruptedException, IOException



{
Thread.sleep(1000);

driver.findElement(By.xpath("//h5[normalize-space()='Book a Trip']")).click();


}



}

	