package org.demo.demomaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.demo.config.congig;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.gmail.login.gmaillogin;

public class apachixltests extends congig {
	
	String id1;
	String pass1;
	public void readxldata() throws IOException{
		
		FileInputStream xlfile=new FileInputStream("C:\\Users\\sravan\\Desktop\\credentials.xlsx");
		Workbook w=new XSSFWorkbook(xlfile);
		//Sheet s=w.getSheet("Sheet1");//sheet name
		Sheet s=w.getSheetAt(0);//sheet number
		Cell c=s.getRow(1).getCell(0);//getcell(get colomn number)
		id1=c.getStringCellValue();
		Cell c1=s.getRow(1).getCell(1);
		pass1=c1.getStringCellValue();
		//for(int i=0;i<2;i++)
		/*List uid=(List) c.getRow();
		System.out.println(uid);
		*/
			
		
		
		
		
		
		
	}
	
			
		@Test//(dataProvider="testdata")
		public void aapachexlpoitests() throws IOException{
			gmaillogin gl=new gmaillogin(driver);
			
			
			readxldata();
			
			//System.out.println(id1+"::"+pass1);
			
			//gl.loginCredentiontials();
			
			/*gl.emailid.sendKeys("sravank41");
			
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
			boolean flag2=gl.loginCredentiontials(id1,pass1);
			//Assert.assertTrue(gl.flag);
			
			Assert.assertTrue(flag2);
			
		
	}

}
