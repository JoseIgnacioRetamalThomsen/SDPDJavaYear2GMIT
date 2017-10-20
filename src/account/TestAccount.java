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
		
		BankAccount mariaAccount = new BankAccount(003, "Bank Of Ireland");
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

		// cascade method call
		System.out.println("\ncascade method call:\n");
		System.out.println(mariaAccount.setFirstName("Maria").setlastName("De las Flores").toString());
		mariaAccount.setFirstName("Maria").setlastName("De las Flores").display();

		CurrentAccount myAccountTest = new CurrentAccount(777, "naomi", 600, 1000);
		myAccountTest.setOverDraftLimit(90);
		myAccountTest.displayBalance();
		myAccountTest.display();
		myAccountTest.makeWithDrawal(5);

		StudentCurrentAccount studentAcc = new StudentCurrentAccount(888, "joe", 90, 10, 10);
		studentAcc.display();
		studentAcc.makeWithDrawal(10);

		myAccountTest = studentAcc;
		mariaAccount = studentAcc;

		// StudentCurrentAccount student2 = new CurrentAccount();
		CurrentAccount student2 = new StudentCurrentAccount();
		
		//composition
		studentAcc.bankAccountLoan.setLoanAmmount(19);
		studentAcc.display();
		
		//polymorphism at work
		BankAccount joesCurrentAccount = new CurrentAccount(222, "joe",100.00F , 50.00F);
		joesCurrentAccount.displayBalance();
	}

}
