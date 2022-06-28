package adminPageFactory;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import resources.AdminLaunch;

public class TruckCategoryViewPage extends TruckCategoryListPage {

	

	public TruckCategoryViewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}





	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="(//div[@class='dec'])[1]") 
	WebElement  actualtruck_categorsy_name;
	
	
	
	 @FindBy(xpath="(//img[@class='editimg'])[3]") 
		WebElement edit;
	 
	

	
	
public void gettruckcategorynameinview(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(10000);

	
	 String  truckcategoryname = truck_category_name.getText();
	 String  actualtruckcategoryname = actualtruck_categorsy_name.getText();


	    System.out.println("expectedtruckname is   "  + truckcategoryname);
	    System.out.println("actualtruckname is   "  + actualtruckcategoryname);
	   softAssert.assertEquals(truckcategoryname, actualtruckcategoryname);
	    
	   // return truckcategoryname;
}

public void edittruckcategory(WebDriver driver) throws InterruptedException, IOException



{
Thread.sleep(10000);
           edit.click();


}

}

	
