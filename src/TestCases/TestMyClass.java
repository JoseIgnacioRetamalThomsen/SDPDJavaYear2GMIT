//Jose Retamal -2017 
package TestCases;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyClass
{

	@Test
	public void testMultiply()
	{
		MyClass tester = new MyClass();
		assertEquals("10x5 must be 5",50,tester.multiply(10,5));
	}

}
