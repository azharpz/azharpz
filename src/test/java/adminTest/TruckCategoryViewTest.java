package adminTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.LeftmenuPage;
import adminPageFactory.LoginPage;
import adminPageFactory.TruckCategoryListPage;
import adminPageFactory.TruckCategoryPage;
import adminPageFactory.TruckCategoryViewPage;
import resources.AdminLaunch;

public class TruckCategoryViewTest extends AdminLaunch{

	

	@Test
	public  void addtruckcategory() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 LoginPage login = PageFactory.initElements(driver, LoginPage.class);
         LeftmenuPage menu = PageFactory.initElements(driver, LeftmenuPage.class); 
         TruckCategoryPage truck = PageFactory.initElements(driver, TruckCategoryPage.class); 
         TruckCategoryListPage trucklist = PageFactory.initElements(driver, TruckCategoryListPage.class); 
         TruckCategoryViewPage truckview = PageFactory.initElements(driver, TruckCategoryViewPage.class); 



         
			
         login.Enterlogincredential(driver);
         login.Submitlogin(driver);
         truckview.edittruckcategory(driver);
         truckview.gettruckcategorynameinview(driver);
		
		

      }
	

}

