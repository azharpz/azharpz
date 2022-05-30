package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.BookingReview;
import pageObject.LoadCategory;
import pageObject.PaymentDetails;
import pageObject.PaywithDDandNFT;
import pageObject.PickupandDropDetails;
import pageObject.SelectCity;
import pageObject.Signin;
import pageObject.TotalCalculation;
import pageObject.TruckCategoryandSchedule;
import resources.WebLaunch;

public class PaywithDDTest extends WebLaunch{
	
	@Test
	public  void payWithDD() throws IOException, InterruptedException 
    {
	
		WebDriver driver=capabilities();
		SelectCity   homepage = new  SelectCity  ();
		homepage.fromCity(driver);
		homepage.toCity(driver);
		homepage.requestaQuote(driver);
		PickupandDropDetails   bookingpage = new  PickupandDropDetails  ();
		bookingpage.pickupCity(driver);
		bookingpage.dropCity(driver);
		bookingpage.next(driver);
		//bookingpage.viewpickupCity(driver);
		TruckCategoryandSchedule   truckpage = new  TruckCategoryandSchedule  ();
		truckpage.truckSelection(driver);
		truckpage.trucktypeSelection(driver);
		truckpage.dateSelection(driver);
		truckpage.timeSelection(driver);
		truckpage.next(driver);
		LoadCategory   loadtype = new  LoadCategory  ();
		loadtype.loadType(driver);
		loadtype.packageType(driver);
		loadtype.next(driver);
		Signin   login = new  Signin  ();
		login.signin(driver);
		TotalCalculation   tv = new  TotalCalculation  ();
        tv.taxdetails(driver);
        tv.totalamount(driver);
        tv.next(driver);
        PaymentDetails   paymentpage = new  PaymentDetails  ();
        paymentpage.pickUpandDrop(driver);
        paymentpage.paymentType(driver);
        paymentpage.paymentMethod(driver);
        BookingReview   reviewpage = new  BookingReview  ();
        reviewpage.reviewpage(driver);
        reviewpage.next(driver);
        reviewpage.payNow(driver);
        PaywithDDandNFT   DD = new  PaywithDDandNFT  ();
        DD.paywithDD(driver);
        DD.paymentdate(driver);
        DD.paymentMethod(driver);
        DD.confirmpayment(driver);


		
		
    }	
	}