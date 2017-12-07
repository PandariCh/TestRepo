package com.page.regressiontesting;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainHomeTest {
	
public static WebDriver driver;
public static String driverPath = "D:\\balu\\";


	@BeforeMethod
	public void setupbrowser() throws Exception{
		
		
		System.out.println("entered setupbrowser method");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mytrits\\Documents\\chromedriver_win32\\chromedriver.exe");
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}
	
	@AfterMethod
	public void closebrowser(){
		driver.close();
	}
@Test

public void logintest() throws  Exception{
	
	
	Thread.sleep(2000);
	
	Mainhome home= PageFactory.initElements(driver, Mainhome.class);
	
Properties prop = new Properties();
	
	FileInputStream file= new FileInputStream("F:\\Selenium\\regressiontesting\\details.properties");
	
	prop.load(file);
	
	
	home.setUserName(prop.getProperty("Username"));
	
	home.setpassword(prop.getProperty("password"));
	
	
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	
	jse.executeScript("window.scrollBy(0,250)", "");
	Thread.sleep(2000);
	
	home.clicksubmit();
	
	
}


}
