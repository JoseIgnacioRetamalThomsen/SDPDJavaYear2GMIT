//Jose Retamal -2017 
package threads;

public class RyanAndMonicaJob implements Runnable
{

	BankAccount account = new BankAccount();

	public RyanAndMonicaJob()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public  void run()
	{
		for (int i = 0; i < 10; i++)
		{
			 makeWithdrawl(10);
			if (account.getBalance() < 0)
			{
				System.out.println("overdrawn!");
			}
		}

	}// end run method

	synchronized void  makeWithdrawl(int amount)
	{
		if (account.getBalance() >= amount)
		{
			System.out.println(Thread.currentThread().getName() + "is about to withdraw");

			try
			{
				System.out.println(Thread.currentThread().getName() + "is going to sleep");
				Thread.sleep(500);
			} catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "woke up");
			account.witdraw(amount);
			System.out.println(Thread.currentThread().getName() + "Completes the withdraw");
		}else
		{
			System.out.println(  "Sorry, not enough for " +Thread.currentThread().getName());
		}
	}

	public static void main(String[] args)
	{
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		Thread threadOne = new Thread(theJob);
		Thread threadTwo = new Thread(theJob);
		threadOne.setName("Ryan");
		threadTwo.setName("Monica");
		threadOne.start();
		threadTwo.start();

	}

}
