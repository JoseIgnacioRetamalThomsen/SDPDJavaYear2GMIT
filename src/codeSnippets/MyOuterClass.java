//Jose Retamal -2017 
package codeSnippets;

public class MyOuterClass
{

	private int x=7;
	public void makeInnerClass()
	{
		MyInnerClass inner = new MyInnerClass();
		inner.seeOuter();
	}
	public MyOuterClass()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		MyOuterClass outerObj = new MyOuterClass();
		MyOuterClass.MyInnerClass innerObj = outerObj.new MyInnerClass();
		innerObj.seeOuter();

	}

	class MyInnerClass
	{
		public void seeOuter()
		{
			System.out.println("outer is "+ x);
		}
		
		
	}//end inner class
	
}
