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

public class TaxPage extends AdminData{

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="//a[normalize-space()='Driver']") 
	WebElement clickdriver;
	
	@FindBy(xpath="//p[@class='consign']") 
	WebElement gettaxtype;
	
	@FindBy(xpath="//button[normalize-space()='Add']") 
	WebElement adddriver;
	
	
	@FindBy(xpath="//mat-select[@placeholder='Truck Category']") 
	  WebElement  selecttruckcategorydd;
	
	@FindBy(xpath="//span[@class='mat-option-text']") 
	  List<WebElement>  choosetruckcategory;
	
	@FindBy(xpath="//mat-select[@formcontrolname='truck_type']") 
	  WebElement  selecttrucktypedd;
	
	@FindBy(xpath="//span[@class='mat-option-text']") 
	  List<WebElement>  choosetrucktype;
	
	@FindBy(xpath="//input[@formcontrolname='tax_name']") 
	  WebElement  taxname;
	
	@FindBy(xpath="//input[@formcontrolname='tax_deduction']") 
	  WebElement  taxdeduction;
	
	@FindBy(xpath="//mat-select[@formcontrolname='tax_type']") 
	  WebElement  selecttaxtypedd;
	
	@FindBy(xpath="//span[@class='mat-option-text']") 
	  List<WebElement>  choosetax;
	

	@FindBy(xpath="//input[@formcontrolname='tax_description']") 
	  WebElement  taxdesc;
	
	
	@FindBy(xpath="//button[normalize-space()='Save']") 
	  WebElement  savetax;
	

public void Choosedrivertax(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	Thread.sleep(3000);

	clickdriver.click();
	  String taxtypechoosen = gettaxtype.getText();


	    System.out.println("selected tax  is   "  + taxtypechoosen);
	   softAssert.assertEquals(taxtypechoosen, "Driver");

	

}

public void Addbutton(WebDriver driver) throws InterruptedException, IOException



{
	 adddriver.click();
	 taxname.sendKeys(gettaxname());
	 taxdeduction.sendKeys(gettaxdeduction());
	 taxdesc.sendKeys(gettaxdesc());
	


}

public void SelectTruckCategory(WebDriver driver) throws InterruptedException, IOException

{

	selecttruckcategorydd.click();
     Thread.sleep(2000);
 
     SelectDropDownElement( choosetruckcategory);
  
              
}

public void SelectTruckType(WebDriver driver) throws InterruptedException, IOException

{
	 Thread.sleep(3000);
	 selecttrucktypedd.click();
    
 
     SelectDropDownElement( choosetax);
  
              
}

public void SelectTaxType(WebDriver driver) throws InterruptedException, IOException

{

	selecttaxtypedd.click();
     Thread.sleep(3000);
 
     SelectDropDownElement( choosetax);
  
              
}

public void SaveTax(WebDriver driver) throws InterruptedException, IOException

{

	
 
	clickElement( savetax);
  
              
}



public  String gettaxname() throws IOException
{
	return getpropertyObject().getProperty("taxname");
}

public  String gettaxdeduction() throws IOException
{
	return getpropertyObject().getProperty("taxdeduction");
}

public  String gettaxdesc() throws IOException
{
	return getpropertyObject().getProperty("taxdesc");
}
}