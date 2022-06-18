package pageObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import resources.Data;

public class WebSelectCity extends Data{
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void fromCity(WebDriver driver) throws InterruptedException, IOException
	
	{
 	Thread.sleep(5000);

		
	
	driver.findElement(By.id("mat-input-0")).sendKeys(getfromcity());

 	
 	Thread.sleep(3000);
	
	 List<WebElement>	fromcity=  driver.findElements(By.xpath("//div[@class='pac-container pac-logo']/div"));

	 
	 Iterator<WebElement> itr=fromcity.iterator();
	 int i=1;
	 String value="";
	 while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getText();
		 System.out.println("name of city is   "  + value);
	 }

	 
			
               int fromcitycount= fromcity.size();

       	    System.out.println("no of fromcity is   "  + fromcitycount);
 
                fromcity.get(fromcitycount-1).click();
 
	                                 
    }

public void toCity(WebDriver driver) throws InterruptedException, IOException

{
	 driver.findElement(By.id("mat-input-1")).sendKeys(gettocity());

    
	//driver.findElement(By.xpath("(//div[@class='input-fields'])[2]")).sendKeys("vrccent");
	 Thread.sleep(3000);

	// List<WebElement>	dates=  driver.findElements(By.xpath("(//div[@class='pac-container pac-logo'])[2]"));
	 List<WebElement>	tocity=  driver.findElements(By.xpath("//div[@class='pac-container pac-logo']/div"));
	 
	 
	 Iterator<WebElement> itr=tocity.iterator();
	 int i=1;
	 String value="";
	 while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getText();
		 System.out.println("name of tocity is   "  + value);
	 }
	 
	 
    int tocitycounts= tocity.size();
    System.out.println("no of tocity is   "  + tocitycounts);
    tocity.get(tocitycounts-2).click();


Thread.sleep(2000);

                                 
}

public void requestaQuote(WebDriver driver) throws InterruptedException

{
	
    driver.findElement(By.xpath("//button[@class='mat-raised request_a_quote_green mat-button']")).click();

                                 
}

	
	//	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver/chromedriver.exe");
		
	

public  String getfromcity() throws IOException
{
	return getpropertyObject().getProperty("fromcity");
}

public  String gettocity() throws IOException
{
	return getpropertyObject().getProperty("tocity");
}

	}