package codeSnippets;

public class PassObject
{

	public static void f(Letter y)
	{
		y.letter='z';
	}
	public static void main(String[] args)
	{
		
		Letter myLetter = new Letter();
		myLetter.letter='a';
		
		System.out.println("Before f()");
		System.out.println(myLetter.letter);
		f(myLetter);
		System.out.println("After f()");
		System.out.println(myLetter.letter);
		
	}

}

class Letter
{
	char letter;
}