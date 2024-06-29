package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	
	@Override
	public void onTestSuccess(ITestResult results)
	{
	//	System.out.println("excute itestListeneres after all success test caes");
	}
	
	@Override
	public void onTestFailure(ITestResult results)
	{
		System.out.println("excute itestListeneres after all failure test cases");
	}

}
