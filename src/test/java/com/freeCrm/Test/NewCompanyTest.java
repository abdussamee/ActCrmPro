package com.freeCrm.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freeCrm.Pages.CompaniesPage;
import com.freeCrm.Pages.HomePage;
import com.freeCrm.Pages.LoginPage;
import com.freeCrm.baseClass.BaseClass;

import utils.UtilsClass;
//FIRST
public class NewCompanyTest extends BaseClass
{
	LoginPage login;
	HomePage hp;
	CompaniesPage compa;
	UtilsClass utc;
	public NewCompanyTest() throws IOException
	{
		super();
		
	}
	
	@BeforeMethod
	public void launchApp() throws IOException, InterruptedException
	{
		InitializationAppender();
		login=new LoginPage();
		hp=new HomePage();
		compa=new CompaniesPage();
		utc=new UtilsClass();
		login.loginPageMethod(prop.getProperty("username"),prop.getProperty("password"));
		utc.switchToFrame();
		hp.clickCompanies();
	}
	
	@Test
	public void companyLinkTest() throws IOException
	{
		compa.clickNewCompanyLink();
		
	}
	
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.close();
	}

}
