package account;

import java.util.Scanner;

public class BankAccount extends Account implements StateSubsidy
{

	// attributes
	float accountBalance;
	static float euroConversionRate;

	Loan bankAccountLoan = new Loan(); // composition

	Scanner console;

	public BankAccount setFirstName(String firstName)
	{
		this.firstName = firstName;
		return this;
	}

	public BankAccount setlastName(String lastName)
	{
		this.lastName = lastName;
		return this;
	}

	// constructors
	public BankAccount()
	{
		// create object from console
		console = new Scanner(System.in);

		System.out.print("enter Account name:");
		this.accountName = console.nextLine();
		System.out.print("enter account number:");
		this.accountNumber = console.nextInt();
		System.out.print("enter Account Balance:");
		this.accountBalance = console.nextFloat();

		// console.close();
	}

	public BankAccount(int accountNumberP, String accountNameP)
	{

		accountNumber = accountNumberP;
		accountName = accountNameP;
		System.out.println("Bank Account Constructor");

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
		System.out.println("loan amount is: " + this.bankAccountLoan.getLoan());

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
		System.out.println(message + ":");
		this.displayBalance();
	}

	public void makeWithDrawal(float ammount)
	{
		boolean isWithDrawPosible = false;
		System.out.println("Actual Balanse:" + this.accountBalance);
		System.out.println("Trying to withdraw" + ammount);

		if (ammount <= this.accountBalance)
		{
			isWithDrawPosible = true;
		}

		if (isWithDrawPosible)
		{
			System.out.println("Witdrawal success.");
			this.accountBalance -= ammount;
			System.out.println("Actual Balanse:" + this.accountBalance);
		} else
		{
			System.out.println("WithDraw fail , not enought money in the account.");
		}
	}// makewithdrawal

	public static BankAccount randAccount()
	{
		switch ((int) Math.random() * 3)
		{
			case 0:
				return new BankAccount();
			case 1:
				return new DebitAccount();
			case 2:
				return new CurrentAccount();
		}
		return null;
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

	}// equals

	@Override
	public void addStateSubsidy(float subsidy)
	{
		accountBalance += subsidy;
	}

	public static void displaySubsidy()
	{
		System.out.println("The government subsidy for this " + "Bank Accounts is " + STATE_SUBSIDY);
	}

	@Override
	public void displayTaxedSubsidy()
	{
		System.out.println("The taxed subisidy for is" + "Bank Account " + TAXED_SUBSIDYDEDUCTION);
	}

	class InterestRate
	{
		private int interest;

		public InterestRate(int interestRate)
		{
			interest = interestRate;
		}

		public void seeInterest()
		{
			System.out.println("interest rate is " + interest);
			System.out.println("clas ref is " + this);
			System.out.println("Outer ref is " + BankAccount.this);
		}
	}

	class PrivateAccount
	{
		public void privateDetails()
		{
			System.out.println("my private account");
		}
	}

	PrivateAccount mine = new PrivateAccount()
	{
		public void privateDetails()
		{
			System.out.println("display my anonymous account details");
		}
	};
	
	public void displayInnerAnon()
	{
		mine.privateDetails();
	}

	public static void main(String[] args)
	{
		// BankAccount account = new BankAccount();
		// account.addStateSubsidy(STATE_SUBSIDY);
		// account.displayBalance();
		BankAccount joeAccount = new BankAccount(232, "joe");

		BankAccount.displaySubsidy();
		StateSubsidy.displaySubsidy();
		joeAccount.displayTaxedSubsidy();

		BankAccount.InterestRate innerJoe = joeAccount.new InterestRate(10);
		innerJoe.seeInterest();
		
		joeAccount.mine.privateDetails();
		

	}

}
