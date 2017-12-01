//Jose Retamal -2017 
package TestCases;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)

public class ParameterizedTestCase
{

	public String username;
	public String password;
	public int pin;
	// want to test with two different login users

	// constructor
	public ParameterizedTestCase(String username, String password, int pin)
	{
		this.username = username;
		this.password = password;
		this.pin = pin;
	}
	
	@Parameters
	public static Collection<Object[]> getData()
	{
		//rows number of time you want to repeat test
		//column number of parameters you want to pass
		
		Object data[][] = new Object[3][3];
		//1sr row
		data[0][0] = "testuser1";
		data[0][1] = "pass1";
		data[0][2] = 7897;
		//2nd row
		data[1][0]= "testuser2";
		data[1][1]= "pass2";
		data[1][2]= 7899;
		//3rd row
		data[2][0]= "testuser3";
		data[2][1]= "pass3";
		data[2][2]= 7899;
		
		return Arrays.asList(data);
		
	}
	
	@Test
	public void testRegister()
	{
		System.out.println("Testing Registration..."+ username+"-"+password+"-"+pin);
		
	}
}
