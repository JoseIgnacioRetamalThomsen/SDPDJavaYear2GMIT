package account;


public abstract class Account
{
	int accountNumber;
	String accountName;
	
	String firstName, lastName;
	
	//abstract method signature
	abstract public void display();
	
	public Account()
	{
		
	}
	
	@Override
	public String toString()
	{
		return String.format("firse name: %s%nsecond name: %s%naccount number: %d%n", firstName, lastName,accountNumber);
	}
}
