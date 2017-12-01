//Jose Retamal -2017 
package TestCases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;



public class UnderstandingAssertions
{

	@Rule
	public ErrorCollector errorCollector = new ErrorCollector();
	
	@Test
	public void testFriendListFacebook()
	{
		int actualTotalFriends=100;
		int expectedTotalFriend=101;
		/*
		if(actualTotalFriends==expectedTotalFriend)
		{
			System.out.println("pass");
		}else
		{
			System.out.println("Fail");
		}*/
		System.out.println("A");
		try
		{
		Assert.assertEquals(actualTotalFriends,expectedTotalFriend);
		}catch(Throwable t)
		{
			System.out.println("Error encounter");
			errorCollector.addError(t);
		}
		//if fail stop at the line above
		System.out.println("B");
	}

}
