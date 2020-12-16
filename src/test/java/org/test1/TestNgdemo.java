package org.test1;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestNgdemo {
	
	 public WebDriver driver;
	
	/*@BeforeClass
	private void launchbrowser() {
		

	}
	
	@AfterClass(enabled=false)
	private void closeBrowser() {
		driver.quit();

	}
	
	@BeforeMethod
	private void starttime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@AfterMethod
	private void endtime() {
		Date e=new Date();
		System.out.println(e);

	}*/
	
	
	@Test (dataProvider = "login")
	private void fbLogin (String email, String pass) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashwin Babu\\eclipse-workspace\\MvnProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	
	}
	@DataProvider (name ="login")
	public Object [][] fblogin() {
		return new Object [][]{
				{"Ashwin123@","Ashwin"},
				{"Babu123@", "Babu"}, 
				{"Tab1@123", "Tab1"}

	};
	
	
	
	}
	}
	
	
	



