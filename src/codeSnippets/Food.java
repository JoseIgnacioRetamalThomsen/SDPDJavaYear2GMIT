//Jose Retamal -2017 
package codeSnippets;

public class Food
{

	public Food()
	{
		// TODO Auto-generated constructor stub
	}

	Popcorn p = new Popcorn()
	{
		public void pop()
		{
			System.out.println("anonymous popcorn");
		}
	};

	public void sizzle()
	{
		System.out.println("Anonymous sizzling popcorn");
	}

	public void popIt()
	{
		p.pop();
		// p.sizzle(); cant
	}

	Cookable cook = new Cookable()
	{
		public void cook()
		{
			System.out.println("annonimus cookable implementer");
		}
	};

	public static void main(String[] args)
	{

	}

}

class Popcorn
{
	public void pop()
	{
		System.out.println("porcorn");
	}
}

interface Cookable
{
	public void cook();
}