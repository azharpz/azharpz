package adminTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.DriversPage;
import adminPageFactory.LeftmenuPage;
import adminPageFactory.LoginPage;
import adminPageFactory.TruckTypePage;
import resources.AdminLaunch;

public class DriversTest extends AdminLaunch{
	
	@Test
	public  void adddriver() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 LoginPage login = PageFactory.initElements(driver, LoginPage.class);
         LeftmenuPage menu = PageFactory.initElements(driver, LeftmenuPage.class); 
         DriversPage dp = PageFactory.initElements(driver, DriversPage.class); 

         
			
         login.Enterlogincredential(driver);
         login.Submitlogin(driver);
		 menu.SelectDrivers(driver);
		 dp.Addbbutton(driver);
		 dp.Adddriversdetail(driver);
		 dp.Selecttruckcategory(driver);
		 dp.Driverimageupload(driver);
		 dp.DrivingexpiryDate(driver);
		 dp.Gender(driver);
		 dp.DOB(driver); 
		 dp.Addcontactdetail(driver);
		 dp.DrivingexpiryDate(driver);
		 dp.Driverlicensceimageupload(driver);
		 dp.InsuranceeexpiryDate(driver);
		 dp.Insuranceimageupload(driver);
		 dp.CreateDriver(driver);
	
		
    }
	

}
