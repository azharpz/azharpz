package adminTest;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.LeftmenuPage;
import adminPageFactory.LoginPage;
import adminPageFactory.TruckTypePage;
import adminPageFactory.TrucksPage;
import resources.AdminLaunch;

public class TruckTypeTest extends AdminLaunch{
	
	@Test
	public  void addtrucktype() throws IOException, InterruptedException, AWTException 
    {
	
		 WebDriver driver=capabilities();
		 
		 LoginPage login = PageFactory.initElements(driver, LoginPage.class);
         LeftmenuPage menu = PageFactory.initElements(driver, LeftmenuPage.class); 
         TruckTypePage truck = PageFactory.initElements(driver, TruckTypePage.class); 

         
			
         login.Enterlogincredential(driver);
         login.Submitlogin(driver);
		 menu.SelectTrucksTypes(driver);
		 truck.AddTruckstypesbutton(driver);
		 truck.AddTruckstypesdetail(driver);
		 truck.Selecttruckcategory(driver);
		 truck.Truckimageupload(driver);
		 truck.CreateTruckType(driver);
	
		
    }
	

}
