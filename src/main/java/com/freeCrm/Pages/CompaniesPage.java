package com.freeCrm.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freeCrm.baseClass.BaseClass;
//FIRST
public class CompaniesPage extends BaseClass
{

	public CompaniesPage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input [@value='New Company']")
	WebElement newCompany;
	
	
	public CreateCompanyPage clickNewCompanyLink() throws IOException
	{
		newCompany.click();
		return new CreateCompanyPage();
	}

}
