package com.gmail.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class gmaillogin{
	
	
	WebDriver driver;
	
	public gmaillogin(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="Email")
	public WebElement emailid; 
	@FindBy(id="next")
	public WebElement next1;
	@FindBy(id="Passwd")
	public WebElement password;
	@FindBy(id="signIn")
	public WebElement signin;
	
	@FindBy(className="aKw")
	public WebElement tab1;
	
	
	//public static boolean flag;
	public boolean loginCredentiontials(String x,String y){
		
		//emailid.sendKeys("sravank41");
		System.out.println(x+":xyyxy:"+y);
		emailid.sendKeys(x);
		next1.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//password.sendKeys("sreedevii");
		password.sendKeys(y);
		signin.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//flag=tab1.isDisplayed();
		boolean flag1=tab1.isDisplayed();
		
		return flag1;
		
	}
	
		
		
		
	

}
