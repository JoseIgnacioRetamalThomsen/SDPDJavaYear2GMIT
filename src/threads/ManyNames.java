//Jose Retamal - SDAD 2 Lab Exam 10/11/2017 
package threads;

public class ManyNames
{

	public ManyNames()
	{

	}

	public static void main(String[] args)
	{

		ManyRunnable nameRunnable1 = new ManyRunnable();
//		ManyRunnable nameRunnable2 = new ManyRunnable();
//		ManyRunnable nameRunnable3 = new ManyRunnable();
		
		
		Thread nameThread1 = new Thread(nameRunnable1);
		Thread nameThread2 = new Thread(nameRunnable1);
		Thread nameThread3 = new Thread(nameRunnable1);
		
		nameThread1.setName("Freed");
		nameThread2.setName("Ricky");
		nameThread3.setName("Lucy");
		
		nameThread1.start();
		nameThread2.start();
		nameThread3.start();
	}
}

class ManyRunnable implements Runnable
{
	public void run()
	{
		for (int i = 1; i <= 3; i++)
		{
			System.out.println("Run by " + Thread.currentThread().getName() + ", x is" + i);
		}
	}
}