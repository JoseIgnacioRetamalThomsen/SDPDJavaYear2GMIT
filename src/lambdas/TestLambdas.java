//Jose Retamal -2017 
package lambdas;

public class TestLambdas
{

	public static void main(String[] args)
	{
		MyInterface myInterface = (int a) -> a + 5;

		int result = myInterface.someMethod(5);
		System.out.println(result);

		// old way with out lambda
		MyInterface myInterfacea = new MyInterface()
		{
			public int someMethod(int a)
			{
				return a + 5;
			}
		};

		int result1 = myInterfacea.someMethod(5);
		System.out.println(result1);

		Interface1 myInterface1 = (int a, int b) -> a * a + b * b;
		result1 = myInterface1.someMethod(5, 5);
		System.out.println("the 1 " + result1);

		Interface2 myInterface2 = (int x, int y) -> x + y;
		result1 = myInterface2.someMethod(5, 5);
		System.out.println("the 2 " + result1);

		Interface3 myInterface3 = () -> 42;
		result1 = myInterface3.someMethod();
		System.out.println("the 3 " + result1);

		Interface4 myInterface4 = () -> 3.14F;
		float result2 = myInterface4.getPhi();
		System.out.println("the 4 " + result2);

		Interface5 myInterface5 = (String string) ->
		{
			System.out.println(string);
		};
		myInterface5.display("Hello Word");

		Interface6 myInterface6 = () -> System.out.println("Hello Word");
		myInterface6.helloWord();

		Interface7 myInterface7 = (int n) ->
		{
			return (n % 2 != 0) ? false : true;
		};
		Boolean result3 = myInterface7.myMethod(7);
		System.out.println(result3);

		Interface8 myInterface8 = (char c) ->
		{
			return (c == 'y') ? true : false;
		};
		Boolean result4 = myInterface8.myMethod('y');
		System.out.println(result4);

	}
}
