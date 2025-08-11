package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksPage extends BaseClass{

		
	@Before
	public void setup() {
		BaseClass.initDriver();
		
	    
	}
	@After
	public void teardown() {
		BaseClass.quitDriver();
	}
}
