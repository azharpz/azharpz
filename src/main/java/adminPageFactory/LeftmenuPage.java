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

	
	
	@FindBy(xpath="//h2[normalize-space()='Trucks']") 
	WebElement selecttruckfrommenu;
	
	@FindBy(xpath="//button[normalize-space()='Trucks']") 
	WebElement selecttruck;
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Trucks Category']") 
	WebElement selecttruckcategory;
	
	@FindBy(xpath="//button[normalize-space()='Trucks Type']") 
	  WebElement  selecttrucktype;
	
	

	
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

}
