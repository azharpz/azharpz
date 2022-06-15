package pageObject;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class WebTripsPage {
	
	
	private static  Logger logger = LogManager.getLogger(LoginPage.class.getName());

	static SoftAssert softAssert=new SoftAssert()	;
	
	
	  	
	
public void allTrips(WebDriver driver) throws InterruptedException, IOException

       
	
	{
	
	Thread.sleep(2000);
   // String  TID=	driver.findElement(By.xpath("(//h6[position()=1])[1]")).getText();

  //  System.out.println("Trip id  is   "  + TID);
   // softAssert.assertEquals(username, "azharios");
	 List<WebElement>	triplist=  driver.findElements(By.xpath("(//div[@class='col-md-9'])[2]"));
	 Iterator<WebElement> itr=triplist.iterator();
	 int i=1;
	 String value="";
	 while(itr.hasNext())
	 {
		 WebElement element=itr.next();
		 value=element.getText();
		 System.out.println("name of trip is   "  + value);
	 }
	 int	triplists= driver.findElements(By.xpath("(//div[@class='col-md-9'])[2] ")).size();

     System.out.println("no of triplist is   "  + triplists);


     String  TID=	driver.findElement(By.xpath("(//h6[position()=1])[1]")).getText();

     System.out.println("Trip id  is   "  + TID);
     
     
     String  amountpaid=	driver.findElement(By.xpath("(//p[position()=1])[1]")).getText();

    String[] strArray = amountpaid.split("₹");
	
	   String amountpaids = strArray[1].trim();
	 int PaidAmonut = (int) Float.parseFloat(amountpaids);
	   
	   System.out.println("PaidAmonut displayed as  "  +PaidAmonut);
	   
	   
	   String  balanceamount=	driver.findElement(By.xpath("(//p[position()=1])[2]")).getText();

	   String[] strArray1 = balanceamount.split("₹");
		
		   String balanceamounts = strArray1[1].trim();
		   int BalanceAmonut = (int) Float.parseFloat(balanceamounts);
		   
		   System.out.println("BalanceAmonut displayed as  "  +BalanceAmonut);
	 
		   
		   String  billamount=	driver.findElement(By.xpath("(//p[position()=1])[3]")).getText();

		   String[] strArray2 = billamount.split("₹");
			
			   String billamounta = strArray2[1].trim();
			   int BillingAmonut = (int) Float.parseFloat(billamounta);
			   
			   System.out.println("billingAmonut displayed as  "  +BillingAmonut);
			   
			   
			   String  date=	driver.findElement(By.xpath("(//p[position()=1])[4]")).getText();
				   
				   System.out.println("tripdate displayed as  "  +date);
		 
               String  weight=	driver.findElement(By.xpath("(//p[position()=1])[5]")).getText();
				   
				   System.out.println("weight displayed as  "  +weight);
				   
				   String  route=	driver.findElement(By.xpath("//body[1]/app-root[1]/app-trips[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
				   System.out.println("route displayed as  "  +route);


	}

	
	
	
}

