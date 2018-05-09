package com.freeCrm.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freeCrm.baseClass.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a [@class='topnavlink'])[3]")
	WebElement logout;
	
	@FindBy(xpath="//a [@title='Companies']")
	WebElement companies;
	
	@FindBy(xpath="(//input [@title='New Event'])[1]")
	WebElement newEvent;
	
	
	public void LogOutMeth()
	{
		//driver.switchTo().frame("mainpanel");
		logout.click();
	}
	
	public String getHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public CompaniesPage clickCompanies() throws IOException
	{
		//driver.switchTo().frame("mainpanel");
		companies.click();
		return new CompaniesPage();
	}
	
	public void ClickOnNewEvent()
	{
		//driver.switchTo().frame("mainpanel");
		newEvent.click();
	}

}
