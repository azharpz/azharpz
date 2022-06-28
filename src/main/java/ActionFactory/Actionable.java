package ActionFactory;

import java.beans.beancontext.BeanContext;
import java.time.Duration;

import javax.print.Doc;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public abstract class Actionable {

	  protected WebDriver driver;
	  protected Platform platform;
	  protected AndroidElement Element;
	  protected Doc Do;

	  public abstract String doAction(BeanContext... elementContext) throws Exception;

	  protected void swipe(int startX, int startY, int endX, int endY, WebDriver driver) {
	    PointOption pointOptionStart = PointOption.point(startX, startY);
	    PointOption pointOptionEnd = PointOption.point(endX, endY);

	    new TouchAction((PerformsTouchActions) driver).longPress(pointOptionStart)
	        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(pointOptionEnd)
	        .release().perform();
	  }

	}