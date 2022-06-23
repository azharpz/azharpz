package adminPageFactory;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import resources.AdminData;

public class DriversPage extends AdminData{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="//button[normalize-space()='Add']") 
	WebElement addbutton;
	
	@FindBy(xpath="//input[@formcontrolname='username']") 
	WebElement name;
	
	@FindBy(xpath="(//input[@formcontrolname='mobile'])[1]") 
	WebElement mobileno;
	
	@FindBy(xpath="//input[@formcontrolname='email']") 
	WebElement email;
	
	@FindBy(xpath="//input[@formcontrolname='driving_license_number']") 
	  WebElement  licenceno;
	
	@FindBy(xpath="//input[@formcontrolname='emergency_contact']") 
	  WebElement  emergencyno;
	
	@FindBy(xpath="//input[@formcontrolname='name']") 
	WebElement contactname;
	
	@FindBy(xpath="//input[@formcontrolname='address_line']") 
	WebElement address_line;
	
	@FindBy(xpath="//input[@formcontrolname='area']") 
	WebElement area;
	
	@FindBy(xpath="//input[@formcontrolname='city']") 
	WebElement city;
	
	@FindBy(xpath="//input[@formcontrolname='state']") 
	WebElement state;
	
	@FindBy(xpath="//input[@formcontrolname='pincode']") 
	WebElement pincode;
	
	@FindBy(xpath="(//input[@formcontrolname='mobile'])[2]") 
	WebElement contactno;
	
	@FindBy(xpath="//input[@formcontrolname='gst']") 
	WebElement gst;
	
	@FindBy(xpath="//mat-select[.='Select truck']") 
	  WebElement  selecttruckcategory;
	
	@FindBy(xpath="//span[@class='mat-option-text']") 
	  List<WebElement>  truckno;
	
	@FindBy(xpath="//mat-select[@formcontrolname='gender']") 
	  WebElement  gender;
	
	@FindBy(xpath="//input[@formcontrolname='license_expiry_date']") 
	  WebElement  license_expiry_date;
	
	@FindBy(xpath="//input[@formcontrolname='driving_license_expiry']") 
	  WebElement  driving_license_expiry;
	
	@FindBy(xpath="//input[@formcontrolname='insurance_expiry']") 
	  WebElement  insurance_expiry;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-admin-add-driver[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[3]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[name()='svg'][1]/*[name()='path'][1]") 
	  WebElement  dob;
	

	@FindBy(xpath="//div[@class='mat-calendar-header']") 
	  WebElement  Choosemonth;
	
	
	@FindBy(xpath="//button[@aria-label='Next month']") 
	  WebElement  Next;
	
	@FindBy(xpath="//button[@aria-label='Previous month']") 
	  WebElement  Previous;
	
	@FindBy(xpath="//div[contains(@class,'mat-calendar-body-cell-content mat-focus-indicator')]") 
	  List<WebElement>  dateselection;
	

	@FindBy(xpath="//p[normalize-space()='Add Driver Image']") 
	  WebElement  driverimageupload;
	

	@FindBy(css="(//a[contains(.,'Upload')])[1]") 
	  WebElement  licenseimageupload;
	
	@FindBy(css="(//a[contains(.,'Upload')])[2]") 
	  WebElement  insuranceimageupload;
	
	@FindBy(css="//button[normalize-space()='save']") 
	  WebElement  createdriver;
	

public void Addbbutton(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(3000);

	addbutton.click();

}


	
public void Adddriversdetail(WebDriver driver) throws InterruptedException, IOException

       
	
	{
    
	Thread.sleep(3000);

	name.sendKeys(getname());
	mobileno.sendKeys(getmob());
	email.sendKeys(getemail());
	licenceno.sendKeys(getliscenceno());
	emergencyno.sendKeys(getemergencyno());

}

public void Addcontactdetail(WebDriver driver) throws InterruptedException, IOException



{

       Thread.sleep(3000);

       contactname.sendKeys(getcontactname());
       area.sendKeys(getarea());
       address_line.sendKeys(getaddressline());
       city.sendKeys(getcity());
       JavascriptExecutor js = (JavascriptExecutor) driver;
   	   js.executeScript("window.scrollBy(0,350)", "");
       state.sendKeys(getstate());
       pincode.sendKeys(getpincodeo());
       contactno.sendKeys(getdrivercontact());
       gst.sendKeys(getgst());




}
	

public void Selecttruckcategory(WebDriver driver) throws InterruptedException

{

	selecttruckcategory.click();
     Thread.sleep(3000);
 
    List<WebElement>	truck=  truckno;
    Iterator<WebElement> itr=truck.iterator();
    int i=1;
    String value="";
    while(itr.hasNext())
 {
	 WebElement element=itr.next();
	 value=element.getText();
	 System.out.println("name of selected truck is   "  + value);
 }

 
   int	trucktypes= truckno.size();

   System.out.println("no of truck category is   "  + trucktypes);
 
   truckno.get(2).click();

              
}

public void Gender(WebDriver driver) throws InterruptedException

{

	gender.click();
     Thread.sleep(3000);
 
    List<WebElement>	truck=  truckno;
    Iterator<WebElement> itr=truck.iterator();
    int i=1;
    String value="";
    while(itr.hasNext())
 {
	 WebElement element=itr.next();
	 value=element.getText();
	 System.out.println("name of selected truck is   "  + value);
 }

 
   int	trucktypes= truckno.size();

   System.out.println("no of truck category is   "  + trucktypes);
 
   truckno.get(2).click();

              
}

public void Driverimageupload(WebDriver driver) throws InterruptedException, IOException



{
     
     Thread.sleep(10000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   // truckimageupload.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
     driverimageupload.click();
     Runtime.getRuntime().exec(getimageuploadpath());

}

public void DrivingexpiryDate(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	driving_license_expiry.click();
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

public void DOB(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	dob.click();
 	Thread.sleep(1000);
 while	(! Previous.getText().contains("FEB"))
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

public void Driverlicensceimageupload(WebDriver driver) throws InterruptedException, IOException



{
     
     Thread.sleep(10000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   // truckimageupload.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
     licenseimageupload.click();
     Runtime.getRuntime().exec(getimageuploadpath());

}

public void DrivinglicenseexpiryDate(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	driving_license_expiry.click();
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

public void Insuranceimageupload(WebDriver driver) throws InterruptedException, IOException



{
     
     Thread.sleep(10000);
    //   WebDriverWait wait = new WebDriverWait(driver, 50);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(truckimageupload));
		//element.click();
	//	element.sendKeys(getimageuploadpath());
   // truckimageupload.sendKeys(getimageuploadpath());
	  // driver.findElement(By.cssSelector("img[src='../../../assets/img/profile-upload.svg']")).sendKeys("D:\\azhar\\azhar\\company\\IMG_20190814_061616.jpg");
     insuranceimageupload.click();
     Runtime.getRuntime().exec(getimageuploadpath());

}

public void InsuranceeexpiryDate(WebDriver driver) throws InterruptedException, IOException
{	
	
	
	insurance_expiry.click();
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


	 

public void CreateDriver(WebDriver driver) throws InterruptedException, IOException



{
     
     Thread.sleep(5000);
    
     createdriver.click();
     

}

public  String getname() throws IOException
{
	return getpropertyObject().getProperty("drivername");
}

public  String getmob() throws IOException
{
	return getpropertyObject().getProperty("drivermobno");
}

public  String getemail() throws IOException
{
	return getpropertyObject().getProperty("driveremail");
}

public  String getliscenceno() throws IOException
{
	return getpropertyObject().getProperty("liscenceno");
}

public  String getemergencyno() throws IOException
{
	return getpropertyObject().getProperty("emergencyno");
}

public  String getimageuploadpath() throws IOException
{
	return getpropertyObject().getProperty("truckimagepath");
}

public  String getcontactname() throws IOException
{
	return getpropertyObject().getProperty("contactname");
	
}public  String getaddressline() throws IOException
{
	return getpropertyObject().getProperty("addresssline");
	
}public  String getarea() throws IOException
{
	return getpropertyObject().getProperty("driverarea");
	
}public  String getcity() throws IOException
{
	return getpropertyObject().getProperty("drivercity");
}

public  String getstate() throws IOException
{
	return getpropertyObject().getProperty("driverstate");
}

public  String getpincodeo() throws IOException
{
	return getpropertyObject().getProperty("driverpincode");
}

public  String getdrivercontact() throws IOException
{
	return getpropertyObject().getProperty("drivercontact");
}
public  String getgst() throws IOException
{
	return getpropertyObject().getProperty("gst");
}

public  String getfitnessexpirercdate() throws IOException
{
	return getpropertyObject().getProperty("permitrcexpiredate");
}
}

