//Jose Retamal -2017 
package lambdas;
@FunctionalInterface
//a funtional interface will only have one abstract method
public interface MyInterface
{
	//this method is both abstract and public by default
	int someMethod(int a);
	
	
}

@FunctionalInterface
interface Interface1
{
	//this method is both abstract and public
	int someMethod(int a, int b);
}

@FunctionalInterface
interface Interface2
{
	//this method is both abstract and public
	int someMethod(int x,int y);
}

@FunctionalInterface
interface Interface3
{
	//this method is both abstract and public
	int someMethod();
}

@FunctionalInterface
interface Interface4
{
	//all method are abstract and public in a interface
	//unless is static or default
	float getPhi();
}

@FunctionalInterface
interface Interface5
{
	abstract public void display(String string);
}

@FunctionalInterface
interface Interface6
{
	void helloWord();
}

@FunctionalInterface
interface Interface7
{
	boolean myMethod(int n);
}

@FunctionalInterface
interface Interface8
{
	boolean myMethod(char c);
}

class PopCorn
{
	public void display()
	{
		System.out.println("PopCorn");
	}



}