package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test(groups= {"Smoke"})
	public void WebloginCarLoan()
	{
		//Selenium
		System.out.println("weblogicarloan");
	}
	
	@BeforeMethod
	public void bfmethods()
	{
		//Selenium
		System.out.println("excute before every test method in day 3");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileloginCarLoan(String urlname)
	{
		//Appium
		System.out.println("MobileloginCarLoan");
		System.out.println(urlname);
	}
	@BeforeSuite
	public void bfsuite()
	{
		//Rest API automation
		System.out.println("Excute first before suits");
		
	}
	
	@Test(enabled=false)
	public void MobilesignCarLoan()
	{
		//Appium
		System.out.println("MobilesignCarLoan");
	}
	
	@Test
	public void MobilesignoutCarLoan()
	{
		//Appium
		System.out.println("MobilesignoutCarLoan");
	}
	
	@AfterClass
	public void afclass()
	{
		//Rest API automation
		System.out.println("after class day3");
		
	}
	
	@Test
	public void LoginAPICarLoan()
	{
		//Rest API automation
		System.out.println("LoginAPICarLoan");
		
	}
	
	@BeforeClass
	public void bfclass()
	{
		//Rest API automation
		System.out.println("before class day3");
		
	}
	
	@BeforeTest
	public void prerequiresdaythree()
	{
		//Rest API automation
		System.out.println("day three excute first");
		
	}

}
