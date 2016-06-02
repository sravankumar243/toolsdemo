package org.demo.demomaven;

import java.util.concurrent.TimeUnit;

import org.demo.config.congig;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gmail.login.gmaillogin;

public class gmailtests extends congig {
	
	
	@Test(dataProvider="testdata")
	public void logintests(String p1,String p2,String p3,int p4){
		gmaillogin gl=new gmaillogin(driver);
		
		System.out.println(p1+"::"+p2);
		System.out.println(p3);
		System.out.println(p4);
		/*gl.loginCredentiontials();
		
		gl.emailid.sendKeys("sravank41");
		
		gl.next1.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		gl.password.sendKeys("sreedevii");
		
		gl.signin.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		*/
		/*System.out.println("Element:"+gl.inboxText.isDisplayed());
		System.out.println("Element:"+gl.inboxText.getText());*/
		//boolean flag= gl.tab1.isDisplayed();
		//System.out.println(gl.flag);
		boolean flag2=gl.loginCredentiontials(p1,p2);
		//Assert.assertTrue(gl.flag);
		
		Assert.assertTrue(flag2);
		
	}
	
	
	
	
	
	@DataProvider
	public Object[][] testdata(){
		
		
		
		return new Object[][]
				{
				
				{"sravank41","sreedevii","hello",4},
				{"mskumar.se","sreedevii","hi",5}
				
				};
	

	}
}
