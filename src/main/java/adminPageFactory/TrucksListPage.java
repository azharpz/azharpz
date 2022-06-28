package adminPageFactory;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import resources.AdminData;

public class TrucksListPage extends AdminData{

	private static  Logger logger = LogManager.getLogger(TrucksListPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="//p[@class='truck-name']") 
	WebElement truck_name;
	
	 String expectedtruckname = truck_name.getText();
	
	@FindBy(xpath="//p[@class='truck-category']") 
	WebElement truck_category;
	
	@FindBy(xpath="//p[@class='truck-date']") 
	WebElement rc_expirydate;
	
	@FindBy(how=How.XPATH,using="//p[@class='truck-insu']") 
	WebElement insurance_expirydate;
	
	@FindBy(xpath="//a[normalize-space()='Add Notes']") 
	  WebElement  addnotes;
	
	@FindBy(xpath="//a[normalize-space()='View']") 
	  WebElement  viewtruck;
	
	
	
public void AddTrucksbutton(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(5000);

	


	    System.out.println("expectedtruckname is   "  + expectedtruckname);
	  // softAssert.assertEquals(actualtruckname, "Hi");
}

}


	
