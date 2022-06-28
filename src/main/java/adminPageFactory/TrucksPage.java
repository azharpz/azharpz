package adminPageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import resources.AdminData;

public class TrucksPage extends AdminData{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="//button[normalize-space()='Add']") 
	WebElement addtruckbutton;
	
	@FindBy(xpath="//input[@formcontrolname='truck_number']") 
	WebElement trucknumber;
	
	@FindBy(xpath="//input[@formcontrolname='home_location']") 
	WebElement homelocation;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='make_name']") 
	WebElement make_name;
	
	@FindBy(xpath="//input[@formcontrolname='truck_model']") 
	  WebElement  truck_model;
	
	@FindBy(xpath="//input[@formcontrolname='manufacture_year']") 
	  WebElement  manufacture_year;
	
	@FindBy(xpath="//mat-select[@formcontrolname='truck_category']") 
	  WebElement  truckcategory;
	
	@FindBy(xpath="//span[@class='mat-option-text']") 
	  List<WebElement>  trucktype;
	
	
	@FindBy(xpath="//mat-select[@formcontrolname='truck_type']") 
	  WebElement  dependenttrucktype;
	
	@FindBy(xpath="//span[@class='mat-option-text']") 
	  List<WebElement>  truckweight;
	
	
	@FindBy(xpath="//input[@data-placeholder='RC Valid']") 
	  WebElement  rcdate;
	
	

	@FindBy(xpath="//div[@class='mat-calendar-header']") 
	  WebElement  Choosemonth;
	
	
	@FindBy(xpath="//button[@aria-label='Next month']") 
	  WebElement  Next;
	
	@FindBy(xpath="//div[contains(@class,'mat-calendar-body-cell-content mat-focus-indicator')]") 
	  List<WebElement>  dateselection;
	

	@FindBy(xpath="//input[@data-placeholder='RC Valid']") 
	  WebElement  getdate;
	
	@FindBy(css="img[src='../../../assets/img/profile-upload.svg']") 
	  WebElement  truckimageupload;
	
	
	
	@FindBy(xpath="//input[@formcontrolname='vehicle_rc_expiry']") 
	  WebElement  rcexpirydate;
	
	
   @FindBy(xpath="(//span[contains(.,'Upload')])[1]") 
	  WebElement  rcvehicleimage;
	
	
	@FindBy(xpath="//input[@formcontrolname='permit_type_expiry']") 
	  WebElement  permitexpirydate;
	
	@FindBy(xpath="(//span[contains(.,'Upload')])[2]") 
	  WebElement  permitvehicleimage;
	
	
	@FindBy(xpath="//input[@formcontrolname='fitness_expiry']") 
	  WebElement  fitnessexpirydate;
	
	@FindBy(xpath="(//span[contains(.,'Upload')])[3]") 
	  WebElement  fitnessvehicleimage;
	
	
	@FindBy(xpath="//input[@formcontrolname='pollution_expiry']") 
	  WebElement  pollutionexpirydate;
	
	@FindBy(xpath="(//span[contains(.,'Upload')])[4]") 
	  WebElement  pollutionimage;
	
	
	@FindBy(xpath="//input[@formcontrolname='insurance_expiry']") 
	  WebElement  insuranceexpirydate;
	
	@FindBy(xpath="(//span[contains(.,'Upload')])[5]") 
	  WebElement  insuranceimage;
	
	@FindBy(xpath="//button[normalize-space()='save']") 
	  WebElement  CreateTruck;
	
	
public void AddTrucksbutton(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(5000);

    addtruckbutton.click();

}


	
public void AddTrucksdetails(WebDriver driver) throws InterruptedException, IOException

       
	
	{
    
	Thread.sleep(10000);

	trucknumber.sendKeys(gettrucknumber());
	homelocation.sendKeys(gethomelocation());
	make_name.sendKeys(getmakername());
	truck_model.sendKeys(getmodel());
	manufacture_year.sendKeys(getmanfactureryear());

}

public void Selecttruckcategory(WebDriver driver) throws InterruptedException

{

	 truckcategory.click();
     Thread.sleep(3000);
 
    List<WebElement>	truck=  trucktype;
    Iterator<WebElement> itr=truck.iterator();
    int i=1;
    String value="";
    while(itr.hasNext())
 {
	 WebElement element=itr.next();
	 value=element.getText();
	 System.out.println("name of selected truck is   "  + value);
 }

 
   int	trucktypes= trucktype.size();

   System.out.println("no of truck category is   "  + trucktypes);
 
   trucktype.get(1).click();

              
}


public void Selecttrucktype(WebDriver driver) throws InterruptedException

{
	Thread.sleep(5000);

	dependenttrucktype.click();
     
 
    List<WebElement>	truck=  truckweight;
    Iterator<WebElement> itr=truck.iterator();
    int i=1;
    String value="";
    while(itr.hasNext())
 {
	 WebElement element=itr.next();
	 value=element.getText();
	 System.out.println("name of selected truckweight is   "  + value);
 }

 
   int	trucktypes= truckweight.size();

   System.out.println("no of truckweight is   "  + trucktypes);
 
   truckweight.get(1).click();

              
}

public void ChooseRCDate(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	rcdate.click();
 	Thread.sleep(1000);
 while	(! Choosemonth.getText().contains("FEB"))
 {
	 Next.click();
	

	 
 }
	 
	 List<WebElement>	dates=  dateselection;
	 int count= dates.size();

	 for(int j=0; j<count; j++)
	 {
	 String texts=	dates.get(j).getText();
	 	if(texts.equalsIgnoreCase(getrcdate()))
	 	{
	 		dates.get(j).click();
	 		break;
	 	}
	 	
	 	   
 }
	 
	

	}
public void Truckimageupload(WebDriver driver) throws InterruptedException, IOException, AWTException



{
     
     Thread.sleep(2000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   // truckimageupload.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
     truckimageupload.click();
   //  Runtime.getRuntime().exec(getimageuploadpath());
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

}

public void VehicleexpiryDate(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	rcexpirydate.click();
 	Thread.sleep(1000);
 while	(! Choosemonth.getText().contains("FEB"))
 {
	 Next.click();
	

	 
 }
	 
	 List<WebElement>	dates=  dateselection;
	 int count= dates.size();

	 for(int j=0; j<count; j++)
	 {
	 String texts=	dates.get(j).getText();
	 	if(texts.equalsIgnoreCase(getvehicleexpirercdate()))
	 	{
	 		dates.get(j).click();
	 		break;
	 	}
	 	
	 	   
 } 
	 
	
	 	  }



public void VehicleRCimageupload(WebDriver driver) throws InterruptedException, IOException, AWTException



{
     
   //  Thread.sleep(5000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   //  rcvehicleimage.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
       rcvehicleimage.click();
    // Runtime.getRuntime().exec(getimageuploadpath());
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

}

public void PermitexpiryDate(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	permitexpirydate.click();
 	Thread.sleep(1000);
 while	(! Choosemonth.getText().contains("FEB"))
 {
	 Next.click();
	

	 
 }
	 
	 List<WebElement>	dates=  dateselection;
	 int count= dates.size();

	 for(int j=0; j<count; j++)
	 {
	 String texts=	dates.get(j).getText();
	 	if(texts.equalsIgnoreCase(getfitnessexpirercdate()))
	 	{
	 		dates.get(j).click();
	 		break;
	 	}
	 	
	 	   
 } 
	 
	
	 	  }



public void PermitRCimageupload(WebDriver driver) throws InterruptedException, IOException, AWTException



{
     
    Thread.sleep(10000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   //  rcvehicleimage.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
     permitvehicleimage.click();
  //   Runtime.getRuntime().exec(getimageuploadpath());
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

}

public void FitnessexpiryDate(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	fitnessexpirydate.click();
 	Thread.sleep(1000);
 while	(! Choosemonth.getText().contains("FEB"))
 {
	 Next.click();
	

	 
 }
	 
	 List<WebElement>	dates=  dateselection;
	 int count= dates.size();

	 for(int j=0; j<count; j++)
	 {
	 String texts=	dates.get(j).getText();
	 	if(texts.equalsIgnoreCase(getpermitexpirercdate()))
	 	{
	 		dates.get(j).click();
	 		break;
	 	}
	 	
	 	   
 } 
	 
	
	 	  }

public void Fitnessimageupload(WebDriver driver) throws InterruptedException, IOException, AWTException



{
     
     Thread.sleep(10000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   //  rcvehicleimage.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
     fitnessvehicleimage.click();
   //  Runtime.getRuntime().exec(getimageuploadpath());
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

}

public void PollutionexpiryDate(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	pollutionexpirydate.click();
 	Thread.sleep(1000);
 while	(! Choosemonth.getText().contains("FEB"))
 {
	 Next.click();
	

	 
 }
	 
	 List<WebElement>	dates=  dateselection;
	 int count= dates.size();

	 for(int j=0; j<count; j++)
	 {
	 String texts=	dates.get(j).getText();
	 	if(texts.equalsIgnoreCase(getfitnessexpirercdate()))
	 	{
	 		dates.get(j).click();
	 		break;
	 	}
	 	
	 	   
 } 
	 
	
	 	  }



public void Pollutionimageupload(WebDriver driver) throws InterruptedException, IOException, AWTException



{
     
   Thread.sleep(10000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   //  rcvehicleimage.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
     pollutionimage.click();
   //  Runtime.getRuntime().exec(getimageuploadpath());
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

}

public void InsuranceexpiryDate(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	insuranceexpirydate.click();
 	Thread.sleep(1000);
 while	(! Choosemonth.getText().contains("FEB"))
 {
	 Next.click();
	

	 
 }
	 
	 List<WebElement>	dates=  dateselection;
	 int count= dates.size();

	 for(int j=0; j<count; j++)
	 {
	 String texts=	dates.get(j).getText();
	 	if(texts.equalsIgnoreCase(getfitnessexpirercdate()))
	 	{
	 		dates.get(j).click();
	 		break;
	 	}
	 	
	 	   
 } 
	 
	
	 	  }



public void Insuranceimageupload(WebDriver driver) throws InterruptedException, IOException, AWTException



{
    Thread.sleep(10000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   //  rcvehicleimage.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
     insuranceimage.click();
   
   //  Runtime.getRuntime().exec(getimageuploadpath());
     Robot rb = new Robot();
   	rb.setAutoDelay(3000);
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

}
	 

public void CreateTruck(WebDriver driver) throws InterruptedException, IOException



{
     
     Thread.sleep(50000);
    
     CreateTruck.click();
     

}

	 

 	
 

public  String gettrucknumber() throws IOException
{
	return getpropertyObject().getProperty("trucknumber");
}

public  String gethomelocation() throws IOException
{
	return getpropertyObject().getProperty("homelocation");
}

public  String getmakername() throws IOException
{
	return getpropertyObject().getProperty("makername");
}
public  String getmodel() throws IOException
{
	return getpropertyObject().getProperty("model");
}
public  String getmanfactureryear() throws IOException
{
	return getpropertyObject().getProperty("manfactureryear");
}

public  String getrcmonthyear() throws IOException
{
	return getpropertyObject().getProperty("rcmonthyear");
}

public  String getrcdate() throws IOException
{
	return getpropertyObject().getProperty("rcdate");
}

public  String getimageuploadpath() throws IOException
{
	return getpropertyObject().getProperty("truckimagepath");
}

public  String getvehiclercmonthyear() throws IOException
{
	return getpropertyObject().getProperty("vehiclercmonthyearexpire");
}

public  String getvehicleexpirercdate() throws IOException
{
	return getpropertyObject().getProperty("vehiclercexpiredate");
}


public  String getpermitexpirercdate() throws IOException
{
	return getpropertyObject().getProperty("permitrcexpiredate");
}

public  String getfitnessexpirercdate() throws IOException
{
	return getpropertyObject().getProperty("permitrcexpiredate");
}

public  String getimageuploadpaths() throws IOException
{
	return getpropertyObject().getProperty("pathimage");
}
}
