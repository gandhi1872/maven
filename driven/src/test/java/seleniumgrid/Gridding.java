package seleniumgrid;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class Gridding {
	
	WebDriver driver;
	String baseUrl,nodeUrl;
	
	public void setup() {
		baseUrl="http://tv9.com";
		nodeUrl="http://192.168.0.148:2905/wd/hub";
		
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		
		try {
			driver=new RemoteWebDriver(new URL(nodeUrl), capability);
			
		}
			catch (MalformedURLException e) {
			 
			 e.printStackTrace();
			 
		
		 }
		
		
	}
	
	public void simpletest() {
		driver.get(baseUrl);
		Assert.assertEquals("TV9",driver.getTitle());
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Gridding s=new Gridding();
		 s.setup();
		 s.simpletest();
		 
		
	}

}
