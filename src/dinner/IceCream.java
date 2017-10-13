package dinner;

class Sundae
{
	private Sundae()
	{
		System.out.println("Sundae created");
	}
	
	static Sundae makeASundae()
	{
		return new Sundae();
	}
	
	Sundae makeASundae2 ()
	{
		return new Sundae();
	}
}

public class IceCream
{
	public static void main(String[] args)
	{
		//Sundae s = new Sundae();
		Sundae s = Sundae.makeASundae();
	}
}
