package com.freeCrm.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freeCrm.Pages.HomePage;
import com.freeCrm.Pages.LoginPage;
import com.freeCrm.baseClass.BaseClass;

import utils.UtilsClass;

public class HomeTest extends BaseClass
{
	LoginPage login;
	HomePage hp;
	UtilsClass utc;

	public HomeTest() throws IOException 
	{
		super();
		
	}
	
	@BeforeMethod
	public void launch() throws IOException, InterruptedException
	{
		InitializationAppender();
		login=new LoginPage();
		hp=new HomePage();
		utc=new UtilsClass();
		login.loginPageMethod(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@Test(priority=0)
	public void comparingTitle()
	{
		Assert.assertEquals(hp.getHomePageTitle(), "CRMPRO","The title is different");
	}
	
	@Test(priority=1)
	public void clickLogOutTest()
	{
		utc.switchToFrame();
		hp.LogOutMeth();
	}
	
	@Test(priority=2)
	public void clickOnCompaniesTest() throws IOException
	{
		utc.switchToFrame();
		hp.clickCompanies();
	}
	
	@Test(priority=3)
	public void clickOnNewEvent() throws IOException
	{
		utc.switchToFrame();
		hp.ClickOnNewEvent();
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
