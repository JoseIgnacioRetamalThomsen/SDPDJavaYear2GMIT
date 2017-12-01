//Jose Retamal - SDAD 2 Lab Exam 10/11/2017 
package threads;

public class TestThreads
{

	public TestThreads()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{/*
		 * FooRunnable myRunnable = new FooRunnable("one"); Thread myThread =
		 * new Thread(myRunnable); FooRunnable myRunnable1 = new
		 * FooRunnable("two"); Thread myThread1 = new Thread(myRunnable1);
		 * myThread.start(); myThread1.start();
		 */

		// lambda Runnable
		Runnable r = () ->
		{
			for (int i = 0; i < 6; i++)
			{
				System.out.println("Runnable runnig " + i);
			}
		};

		Thread myThreadWithLambda = new Thread(r);
		myThreadWithLambda.start();

	}

}
/*
class FooRunnable implements Runnable
{
	String name;

	public FooRunnable()
	{
		this.name = "Thred";
	}

	public FooRunnable(String name)
	{
		this.name = name;

	}

	public void run()
	{
		for (int i = 0; i < 6; i++)
		{
			System.out.println("Runnable runnig " + name + " " + i);
		}
	}
}*/