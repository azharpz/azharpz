package pageObject;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class WebSelectCity {
	
		private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

		static SoftAssert softAssert=new SoftAssert()	;	
		
	public void fromCity(WebDriver driver) throws InterruptedException
		
		{
	 	Thread.sleep(5000);

			
		
		driver.findElement(By.id("mat-input-0")).sendKeys("kotamita");

	 	
	 	Thread.sleep(3000);
		
		 List<WebElement>	fromcity=  driver.findElements(By.xpath("//div[@class='pac-container pac-logo']/div"));

		 
				
	               int fromcitycount= fromcity.size();

	                System.out.println(fromcitycount);
	 
	                fromcity.get(fromcitycount-3).click();
	 
		                                 
	    }

	public void toCity(WebDriver driver) throws InterruptedException

	{
		 driver.findElement(By.id("mat-input-1")).sendKeys("vrccent");

	    
		//driver.findElement(By.xpath("(//div[@class='input-fields'])[2]")).sendKeys("vrccent");
		 Thread.sleep(3000);

		// List<WebElement>	dates=  driver.findElements(By.xpath("(//div[@class='pac-container pac-logo'])[2]"));
		 List<WebElement>	tocity=  driver.findElements(By.xpath("//div[@class='pac-container pac-logo']/div"));
	    int tocitycounts= tocity.size();
	    System.out.println(tocitycounts);
	    tocity.get(tocitycounts-2).click();


	Thread.sleep(2000);

	                                 
	}

	public void requestaQuote(WebDriver driver) throws InterruptedException

	{
		
	    driver.findElement(By.xpath("//button[@class='mat-raised request_a_quote_green mat-button']")).click();

	                                 
	}

		
		//	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver/chromedriver.exe");
			
		
			
					




		

}
