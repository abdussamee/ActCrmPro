package com.freeCrm.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freeCrm.Pages.CompaniesPage;
import com.freeCrm.Pages.CreateCompanyPage;
import com.freeCrm.Pages.HomePage;
import com.freeCrm.Pages.LoginPage;
import com.freeCrm.baseClass.BaseClass;

import utils.UtilsClass;

public class NewComPaTest extends BaseClass
{
	LoginPage login;
	HomePage hp;
	CompaniesPage compa;
	UtilsClass utc;
	CompaniesPage cp;
	CreateCompanyPage cc;

	public NewComPaTest() throws IOException
	{
		super();
		
	}
	
	@BeforeMethod
	public void launch() throws IOException, InterruptedException
	{
		InitializationAppender();
		login=new LoginPage();
		hp=new HomePage();
		compa=new CompaniesPage();
		utc=new UtilsClass();
		login.loginPageMethod(prop.getProperty("username"),prop.getProperty("password"));
		utc.switchToFrame();
		hp.clickCompanies();
		cp=new CompaniesPage();
		cp.clickNewCompanyLink();
		cc=new CreateCompanyPage();
	}
	
	@Test
	public void enteringInfo()
	{
		cc.creatingCompany();
	}
	
	@AfterMethod
	public void close()
	{
		//driver.close();
	}

}
