package codeSnippets;

/**
 * @author g00351330
 *
 */
public class StaticFun
{

	static int incr()
	{
		return ++StaticTest.i;
	}

	public static void main(String[] args)
	{
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest.i++;
		System.out.println("The value of st1 is " + st1.i);
		System.out.println("The value of st2 is " + st2.i);
		System.out.println("The value of dirctly accesing variable trhough class name is " + StaticTest.i);
		System.out.println("The value of dirctly accesing variable trhough class name is " + StaticFun.incr());

	}

}

class StaticTest
{
	static int i = 47;
}
