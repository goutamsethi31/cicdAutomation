package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups= {"Smoke"})
	public void thirddemo()
	{
		System.out.println("good");
	}
	
	@AfterClass
	public void afclass()
	{
		System.out.println("After class day 2");
	}
	

	@BeforeClass
	public void bfclass()
	{
		System.out.println("before class day 2");
	}
	
	@BeforeTest
	public void prerequites()
	{
		System.out.println("excute first bcz its beforetest");
	}

	@Test
	public void ListenersTest()
	{
		System.out.println("bad");
		Assert.assertTrue(false);
	}

}
