package org.demo.demomaven;

import junit.framework.Assert;

import org.demo.config.congig;
import org.demo.homepage.homepage;
import org.testng.annotations.Test;

public class toolstests extends congig{
	
	
	
	
	@Test
	public void verifyHomePageHeader(){
	
		homepage hp=new homepage(driver);
		
		
		String s=hp.homePageHeader.getText();
		System.out.println(s);
		Assert.assertEquals("Home", s);
		
	}
	
	
	@Test
	public void verifyPageHeader1(){
		
		homepage hp=new homepage(driver);
		
		Assert.assertEquals(hp.headerValue(),"Home");
		
	}
	
	
	

}
