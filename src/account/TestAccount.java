package account;

public class TestAccount extends Account
{

	@Override
	public void display()
	{
		// TODO Auto-generated method stub

	}

	public static void main(String[] args)
	{
		BankAccount mariaAccount = new BankAccount(003, "Maria");
		BankAccount pepeA = new BankAccount(002, "Pepe", 150000000000000f);
		BankAccount valeA = new BankAccount(pepeA);
		BankAccount starterA = new BankAccount();
		BankAccount girl = new BankAccount(898, "Mary");
		BankAccount myAccount = new BankAccount(003, "Maria"); // same info than
																// mariaAccount

		BankAccount.setEuroConversionRate(0.12f);
		
		mariaAccount.display();
		mariaAccount.displayBalance();

		pepeA.display();
		pepeA.displayBalance();

		valeA.displayBalance();

		starterA.displayBalance();
		girl.display();

		girl = valeA;
		girl.display();

		// equals with boolean operator
		System.out.println(mariaAccount == myAccount);
		System.out.println(mariaAccount != myAccount);
		// equals method
		System.out.println(mariaAccount.equals(myAccount));
		System.out.println(mariaAccount.equals(new Integer(23)));
		System.out.println();
		
		
		mariaAccount.displayBalance();
		mariaAccount.displayBalance("Maria Account is ");
	}

}
