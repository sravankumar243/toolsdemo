package org.demo.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	public WebDriver driver;
	public homepage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".entry-title")
	public WebElement homePageHeader;
	
	
	
	public String headerValue(){
		String header=homePageHeader.getText();
		return header;
		
		
	}
	
	
	

}
