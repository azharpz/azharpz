package adminTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.LeftmenuPage;
import adminPageFactory.LoginPage;
import adminPageFactory.TrucksPage;
import resources.AdminLaunch;

public class TrucksTest extends AdminLaunch{
	
	@Test
	public  void login() throws IOException, InterruptedException 
    {
	
		 WebDriver driver=capabilities();
		 
		 LoginPage login = PageFactory.initElements(driver, LoginPage.class);
         LeftmenuPage menu = PageFactory.initElements(driver, LeftmenuPage.class); 
         TrucksPage truck = PageFactory.initElements(driver, TrucksPage.class); 

		 
			
         login.Enterlogincredential(driver);
         login.Submitlogin(driver);
		 menu.SelectTrucks(driver);
		 truck.AddTrucksbutton(driver);
		 truck.AddTrucksdetails(driver);
		 truck.Selecttruckcategory(driver);
		 truck.Selecttrucktype(driver);
		 truck.ChooseRCDate(driver);
		 truck.VehicleexpiryDate(driver);
		 truck.VehicleRCimageupload(driver);
		 truck.FitnessexpiryDate(driver);
		 truck.Fitnessimageupload(driver);
		 truck.PermitexpiryDate(driver);
		 truck.PermitRCimageupload(driver);
		 truck.InsuranceexpiryDate(driver);
		 truck.Insuranceimageupload(driver);
		 truck.PollutionexpiryDate(driver);
		 truck.Pollutionimageupload(driver);
		 truck.Truckimageupload(driver);



         
		 
		
		
	}
	

}
