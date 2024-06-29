package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void lastexcuteo()
	{
		System.out.println("excute last this testcases");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("hello");
	}
	
	@AfterSuite
	public void aftsuite()
	{
		System.out.println("excute last after suite");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}

}
