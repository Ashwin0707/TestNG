package org.test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	
	public WebDriver driver;
	
	@Parameters ({"browser"})
	@Test
	
	private void browserparallel (String browserdetails) {
	
		if (browserdetails.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwin Babu\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		
		else if (browserdetails.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ashwin Babu\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
			driver =new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
		}
		
		else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Ashwin Babu\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
			
			driver =new InternetExplorerDriver();
			driver.get("https://www.facebook.com/");
		}

	}
	
	

}
