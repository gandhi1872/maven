package datadrivenscenarios;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IciciActionsTest {
	
	WebDriver driver;
	
  @Test
  public void mousehovering() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page");
	  driver.manage().window().maximize();
	  
	  Actions a=new Actions(driver);
	  a.moveToElement(driver.findElement(By.xpath("//div[@class='navHover0']"))).build().perform();
	  a.moveToElement(driver.findElement(By.xpath("//div[@class='container']"))).build().perform();
	  
	  
	  }
}
