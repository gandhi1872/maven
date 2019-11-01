package datadrivensce;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Popup_sbi {
	 static WebDriver driver;
	 static String appURL = "https://www.onlinesbi.com/";
	 
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", File.separator+"selenium"+File.separator+"driver"+File.separator+"geckodriver.exe");
		driver =new FirefoxDriver();
		driver.navigate().to(appURL);
		
		driver.findElement(By.className("classicTxt")).click();
		driver.findElement(By.className("login_button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Login Password')]")).click();
				
		
		String MainWindow = driver.getWindowHandle();
		System.out.println("main Window id is:"+MainWindow);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("all window id's are"+s1);
		Iterator<String> i1=s1.iterator();
		
		while (i1.hasNext()) {
		String ChildWindow=i1.next();
			if(!MainWindow.equals(ChildWindow)) {
		driver.switchTo().window(ChildWindow);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			new Select(driver.findElement(By.xpath("//select[@name='issueCode']"))).selectByVisibleText("Forgot Username");
			driver.findElement(By.name("nextStep")).click();	
			driver.findElement(By.name("cifno")).sendKeys("20145301563");
			new Select(driver.findElement(By.name("countryCode"))).selectByVisibleText("India");
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
             driver.findElement(By.name("mobileNumber")).sendKeys("8688102332");
           
             Scanner scan=new Scanner(System.in);
             System.out.println("enter captcha");
             String captcha=scan.nextLine();
             driver.findElement(By.name("captchaValue")).sendKeys(captcha);
             Thread.sleep(7000);
             WebDriverWait wait=new WebDriverWait(driver, 50);
            WebElement str= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Submit")));
            str.click();
             
            driver.close();
             
			}
		
		}
			driver.switchTo().window(MainWindow);	
	}		

	}


