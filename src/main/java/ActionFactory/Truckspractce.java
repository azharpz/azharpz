package ActionFactory;

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
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import adminPageFactory.LoginPage;
import resources.AdminData;
import resources.AdminLaunch;

public class Truckspractce extends AdminData{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="//button[normalize-space()='Add']") 
	WebElement addtruckbutton;
	
	@FindBy(xpath="//input[@formcontrolname='truck_number']") 
	WebElement trucknumber;
	
	@FindBy(xpath="//input[@formcontrolname='home_location']") 
	List<WebElement> homelocation;
	
	@FindBy(how=How.XPATH,using="//input[@formcontrolname='make_name']") 
	WebElement make_name;
	
	 
	 public Truckspractce(WebDriver driver) {
			AdminLaunch.driver=driver;
			PageFactory.initElements(driver,this); 
			//logger  = Logger.getLogger(TruckCategoryListPage.class.getName());
		}

	
	public void Insuranceimageupload(WebDriver driver) throws InterruptedException, IOException, AWTException



	{
	  
	   // homelocation.click();
	   
	     Robot rb = new Robot();
	   	rb.setAutoDelay(3000);
	   	StringSelection str = new StringSelection("getimageuploadpaths");
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
	       
	       List<WebElement>  test=homelocation;
	       
	       int count=test.size();
	       
	      
	    		  
	    	  }
	      
	       

	}

