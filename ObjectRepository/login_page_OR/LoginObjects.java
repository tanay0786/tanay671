package login_page_OR;

import org.openqa.selenium.By;

public interface LoginObjects {
	//Locators for WebElements
	By login_emailid_ID = By.id("identifierId");
	By login_nextbtn_xpath =By.xpath(".//*[@id='identifierNext']/content/span");
	By login_password_Name = By.name("password");
	By login_signinbtn_xpath = By.xpath(".//*[@id='passwordNext']/content/span");
	//Locators for error messages
	By login_emailid_errmsg_xpath = By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]");
	By login_password_errmsg_xpath = By.xpath(".//*[@id='password']/div[2]/div[2]");
	//Text for error messages
	String login_blankemailid_errmsg_txt = "Enter an email or phone number";
	String login_splcharacter_emailid_errmsg_txt ="Couldn't find your Google Account";
	String login_invalid_emailid_errmsg_txt ="Enter a valid email or phone number";
	String login_blankpassword_errmsg_txt = "Enter a password";
	String login_wrongpassword_errmsg_txt ="Wrong password. Try again or click Forgot password to reset it.";
	
	
	
	
	
	
	

}
