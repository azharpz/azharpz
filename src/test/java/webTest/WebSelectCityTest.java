package webTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.SelectCity;
import pageObject.WebSelectCity;
import resources.WebLaunch;

public class WebSelectCityTest extends WebLaunch  {
	
	@Test
	public  void FromandToCitySelection() throws IOException, InterruptedException 
    {
	
		WebDriver driver=capabilities();
		
		WebSelectCity   homepage = new  WebSelectCity  ();
		 homepage.fromCity(driver);
		 homepage.toCity(driver);
		
		
		
		
		
	}
	
						

}
