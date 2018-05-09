package com.freeCrm.baseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.UtilsClass;

public class BaseClass
{
	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() throws IOException
	{
		prop=new Properties();
		FileInputStream fio=new FileInputStream("C:\\Users\\AS SAMI\\Desktop\\As sami\\FreeCRM\\src\\main\\java\\com\\freeCrm\\properties\\config.properties");
		prop.load(fio);
	}
	
	
	public static void InitializationAppender()
	{
		
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\AS SAMI\\Desktop\\As sami\\chromedriver.exe");
			driver=new ChromeDriver();
			
		} else 
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(UtilsClass.pageLoadTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilsClass.implysitWait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
