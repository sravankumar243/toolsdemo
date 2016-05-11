package org.demo.demomaven;

import java.io.File;
import java.io.IOException;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.demo.config.congig;
import org.demo.homepage.homepage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	
	@Test
	public void takingscreenshots() throws IOException{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("e://1.jpeg"));
		
		
	}
	
	

}
