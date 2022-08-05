package androidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.AndroidS9BilligDetailPage;
import pageObject.AndroidS9LoaddetailPage;
import pageObject.AndroidS9PaymentReviewPage;
import pageObject.AndroidS9TruckCategory;
import pageObject.AndroidS9TruckdetailsPage;
import pageObject.AndroidS9selectcities;
import resources.AndroidLaunch;

public class AndroidS9TruckCategoryTest  extends AndroidLaunch  {

	@Test
	public  void selectTruckTypes() throws IOException, InterruptedException 
    {
	
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		AndroidS9selectcities sc = new AndroidS9selectcities();
		AndroidS9TruckCategory tt = new AndroidS9TruckCategory();


		
       AndroidS9selectcities.fromCity(driver);
       AndroidS9selectcities.toCity(driver);
       AndroidS9TruckCategory.truckType(driver);
       AndroidS9TruckCategory.truckWeights(driver);
       AndroidS9TruckCategory.dateSelect(driver);
       AndroidS9TruckdetailsPage.truckDetails(driver);
       AndroidS9TruckdetailsPage.selecttrucks(driver);
       AndroidS9LoaddetailPage.loadDetails(driver);
       AndroidS9LoaddetailPage.next(driver);
       AndroidS9BilligDetailPage.pickupDetails(driver);
       AndroidS9BilligDetailPage.dropoffDetails(driver);
       AndroidS9BilligDetailPage.Gonext(driver);
       AndroidS9PaymentReviewPage.farebrakeup(driver);
       AndroidS9PaymentReviewPage.CreateQuote(driver);


       



		
    }	
	}
