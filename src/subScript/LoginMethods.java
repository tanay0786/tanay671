package subScript;

import base.Testbase;
import login_page_OR.LoginObjects;

public class LoginMethods extends Testbase implements LoginObjects{
	public static void setUserID(String usr){
		driver.findElement(login_emailid_ID).sendKeys(usr);
		driver.findElement(login_nextbtn_xpath).click();
		
	}
	public static void setPassword(String pwd){
		driver.findElement(login_password_Name).sendKeys(pwd);
		driver.findElement(login_signinbtn_xpath).click();
	}
    public static void validGmailLogin(String usr1,String pwd1,String tcname) throws InterruptedException{
    	setUserID(usr1);
    	setPassword(pwd1);
    	Thread.sleep(5000);
    	captureScreenshot(tcname);
    }
    public static String invalidUserIDlogin(String invaliduserid,String tcname) throws InterruptedException{
    	setUserID(invaliduserid);
    	Thread.sleep(1000);
    	String errmsg = driver.findElement(login_emailid_errmsg_xpath).getText();
    	captureScreenshot(tcname);
    	driver.findElement(login_emailid_ID).clear();
    	Thread.sleep(1000);
    	return errmsg;
    	
    }
    public static String invalidPasswordLogin(String Validuser,String invalidpassword,String tcname) throws InterruptedException{
    	setUserID(Validuser);
    	setPassword(invalidpassword);
    	Thread.sleep(1000);
    	String errmsg = driver.findElement(login_password_errmsg_xpath).getText();
    	captureScreenshot(tcname);
    	driver.navigate().back();//take to homescreen
    	Thread.sleep(2000);
    	driver.findElement(login_emailid_ID).clear();
    	return errmsg;
    }
}
