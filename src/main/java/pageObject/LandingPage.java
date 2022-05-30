package pageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class LandingPage 
{
	
	public static void loginButton(WebDriver driver) throws InterruptedException

	{
		   driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
					
	 }


}
