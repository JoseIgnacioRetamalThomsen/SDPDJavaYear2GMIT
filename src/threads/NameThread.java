//Jose Retamal - SDAD 2 Lab Exam 10/11/2017 
package threads;

public class NameThread
{

	public NameThread()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
//		NameRunnable nameRunnable1 = new NameRunnable();
//		Thread nameThread1 = new Thread(nameRunnable1);
//		nameThread1.setName("Fred");
//		nameThread1.start();
		System.out.println("thread is " + Thread.currentThread().getName());

	}

}

class NameRunnable implements Runnable
{
	public void run()
	{
		System.out.println("NameRunnable running");
		System.out.println("Run by" + Thread.currentThread().getName());
	}
}