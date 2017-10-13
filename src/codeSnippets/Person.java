package codeSnippets;

public class Person
{

	String firstName;
	String lastName;
	
	public Person setFirstName(String first)
	{
		firstName = first;
		return this;
	}
	
	public Person setLastName(String last)
	{
		lastName = last;
		return this;
	}
	
	public String toString()
	{
		return "firstName: " + firstName + "\nlastName: " +lastName;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person p = new Person();
		Person p2 = new Person();
		p2.setFirstName("first").setLastName("last");
		System.out.println(p.setFirstName(("joe")));
		System.out.println(p2);

	}

}
