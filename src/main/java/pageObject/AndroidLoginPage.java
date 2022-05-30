package pageObject;

import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class AndroidLoginPage {
	
	
	public static void androidLogin(AndroidDriver driver)

	{

		// WebDriverWait wait = new WebDriverWait(driver, 60);
		// WebElement smilyIcon =
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profile_overflow")));
		// smilyIcon.click();
		//driver.findElementById("com.eservicepro.technician:id/email_et").sendKeys("azharjaveedpz@gmail.com");
	//	driver.findElementById("com.eservicepro.technician:id/password_et").sendKeys("b8wdiszd");
		//driver.findElementById("com.eservicepro.technician:id/login_btn").click();
		driver.findElementById("com.hss.android.viaetruck:id/bookLayout").click();

	}
}
