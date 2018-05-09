package com.freeCrm.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freeCrm.baseClass.BaseClass;

import utils.UtilsClass;

public class LoginPage extends BaseClass
{

	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input [@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input [@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input [@value='Login']")
	WebElement login;
	
	public HomePage loginPageMethod(String uname,String pwd) throws IOException, InterruptedException
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(UtilsClass.implysitWait, TimeUnit.SECONDS);
		login.click();
		return new HomePage();  
	}

}
