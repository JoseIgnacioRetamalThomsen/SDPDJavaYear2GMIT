//Jose Retamal -2017 
package TestCases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondTestClass
{
	@BeforeClass
	public static void beggining()
	{
		System.out.println("***Beginin******");
	}
	
	@AfterClass
	public static void ending()
	{
		System.out.println("****Ending*****");
	}
	
	@Before
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@After
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
	@Test
	public void sendingEmailTest()
	{
		System.out.println("Testing Sending Email");
	}

	@Test
	public void sendingMessageTest()
	{
		System.out.println("Testing Sending Message");
	}
}
