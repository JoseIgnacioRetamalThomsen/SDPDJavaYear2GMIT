package codeSnippets;


public class EqualsMethod
{
	public static void main(String[] args)
	{
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i=100;
		v2.i=100;
		System.out.println(v1.equals(v2));
	
	}

}

class Value
{
	int i;
	
	public boolean equals(Value v)
	{
		boolean toReturn=false;
		if(this.i==v.i)
			toReturn=true;
		return toReturn;
	}
	
}