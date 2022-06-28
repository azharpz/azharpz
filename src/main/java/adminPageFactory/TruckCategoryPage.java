package adminPageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.nativekey.KeyEvent;
import resources.AdminData;
import resources.AdminLaunch;

public class TruckCategoryPage extends AdminData{

	

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

	
	
	public TruckCategoryPage(WebDriver driver) {
		AdminLaunch.driver=driver;
		PageFactory.initElements(driver,this); 
		logger  = Logger.getLogger(TruckCategoryPage.class.getName());
	}

public void AddTrucksbutton(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(3000);
	logger.info("clicking add button");
    //addtruckbutton.click();
	clickElement(addtruckbutton);
    
    

}


	
public void AddTruckscategory(WebDriver driver) throws InterruptedException, IOException

       
	
	{
    
	Thread.sleep(3000);
	//EnterText(gettruckcategoryname(),truckcategory);
	

	truckcategory.sendKeys(gettruckcategoryname());
	truckdescription.sendKeys(gettruckdesc());
	

}
	
public void Truckimageupload(WebDriver driver) throws InterruptedException, IOException, AWTException



{
	truckimageupload.click();
	Robot rb = new Robot();
	rb.setAutoDelay(2000);
	StringSelection str = new StringSelection(getimageuploadpaths());
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	rb.setAutoDelay(2000);

     // press Contol+V for pasting
    rb.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
    rb.keyPress(java.awt.event.KeyEvent.VK_V);

	rb.setAutoDelay(2000);

 
    // release Contol+V for pasting
  
    rb.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
    rb.keyRelease(java.awt.event.KeyEvent.VK_V);
	rb.setAutoDelay(2000);

    // for pressing and releasing Enter
    rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
    rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);


   
    //  WebDriverWait wait = new WebDriverWait(driver, 50);
	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   //truckimageupload.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
   // truckimageupload.click();
  //   Runtime.getRuntime().exec(getimageuploadpath());

}
	 

public void CreateTruckCategory(WebDriver driver) throws InterruptedException, IOException



{
    
     Thread.sleep(30000);
     logger.info("Created truck category");
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

public  String getimageuploadpaths() throws IOException
{
	return getpropertyObject().getProperty("pathimage");
}

}

