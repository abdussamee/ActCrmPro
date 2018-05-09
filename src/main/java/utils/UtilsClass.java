package utils;

import java.io.IOException;
import java.sql.Driver;

import com.freeCrm.baseClass.BaseClass;

public class UtilsClass extends BaseClass
{
	public UtilsClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long pageLoadTimeOut=20;
	public static long implysitWait=60;
	
	public void switchToFrame()
	{
		driver.switchTo().frame("mainpanel");
	}

}
