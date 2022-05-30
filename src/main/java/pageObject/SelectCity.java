package pageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class  SelectCity  
{
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void fromCity(WebDriver driver) throws InterruptedException
	
	{
		
	driver.findElement(By.id("mat-input-0")).sendKeys("Nell");
	

 	
 	Thread.sleep(3000);
	//WebDriverWait wait = new WebDriverWait(driver, 30);
	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='pac-container pac-logo'])[1")));
	

	// List<WebElement>	date=  driver.findElements(By.xpath("(//div[@class='pac-container pac-logo'])[1]"));
	 List<WebElement>	fromcity=  driver.findElements(By.xpath("//div[@class='pac-container pac-logo']/div"));

	 
			
               int fromcitycount= fromcity.size();

                System.out.println(fromcitycount);
 
                fromcity.get(fromcitycount-1).click();
 
	                                 
    }

public void toCity(WebDriver driver) throws InterruptedException

{
	
	 driver.findElement(By.id("mat-input-1")).sendKeys("Naidupe");
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
	


	