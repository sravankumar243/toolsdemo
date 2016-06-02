package org.demo.config;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class congig {
	
	public static WebDriver driver;
	
	
	@Parameters("browserName")
	//@BeforeClass
	//@BeforeTest
	@BeforeMethod
	public void Beforesetup(String browserName) throws MalformedURLException{
		if(browserName.equalsIgnoreCase("FF")){
			driver=new FirefoxDriver();
			//DesiredCapabilities d=new DesiredCapabilities().firefox();
			//driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),d);
			
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("http://demoqa.com/");
		//driver.get("http://www.gmail.com");
		
		
		
	}
	
	
	
	
	//@AfterClass
	//@AfterTest
	@AfterMethod
	
	public void Aftersetup(){
		driver.close();
		driver.quit();
		
	}
}
