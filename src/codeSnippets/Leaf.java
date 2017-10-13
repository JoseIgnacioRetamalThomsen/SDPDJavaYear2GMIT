package codeSnippets;

public class Leaf
{
	int value = 0;
	
	//this method returns an object reference
	
	Leaf increment()
	{
		value++;
		System.out.println(this);
		return this;
	}
	
	void print()
	{
		System.out.println("value = " + value);
	}
	
	public String toString()
	{
		return ""+value;
	}
	
	public static void main(String[] args)
	{
		Leaf myLeaf = new Leaf();
		myLeaf.increment().increment().increment().print();
	}
}
