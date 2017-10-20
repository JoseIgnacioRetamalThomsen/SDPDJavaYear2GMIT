package account;


public class CurrentAccount extends BankAccount
{

	float overDraftLimit;
	
	public CurrentAccount()
	{
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int accountNumberP, String accountNameP)
	{
		super(accountNumberP, accountNameP);
		System.out.println("Current Account Constructor");
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int accountNumberP, String accountNameP, float accountFloatP, float overDraftLimit)
	{
		super(accountNumberP, accountNameP, accountFloatP);
		this.overDraftLimit= overDraftLimit;
		// TODO Auto-generated constructor stub
	}
	
	public CurrentAccount(BankAccount bankAccount)
	{
		super(bankAccount);
		// TODO Auto-generated constructor stub
	}

	
	public void setOverDraftLimit(float overDraftLimit)
	{
		this.overDraftLimit= overDraftLimit;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("The OVer Draft limit is :"+ this.overDraftLimit);

	}
	public void displayBalance()
	{
		System.out.println("Current acount");
		super.display();
		System.out.println("The OVer Draft limit is :"+ this.overDraftLimit);

	}
	
	public static void main(String[] args)
	{
		CurrentAccount myAccount = new CurrentAccount(777,"naomi",600,1000);
		myAccount.setOverDraftLimit(90);
		myAccount.displayBalance();
		myAccount.display();
		myAccount.makeWithDrawal(5);

	}

}
