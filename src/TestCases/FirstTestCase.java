//Jose Retamal -2017 
package TestCases;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTestCase
{

	@Test
	public void loginTest()
	{
		System.out.println("Loggin usser in");
	}
	
	@Ignore
	@Test
	public void RegisterUserTest()
	{
		System.out.println("Registering a user");
	}
	
	@Test
	public void databaseTest()
	{
		System.out.println("Testing DataBase");
	}

}
