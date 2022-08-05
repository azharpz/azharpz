package adminTest;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import adminPageFactory.DriversPage;
import adminPageFactory.LeftmenuPage;
import adminPageFactory.LoginPage;
import adminPageFactory.TaxPage;
import resources.AdminLaunch;

public class TaxTest extends AdminLaunch{
	
	@Test
	public  void adddrivertax() throws IOException, InterruptedException, AWTException 
    {
	
		 WebDriver driver=capabilities();
		 
		 LoginPage login = PageFactory.initElements(driver, LoginPage.class);
         LeftmenuPage menu = PageFactory.initElements(driver, LeftmenuPage.class); 
         TaxPage tx = PageFactory.initElements(driver, TaxPage.class); 

         
			
         login.Enterlogincredential(driver);
         login.Submitlogin(driver);
		 menu.SelectTax(driver);
		 tx.Choosedrivertax(driver);
		 tx.Addbutton(driver);
		 tx.SelectTruckCategory(driver);
		 tx.SelectTruckType(driver);
		 tx.SelectTaxType(driver);
		 tx.SaveTax(driver);
		 
	
		
    }
	

}
