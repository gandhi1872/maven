package dataprovider;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class sampleTest {
	
	WebDriver driver;
	
  @Test(dataProvider = "Authentication")
  public void f(String sUsername, String sPassword) {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(sUsername);
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(sPassword);
  }
	  
	  
	  

  @DataProvider(name = "Authentication")
  public Object[][] inputcredentials() {
    return new Object[][] {
      new Object[] { "mindq@gmail.com",    "Test@123" },
      new Object[] { "selenium@gmail.com", "Test@123" },
      new Object[] { "ameerpet@gmail.com",  "test@345" },
      new Object[] { "manual@gmail.com", "test@123" },
    };
  }
  @BeforeTest
  public void browser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
