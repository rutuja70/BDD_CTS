package genericlib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void initDriver() {
		if(driver==null) {
			driver=new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void quitDriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}
}
