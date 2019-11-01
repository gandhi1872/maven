package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshotTest {
	
	WebDriver driver;
		
  @Test
  public void screenshots() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://tv9.com/");
	  driver.manage().window().maximize();
	  
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(f, new File("C:\\Users\\Dileep\\git\\mavenproject\\driven\\screenshot\\TV9.png"));
	  
	  driver.close();
  }
}
