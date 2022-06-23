package adminPageFactory;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import resources.AdminData;

public class TruckCategoryPage extends AdminData{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="//button[normalize-space()='Add']") 
	WebElement addtruckbutton;
	
	@FindBy(xpath="//input[@formcontrolname='truck_category_name']") 
	WebElement truckcategory;
	
	@FindBy(xpath="//input[@formcontrolname='category_description']") 
	WebElement truckdescription;
	
	@FindBy(xpath="//button[normalize-space()='Add Truck Category']") 
	WebElement addtruckcategory;
	
	@FindBy(css="img[src='../../../assets/img/upload.svg']") 
	  WebElement  truckimageupload;
	
	

public void AddTrucksbutton(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(3000);

    addtruckbutton.click();

}


	
public void AddTruckscategory(WebDriver driver) throws InterruptedException, IOException

       
	
	{
    
	Thread.sleep(3000);

	truckcategory.sendKeys(gettruckcategoryname());
	truckdescription.sendKeys(gettruckdesc());
	

}
	
public void Truckimageupload(WebDriver driver) throws InterruptedException, IOException



{
     
     Thread.sleep(10000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   // truckimageupload.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
     truckimageupload.click();
     Runtime.getRuntime().exec(getimageuploadpath());

}
	 

public void CreateTruckCategory(WebDriver driver) throws InterruptedException, IOException



{
     
     Thread.sleep(5000);
    
     addtruckcategory.click();
     

}

public  String gettruckcategoryname() throws IOException
{
	return getpropertyObject().getProperty("truckcategoryname");
}

public  String gettruckdesc() throws IOException
{
	return getpropertyObject().getProperty("truckdesc");
}

public  String getimageuploadpath() throws IOException
{
	return getpropertyObject().getProperty("truckimagepath");
}

}

