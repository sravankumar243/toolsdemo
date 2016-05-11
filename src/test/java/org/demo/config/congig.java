package org.demo.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class congig {
	
	public static WebDriver driver;

	
	@Parameters("browserName")
	@BeforeClass
	public void Beforesetup(String browserName){
		if(browserName.equalsIgnoreCase("FF")){
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("http://demoqa.com/");
		
		
		
	}
	
	
	
	
	@AfterClass
	public void Aftersetup(){
		driver.close();
		driver.quit();
		
	}
}
