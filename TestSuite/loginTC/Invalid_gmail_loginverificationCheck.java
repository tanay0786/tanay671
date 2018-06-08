package loginTC;

import org.testng.annotations.Test;

import base.Testbase;
import login_page_OR.LoginObjects;
import subScript.HomeMethods;
import subScript.LoginMethods;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Invalid_gmail_loginverificationCheck extends Testbase implements LoginObjects{
	@Test(dataProvider = "dp")
	  public static void TC02negativeTest(String tcname,String usr2, String pwd2,String actionfield) throws InterruptedException {
		String errmsg;  
		if(actionfield.equalsIgnoreCase("blank_userid")){
			 errmsg = LoginMethods.invalidUserIDlogin(usr2, tcname);
			 Assert.assertEquals(errmsg, login_blankemailid_errmsg_txt,"Test Case Failed");
				  
			  
		  }
		if(actionfield.equalsIgnoreCase("specialChar_Userid")){
			 errmsg = LoginMethods.invalidUserIDlogin(usr2, tcname);
			 Assert.assertEquals(errmsg, login_splcharacter_emailid_errmsg_txt,"Test Case Failed");
				  
			  
		  }
		if(actionfield.equalsIgnoreCase("Invalid_userid")){
			 errmsg = LoginMethods.invalidUserIDlogin(usr2, tcname);
			 Assert.assertEquals(errmsg, login_invalid_emailid_errmsg_txt,"Test Case Failed");
				  
			  
		  }
		if(actionfield.equalsIgnoreCase("blank_password")){
			 errmsg = LoginMethods.invalidPasswordLogin(usr2,pwd2,tcname);
			 Assert.assertEquals(errmsg, login_blankpassword_errmsg_txt,"Test Case Failed");
			 
				  
			  
		  }
		if(actionfield.equalsIgnoreCase("Wrong_Password")){
			 errmsg = LoginMethods.invalidPasswordLogin(usr2,pwd2, tcname);
			 Assert.assertEquals(errmsg, login_blankpassword_errmsg_txt,"Test Case Failed");
			 
				  
			  
		  }
		
	  }
	  @BeforeTest
	  public  static void beforeTest() {
		  String browsername = "Firefox";
		  setBrowser(browsername);
		  launch();
	  }

	  @AfterTest
	  public static void afterTest() {
		  driver.close();
	  }
	  @DataProvider
	  public Object[][] dp() throws IOException {
		  
		  Object[][]data =ReadFromExcel("C:\\Users\\Tanay Chawla\\Desktop\\selenium\\poi.xlsx","framework");
			  return data;
		  }
		  

	    
	        public String [][] ReadFromExcel(String filepath ,String sheetname) throws IOException{
	    	FileInputStream fs = new FileInputStream(filepath);
	    	Workbook wb = new XSSFWorkbook(fs);
	    	Sheet sh = wb.getSheet(sheetname);
	    	int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
	    	Row header_rows=sh.getRow(0);
	    	int coloumncount = header_rows.getLastCellNum();
	    	String [][]Exceldata = new String[rowcount][coloumncount];//2d array declaration
	    	for (int r=1;r<=rowcount;r++){
	    		Row rows = sh.getRow(r);
	    		for(int c=0;c<coloumncount;c++){
	    			Exceldata[r-1][c]=rows.getCell(c).getStringCellValue();
	    		}
	    	}
	    	return Exceldata;
	    	
	    	
	    }
	  }



