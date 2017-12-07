package com.page.regressiontesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signuppage {
	
	WebDriver driver1;
	
	@FindBy(how=How.XPATH,using="//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")
	WebElement MypersonalInformation;
	
	@FindBy(how=How.ID,using="firstname")
	WebElement Fname;
	
	@FindBy(how=How.ID,using="lastname")
	WebElement Lname;
	
	@FindBy(how=How.ID,using ="email")
	WebElement emailaddress;
	
	
	

}
