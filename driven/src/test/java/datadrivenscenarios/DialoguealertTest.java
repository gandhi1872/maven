package datadrivenscenarios;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class DialoguealertTest {
	
	WebDriver driver;
	
  @Test
  public void alertTest() throws Exception {
	  driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
	  Thread.sleep(2000);
	  System.out.println(driver.switchTo().alert().getText());
	  driver.switchTo().alert().accept();
  }
    
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.manage().window().maximize();
	  	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
