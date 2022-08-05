package adminPageFactory;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.asserts.SoftAssert;

import resources.AdminData;

public class LeftmenuPage {

	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;

	
	
	@FindBy(xpath="(//span[text()='Trucks'])[1]") 
	WebElement selecttruckfrommenu;
	
	@FindBy(xpath="(//span[text()='Trucks'])[2]") 
	WebElement selecttruck;
	
	@FindBy(how=How.XPATH,using="//span[.='Trucks Category']") 
	WebElement selecttruckcategory;
	
	@FindBy(xpath="//span[.='Trucks Type']") 
	  WebElement  selecttrucktype;
	
	@FindBy(xpath="//h2[contains(.,'Drivers')]") 
	  WebElement  selectdrivers;
	
	@FindBy(xpath="//h2[normalize-space()='Tax']") 
	  WebElement  selecttax;
	
	

	
public void SelectTrucks(WebDriver driver) throws InterruptedException, IOException

       
	
	{
    

	selecttruckfrommenu.click();
	selecttruck.click();

}


public void SelectTrucksCategory(WebDriver driver) throws InterruptedException, IOException



{


        selecttruckfrommenu.click();
        selecttruckcategory.click();

}


public void SelectTrucksTypes(WebDriver driver) throws InterruptedException, IOException



{


        selecttruckfrommenu.click();
        selecttrucktype.click();

}

public void SelectDrivers(WebDriver driver) throws InterruptedException, IOException



{

        selectdrivers.click();

}

public void SelectTax(WebDriver driver) throws InterruptedException, IOException



{

	selecttax.click();

}

}
