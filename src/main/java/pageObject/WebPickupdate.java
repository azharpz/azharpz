package pageObject;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class WebPickupdate {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void pickupDate(WebDriver driver) throws InterruptedException
	
	{

	driver.findElement(By.xpath("//input[@id='mat-input-2']")).click();
	 Thread.sleep(3000);
	 List<WebElement>	dates=  driver.findElements(By.xpath("//button[contains(@aria-pressed,'false')]"));
		int count= driver.findElements(By.xpath("//button[contains(@aria-pressed,'false')]")).size();
		
		for(int j=0; j<count; j++)
		{
		String texts=	driver.findElements(By.xpath("//button[contains(@aria-pressed,'false')]")).get(j).getText();
			if(texts.equalsIgnoreCase("2"))
			{
				driver.findElements(By.xpath("//button[contains(@aria-pressed,'false')]")).get(j).click();
				break;
			}}                       
}


	
		
	
		
				




	

}
