package account;

public interface StateSubsidy
{
	//static and final
	float STATE_SUBSIDY =100;//STATIC ANF FINAL
	static final public float TAX_RATE=.1f;
	float TAXED_SUBSIDYDEDUCTION= STATE_SUBSIDY-(TAX_RATE*STATE_SUBSIDY);
	//interface methods are implictly abstract and public
	void addStateSubsidy(float subsidy);
	
	// java 8 - can add in default methods
	default void displayTaxedSubsidy()
	{
		System.out.println("The taxed Subsidy is "+ TAXED_SUBSIDYDEDUCTION);
	}
	
	//and static methods
	public  static void displaySubsidy()
	{
		System.out.println("The Governmentt Subsidy is "+ STATE_SUBSIDY);
	}
}
