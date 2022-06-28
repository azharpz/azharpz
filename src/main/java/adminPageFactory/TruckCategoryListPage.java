package adminPageFactory;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import resources.AdminData;
import resources.AdminLaunch;

public class TruckCategoryListPage {

	

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="(//p[@class='truck-number'])[3]") 
	WebElement  truck_category_name;
	
	
	
	 @FindBy(xpath="//div[@class='row']//div[1]//div[1]//img[1]") 
		WebElement edittruckcategory;
	 
	 public TruckCategoryListPage(WebDriver driver) {
			AdminLaunch.driver=driver;
			PageFactory.initElements(driver,this); 
			//logger  = Logger.getLogger(TruckCategoryListPage.class.getName());
		}

	
	
public String gettruckcategoryname(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(10000);

	
	 String  truckcategoryname = truck_category_name.getText();


	    System.out.println("expectedtruckname is   "  + truckcategoryname);
	  // softAssert.assertEquals(actualtruckname, "Hi");
	    
	    return truckcategoryname;
}

}

	
