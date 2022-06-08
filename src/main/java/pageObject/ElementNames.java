package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public final  class ElementNames {
	
    WebDriver driver;

    String price=driver.findElement(By.xpath("//span[@class='truckPrice-area'] ")).getText();
	//    public static final String MsgSuivis = "J-Ke n0 aBU";
	    // ... more names

	  //  private ElementNames() { } // Private default constructor
	}


