package pageObject;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidProfilePage {
	static SoftAssert softAssert=new SoftAssert()	;

	
	public static void getPersonnaldetails(AndroidDriver driver) throws InterruptedException

	{
		
   
	            Thread.sleep(3000);	
		        String name=driver.findElementById("com.s9truck.customer:id/txtName").getText();
		        softAssert.assertEquals(name, "azhar");
		        System.out.println("customer name is   "  + name);
		        
		        

		        String mobileno=driver.findElementById("com.s9truck.customer:id/txtUserMobile").getText();
		        softAssert.assertEquals(mobileno, "1234567890");
		        System.out.println("mobile no is   "  + mobileno);
		        
		        
		        WebElement l =driver.findElementById("com.s9truck.customer:id/imgMobile");
		        System.out.println("Src attribute is: "+ l.getTagName());
		        
		    	
		        String gender=driver.findElementById("com.s9truck.customer:id/txtGender").getText();
                String[] strArray = gender.split(":");
		    	String genders = strArray[1].trim();
		        softAssert.assertEquals(genders, "Male");
		        System.out.println("gender is   "  + genders);
		        
		        String companyname=driver.findElementById("com.s9truck.customer:id/txtUserCompanyName").getText();
		        //softAssert.assertEquals(companyname, "Male");
		        System.out.println("companyname is   "  + companyname);
		        
		      
		        String designation=driver.findElementById("com.s9truck.customer:id/txtUserDesignation").getText();
		        //softAssert.assertEquals(designation, "Male");
		        System.out.println("designation is   "  + designation);
		        
		    	 
		        softAssert.assertAll();
		        
		        
	}
	
	public static void getbillingdetails(AndroidDriver driver) throws InterruptedException

	{
		
   		        String companyname=driver.findElementById("com.s9truck.customer:id/txtCompanyName").getText();
		        //softAssert.assertEquals(name, "azhar");
		        System.out.println("companyname is   "  + companyname);
		        

		        String address=driver.findElementById("com.s9truck.customer:id/txtAddress").getText();
		        //softAssert.assertEquals(mobileno, "1234567890");
		        System.out.println("address no is   "  + address);
		        
		        
		        WebElement l =driver.findElementById("com.s9truck.customer:id/imgMobile");
		        System.out.println("Src attribute is: "+ l.getTagName());
		        
		    	
		        String email=driver.findElementById("com.s9truck.customer:id/txtEmail").getText();
		        System.out.println("email is   "  + email);
		        
		        String companynames=driver.findElementById("com.s9truck.customer:id/txtUserCompanyName").getText();
		        //softAssert.assertEquals(companyname, "Male");
		        System.out.println("companyname is   "  + companynames);
		        
		      
		        String mobile=driver.findElementById("com.s9truck.customer:id/txtMobile").getText();
		        //softAssert.assertEquals(designation, "Male");
		        System.out.println("mobile is   "  + mobile);
		        
		        String gst=driver.findElementById("com.s9truck.customer:id/txtGst").getText();
		        //softAssert.assertEquals(designation, "Male");
		        System.out.println("gst is   "  + gst);
		        
		    	 
		        softAssert.assertAll();
		        
		        
	}
	
	public static void getprofileimage(AndroidDriver driver) throws InterruptedException

	{     
		//AndroidElement element = (AndroidElement) driver.findElementById("com.s9truck.customer:id/profile_image");
		//String path = element.getAttribute("src");
	      //  System.out.println("Src attribute is: "+ element.getAttribute("src") );

		        
		AndroidElement l =(AndroidElement) driver.findElementById("com.s9truck.customer:id/profile_image");
		        System.out.println("Src attribute is: "+ l.getTagName());
		        
		
                }
  

		       
		        



}
