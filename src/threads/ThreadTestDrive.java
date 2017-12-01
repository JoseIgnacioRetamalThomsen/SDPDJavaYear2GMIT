//Jose Retamal -   10/11/2017 
package threads;

public class ThreadTestDrive
{

	public ThreadTestDrive()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);
		myThread.start();
		System.out.println("back to main");

	}

}

class MyRunnable implements Runnable
{
	public void run()
	{
		go();
	}
	public void go()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		doMore();
	}
	public void doMore()
	{
		System.out.println("top of the stack");
	}
}
