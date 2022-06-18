package androidTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidLoginPage;
import resources.AndroidLaunch;

public class AndroidTest extends AndroidLaunch  {

//	public static void main(String[] args) throws MalformedURLException {
	@Test
	public void TC_1A_AndroidLogin() throws InterruptedException, IOException {

		SoftAssert softAssert = new SoftAssert();

		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		AndroidTest al = new AndroidTest();
		AndroidTest.androidLogin(driver);


	//	String expected_title = "TripSheet";
	//	String actual_title = driver.getTitle();
		
	//	ServerEvents actual_title = driver.getEvents();
		
		//Assert.assertEquals(expected_title, actual_title);

	//	System.out.println("actual_title" + actual_title);

	}

	
	

	public static void androidLogin(AndroidDriver<AndroidElement> driver) throws InterruptedException

	{

		// WebDriverWait wait = new WebDriverWait(driver, 60);
		// WebElement smilyIcon =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profile_overflow")));
		// smilyIcon.click();
		//driver.findElementById("com.eservicepro.technician:id/email_et").sendKeys("azharjaveedpz@gmail.com");
	//	driver.findElementById("com.eservicepro.technician:id/password_et").sendKeys("b8wdiszd");
		//driver.findElementById("com.eservicepro.technician:id/login_btn").click();
		driver.findElementById("com.hss.android.viaetruck:id/bookLayout").click();
		Thread.sleep(3000);
		driver.findElementById("com.hss.android.viaetruck:id/pickUpLocation_txt").click();
		driver.findElementById("com.hss.android.viaetruck:id/pickUpLocation_txt").sendKeys("nel");


	//	driver.findElementById("com.hss.android.viaetruck:id/pickUpLocation_txt").click();

	 	Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='pac-container pac-logo'])[1")));
		

		// List<WebElement>	date=  driver.findElements(By.xpath("(//div[@class='pac-container pac-logo'])[1]"));
		 List<AndroidElement>	fromcity=  driver.findElementsByXPath("com.hss.android.viaetruck:id/places_autocomplete_content");

		 
				
	               int fromcitycount= fromcity.size();

	                System.out.println(fromcitycount);
	 
	                fromcity.get(fromcitycount-1).click();
		driver.findElementById("com.hss.android.viaetruck:id/dropLocation_txt").sendKeys("Naidupe");
		 Thread.sleep(3000);

			// List<WebElement>	dates=  driver.findElements(By.xpath("(//div[@class='pac-container pac-logo'])[2]"));
		 List<AndroidElement>	tocity=  driver.findElementsByXPath("com.hss.android.viaetruck:id/places_autocomplete_content");
		    int tocitycounts= tocity.size();
		    System.out.println(tocitycounts);
		    tocity.get(tocitycounts-2).click();

	}

	
	


}
