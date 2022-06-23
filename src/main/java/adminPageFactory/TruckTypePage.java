package adminPageFactory;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import resources.AdminData;

public class TruckTypePage extends AdminData{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="//button[normalize-space()='Add']") 
	WebElement addtruckbutton;
	
	@FindBy(xpath="//input[@formcontrolname='truck_weight']") 
	WebElement truckweight;
	
	@FindBy(xpath="//input[@formcontrolname='truck_feet']") 
	WebElement truckfeet;
	
	@FindBy(xpath="//input[@formcontrolname='truck_type_description']") 
	WebElement truckdesc;
	
	@FindBy(xpath="//input[@formcontrolname='minimum_amount']") 
	  WebElement  minimumamount;
	
	@FindBy(xpath="//input[@formcontrolname='spped_limit']") 
	  WebElement  speedlimit;
	
	@FindBy(xpath="//button[normalize-space()='Submit']") 
	WebElement addtrucktype;
	
	@FindBy(css="img[src='../../../assets/img/upload.svg']") 
	  WebElement  truckimageupload;
	
	@FindBy(xpath="//mat-select[.='Select Category']") 
	  WebElement  selecttruckcategory;
	
	@FindBy(xpath="//span[@class='mat-option-text']") 
	  List<WebElement>  trucktype;
	
	

public void AddTruckstypesbutton(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(3000);

    addtruckbutton.click();

}


	
public void AddTruckstypesdetail(WebDriver driver) throws InterruptedException, IOException

       
	
	{
    
	Thread.sleep(3000);

	truckweight.sendKeys(gettruckweight());
	truckfeet.sendKeys(gettruckfeet());
	truckdesc.sendKeys(gettruckdesc());
	minimumamount.sendKeys(getminimumamount());
	speedlimit.sendKeys(gettruckspeed());

}
	

public void Selecttruckcategory(WebDriver driver) throws InterruptedException

{

	selecttruckcategory.click();
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
 
   trucktype.get(3).click();

              
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
	 

public void CreateTruckType(WebDriver driver) throws InterruptedException, IOException



{
     
     Thread.sleep(5000);
    
     addtrucktype.click();
     

}

public  String gettruckweight() throws IOException
{
	return getpropertyObject().getProperty("weight");
}

public  String gettruckfeet() throws IOException
{
	return getpropertyObject().getProperty("feet");
}

public  String gettruckdesc() throws IOException
{
	return getpropertyObject().getProperty("truckdesc");
}

public  String getminimumamount() throws IOException
{
	return getpropertyObject().getProperty("minamount");
}

public  String gettruckspeed() throws IOException
{
	return getpropertyObject().getProperty("speedlimit");
}

public  String getimageuploadpath() throws IOException
{
	return getpropertyObject().getProperty("truckimagepath");
}

}

