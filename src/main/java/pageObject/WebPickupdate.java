package pageObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class WebPickupdate {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;	
	
public void pickupDate(WebDriver driver) throws InterruptedException, IOException
	
	{

	driver.findElement(By.xpath("//input[@id='mat-input-2']")).click();
	 Thread.sleep(3000);
	 List<WebElement>	dates=  driver.findElements(By.xpath("//button[contains(@aria-pressed,'false')]"));
		int count= driver.findElements(By.xpath("//button[contains(@aria-pressed,'false')]")).size();
		
		for(int j=0; j<count; j++)
		{
		String texts=	driver.findElements(By.xpath("//button[contains(@aria-pressed,'false')]")).get(j).getText();
			if(texts.equalsIgnoreCase(getdate()))
			{
				driver.findElements(By.xpath("//button[contains(@aria-pressed,'false')]")).get(j).click();
				break;
			}
			}   
		
		}
public Properties getpropertyObject() throws IOException
{
	
	FileReader reader=new FileReader("C:\\Users\\user\\eclipse-workspace\\RobustFramework2\\src\\main\\java\\properties\\EmailLoginTest.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
    
    return p;
      
  //  System.out.println(p.getProperty("user"));  
   // System.out.println(p.getProperty("password"));  
      
}
public  String getdate() throws IOException
{
	return getpropertyObject().getProperty("PickDate");
}

	}
