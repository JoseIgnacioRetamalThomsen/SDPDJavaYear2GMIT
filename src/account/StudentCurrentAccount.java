package account;

public class StudentCurrentAccount extends CurrentAccount implements StudentStateSubsidy
{ 

	float studentLoan;
	
	public StudentCurrentAccount()
	{
		// TODO Auto-generated constructor stub
	}

	public StudentCurrentAccount(int accountNumberP, String accountNameP)
	{
		super(accountNumberP, accountNameP);
		System.out.println("Student Account Constructor");
		// TODO Auto-generated constructor stub
	}

	public StudentCurrentAccount(int accountNumberP, String accountNameP, float accountFloatP, float overDraftLimit)
	{
		super(accountNumberP, accountNameP, accountFloatP, overDraftLimit);
		// TODO Auto-generated constructor stub
	}
	
	public StudentCurrentAccount(int accountNumberP, String accountNameP, float accountFloatP, float overDraftLimit,float loan)
	{
		super(accountNumberP, accountNameP, accountFloatP, overDraftLimit);
		this.studentLoan= loan;
		
	}

	public StudentCurrentAccount(BankAccount bankAccount)
	{
		super(bankAccount);
		// TODO Auto-generated constructor stub
	}

	//new methods added to derived class
	public void setStudentLoan(float theLoan)
	{
		this.studentLoan = theLoan;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("The Student loas is  :"+ this.studentLoan);

	}

	
	public static void main(String[] args)
	{
		StudentCurrentAccount studentAcc = new StudentCurrentAccount(888,"joe",90,10,10);
		studentAcc.display();
		studentAcc.makeWithDrawal(10);
		
		studentAcc.addStateSubsidy(STATE_SUBSIY);
		studentAcc.addStudentStateSubsidy(STUDENT_SUBSIDY);;
		
	}

	@Override
	public void addStudentStateSubsidy(float ST)
	{
		accountBalance += ST;
	}

	
}
