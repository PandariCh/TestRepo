package com.page.regressiontesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Mainhome {
	
WebDriver driver;
	
	@FindBy(how=How.ID,using="email")
	WebElement username;
	
	@FindBy(how=How.ID,using="passwd")
	WebElement password;
	
	@FindBy(how=How.ID,using="SubmitLogin")
	WebElement Signin;
	
	
	public Mainhome(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String email){
		username.sendKeys(email);	
	}
	
	public void setpassword(String pawd){
		password.sendKeys(pawd);
	}
	
	public void clicksubmit(){
		Signin.click();
	}


}
