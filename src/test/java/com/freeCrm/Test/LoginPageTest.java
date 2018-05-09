package com.freeCrm.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freeCrm.Pages.LoginPage;
import com.freeCrm.baseClass.BaseClass;

import utils.UtilsClass;

public class LoginPageTest extends BaseClass
{
	LoginPage login;
	UtilsClass utls;
	public LoginPageTest() throws IOException
	{
		super();
		
	}
	
	@BeforeMethod
	public void launch() throws IOException, InterruptedException
	{
		InitializationAppender();
		login=new LoginPage();
		utls=new UtilsClass();
		
		
	}
	
	@Test
	public void login() throws IOException, InterruptedException
	{
		
		
		login.loginPageMethod(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void close()
	{
		//driver.close();
	}

}
