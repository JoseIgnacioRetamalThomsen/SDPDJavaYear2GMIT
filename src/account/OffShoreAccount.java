package account;

public final class OffShoreAccount extends BankAccount
{

	String country;
	
	public OffShoreAccount()
	{
		// TODO Auto-generated constructor stub
		country = "no def";
	}
	

	public OffShoreAccount(int accountNumberP, String accountNameP,String country)
	{
		super(accountNumberP, accountNameP);
		this.country= country;
	}

	public OffShoreAccount(int accountNumberP, String accountNameP, float accountFloatP,String country)
	{
		super(accountNumberP, accountNameP, accountFloatP);
		this.country= country;

	}

	public OffShoreAccount(BankAccount bankAccount)
	{
		super(bankAccount);
		// TODO Auto-generated constructor stub
	}

	public void display()
	{
		super.display();
		System.out.println("Country is : " + country);
	}
}
