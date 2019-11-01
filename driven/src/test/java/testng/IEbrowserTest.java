package testng;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class IEbrowserTest {
	
	WebDriver driver;
	String appURL = "http://www.yahoo.com";
  @Test
  public void frames() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  driver =new ChromeDriver(); 
	  driver.navigate().to(appURL);
	  
	 // driver.switchTo().frame(driver.findElement(By.id("ob_iframe")));
	  List<WebElement> nframe=driver.findElements(By.tagName("iframe"));
	  System.out.println("no of frames are"+   +nframe.size());
	 
	  
	  		
  }
}
