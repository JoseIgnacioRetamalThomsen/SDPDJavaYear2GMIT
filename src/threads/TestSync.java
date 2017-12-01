//Jose Retamal -2017 
package threads;

public class TestSync implements Runnable
{
	int balance;

	public TestSync()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " entering run()");
		for (int i = 0; i < 50; i++)
		{
			 increment();
		}
		System.out.println(Thread.currentThread().getName() + " leaving run().");
	}

	public synchronized void increment(){
		System.out.println("Current balance of" + Thread.currentThread().getName()+ "is " + balance +".");
		int i = balance;//two step process
				balance = i+1;//two step process
				System.out.println("New Balance of " + Thread.currentThread().getName()+" is " +balance+".");
	}
}
