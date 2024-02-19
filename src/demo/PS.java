package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("It will run first");
	}
	@AfterMethod
	public void AfterRun()
	{
		System.out.println("It will run last");
	}

	public void doThis()
	{
		System.out.println("Execute this");
	}
	
	public void doNotThis()
	{
		System.out.println("Do not Execute this");
	}
	public void CannotExecuteThis()
	{
		System.out.println("Cannot Execute this");
	}
	
}
