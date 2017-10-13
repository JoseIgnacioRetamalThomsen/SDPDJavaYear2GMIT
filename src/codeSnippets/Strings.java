package codeSnippets;

public class Strings
{

	public static void main(String[] args)
	{
		String x = "Java";
		String y = x;

		System.out.println("y string = " + y);
		System.out.println("x string = " + x);
		x = x + " Beans";
		System.out.println("y string = " + y);
		System.out.println("x string = " + x);

	}

}
