//Jose Retamal - 10/11/2017 
package threads;

public class BankAccount
{
	int balance = 100;
	
	public BankAccount()
	{
		
	}


	 public int getBalance()
	{
		return balance;
	}

	 public  void witdraw(int amount)
	{
		balance = balance - amount;
	}

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
