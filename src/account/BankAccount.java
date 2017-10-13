package account;

public class BankAccount extends Account
{

	// attributes
	float accountBalance;
	static float euroConversionRate;

	public BankAccount()
	{
		accountBalance = 0;
		accountNumber = 0;
		accountName = "NoName";
	}

	public BankAccount(int accountNumberP, String accountNameP)
	{
		accountNumber = accountNumberP;
		accountName = accountNameP;

	}

	public BankAccount(int accountNumberP, String accountNameP, float accountFloatP)
	{

		this(accountNumberP, accountNameP);
		accountBalance = accountFloatP;

	}

	public BankAccount(BankAccount bankAccount)
	{
		this(bankAccount.accountNumber, bankAccount.accountName, bankAccount.accountBalance);
	}

	@Override
	public void display()
	{
		System.out.println();
		System.out.println("The Bank Account Number is " + accountNumber);
		System.out.println("The Bank Name is " + accountName);

	}

	public void displayBalance()
	{
		display();
		System.out.println("The Balance is " + accountBalance);
		System.out.println("Todays Euro Rate is " + BankAccount.euroConversionRate);

	}
	
	public void displayBalance(String message)
	{
		System.out.println();
		System.out.println(message+":");
		this.displayBalance();
	}

	public void makeWithDrawal(float ammount)
	{
		boolean isWithDrawPosible=false;
		System.out.println("Actual Balanse:" + this.accountBalance);
		System.out.println("Trying to withdraw"+ ammount);
		if(ammount>= this.accountBalance)
		{
			isWithDrawPosible=true;
		}
		if(isWithDrawPosible)
		{
			System.out.println("Witdrawal success.");
			System.out.println("Actual Balanse:" + this.accountBalance);
		}else
		{
			System.out.println("WithDraw fail , not enought money in the account.");
		}
	}
	
	// a static method to set the euro rate
	static void setEuroConversionRate(float euroRate)
	{
		BankAccount.euroConversionRate = euroRate;
	}

	@Override
	public boolean equals(Object obj)
	{
		boolean isEqual = false;
		// check if is a BankAccount object
		if (!(obj instanceof BankAccount))
		{
			return isEqual;
		}

		// compare the 2 object
		if (this.accountNumber == ((BankAccount) obj).accountNumber
				&& this.accountName.equals(((BankAccount) obj).accountName)
				&& this.accountBalance == ((BankAccount) obj).accountBalance)
		{
			isEqual = true;

		}

		return isEqual;

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
