package account;

import java.util.Scanner;

public class DebitAccount extends BankAccount
{

	float debit;
	
	public DebitAccount()
	{
		// TODO Auto-generated constructor stub
	}

	public DebitAccount(int accountNumberP, String accountNameP)
	{
		super(accountNumberP, accountNameP);
		// TODO Auto-generated constructor stub
	}

	public DebitAccount(int accountNumberP, String accountNameP, float accountFloatP)
	{
		super(accountNumberP, accountNameP, accountFloatP);
		// TODO Auto-generated constructor stub
	}

	public DebitAccount(BankAccount bankAccount)
	{
		super(bankAccount);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public void displayBalance()
	{
		System.out.println("devit account:");
		super.displayBalance();
		System.out.println("debit= " + debit);
	}
	
}
