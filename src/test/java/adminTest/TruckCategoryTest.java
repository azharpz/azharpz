package adminTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.LeftmenuPage;
import adminPageFactory.LoginPage;
import adminPageFactory.TruckCategoryPage;
import adminPageFactory.TrucksPage;
import resources.AdminLaunch;

public class TruckCategoryTest extends AdminLaunch{
	
	@Test
	public  void addtruckcategory() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 LoginPage login = PageFactory.initElements(driver, LoginPage.class);
         LeftmenuPage menu = PageFactory.initElements(driver, LeftmenuPage.class); 
         TruckCategoryPage truck = PageFactory.initElements(driver, TruckCategoryPage.class); 

         
			
         login.Enterlogincredential(driver);
         login.Submitlogin(driver);
		 menu.SelectTrucksCategory(driver);
		 truck.AddTrucksbutton(driver);
		 truck.AddTruckscategory(driver);
		 truck.Truckimageupload(driver);
		 truck.CreateTruckCategory(driver);
		

      }
	

}
