package pageObject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import adminPageFactory.TruckCategoryPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import resources.AdminLaunch;
import resources.MobileData;

public class AndroidCreateRoutePage extends MobileData{
static SoftAssert softAssert=new SoftAssert()	;




@FindBy(id="com.s9truck.driver:id/sliderOfflineButton")
static 
AndroidElement slidder;

@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat[2]/android.widget.ImageView")
static 
AndroidElement scrolup;

@FindBy(how=How.ID,using="com.s9truck.driver:id/txtPickup")
static 
AndroidElement from;

@FindBy(id="com.s9truck.driver:id/txtDrop") 
static  AndroidElement   to;

@FindBy(id="com.s9truck.driver:id/edtDate") 
static  AndroidElement   date;

@FindBy(xpath="//android.view.View[@content-desc=\"13 July 2022\"]") 
static  AndroidElement   choosedate;

@FindBy(id="android:id/button1") 
static  AndroidElement   ok;

@FindBy(id="com.s9truck.driver:id/edtPrice") 
static  AndroidElement   price;

@FindBy(id="com.s9truck.driver:id/btnNext") 
static  AndroidElement   create;


@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.TextView[1]") 
static  AndroidElement   getstatus;

public AndroidCreateRoutePage(AndroidDriver driver) {
	AdminLaunch.driver=driver;
	PageFactory.initElements(driver,this); 
	//logger  = Logger.getLogger(TruckCategoryPage.class.getName());
}


	public static void Routeldetails(AndroidDriver driver) throws InterruptedException, IOException
     
	
	{
    

		from.sendKeys(getfrom());
	to.sendKeys(getto());

}
public static void Pricedetails(AndroidDriver driver) throws InterruptedException, IOException
     
	
	{
    

	price.sendKeys(getprice());


}

public static void SelecttDate(AndroidDriver driver) throws InterruptedException


{


	date.click();
	choosedate.click();
	ok.click();

	


}

public static void CreateRoute(AndroidDriver driver) throws InterruptedException


{


	
	create.click();

	


}
public static void EnableOnline(AndroidDriver driver) throws InterruptedException


{
	//AndroidTouchAction ta = new AndroidTouchAction(driver);
	//AndroidElement ele=slidder;
	//ta.press(ElementOption.element(ele)).perform();
	//ta.release().perform();
	WebElement slider = (slidder);
	Actions action = new Actions(driver);
	action.dragAndDropBy(slider, 0, 100).perform();
	
   slidder.click();
	//scrolup.click();

	}

public static  String getfrom() throws IOException
{
	return getpropertyObject().getProperty("driverfrom");
}
public static  String getto() throws IOException
{
	return getpropertyObject().getProperty("driverto");
}
public static  String getprice() throws IOException
{
	return getpropertyObject().getProperty("driverprice");
}
}
