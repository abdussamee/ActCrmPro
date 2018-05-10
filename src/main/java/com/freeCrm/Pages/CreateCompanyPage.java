package com.freeCrm.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.freeCrm.baseClass.BaseClass;

public class CreateCompanyPage extends BaseClass
{

	public CreateCompanyPage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="company_name")
	WebElement companyName;
	
	@FindBy(id="phone")
	WebElement phoneNumber;
	
	@FindBy(id="annual_revenue")
	WebElement yearlyRevenue;
	
	@FindBy(xpath="(//select [@class='select'])[5]")
	WebElement priorityDropDown;
	
	@FindBy(xpath="(//input [@value='Save'])[1]")
	WebElement save;
	
	public void creatingCompany()
	{
		companyName.sendKeys("Amazon");
		phoneNumber.sendKeys("9959192302");
		yearlyRevenue.sendKeys("10billion");
		Select sel=new Select(priorityDropDown);
		sel.selectByVisibleText("High");
		save.click();
	}
}
