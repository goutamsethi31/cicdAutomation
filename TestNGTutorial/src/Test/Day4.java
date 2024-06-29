package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL", "APikey/username"})
	@Test
	public void WebloginHomeLoan(String urlname,String key )
	{
		//Selenium
		System.out.println("WebloginHomeLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test
	public void MobileloginCarLoan()
	{
		//Appium
		System.out.println("MobileloginHomeLoan");
	}
	
	@Test(dataProvider="getdata")
	public void LoginAPICarLoan(String username,String passw)
	{
		//Rest API automation
		System.out.println("LoginAPIHomeLoan");
		System.out.println(username);
		System.out.println(passw);
		
	}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
	}

}
