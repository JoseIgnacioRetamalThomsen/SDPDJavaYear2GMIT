//Jose Retamal -2017 
package codeSnippets;

public class LambdaThreadTest
{

	public LambdaThreadTest()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		Thread myThread  = new Thread()
		{
			public void run()
			{
				System.out.println("Thread running");
			}
		};
		myThread.start();
		*/
		Thread myThread = new Thread(() ->
		{
			System.out.println("Thread running");
		});

		
		myThread.start();
	}

}
