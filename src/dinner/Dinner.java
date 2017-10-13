package dinner;
import dessert.*;

public class Dinner
{

	public Dinner()
	{
		System.out.println("Dinner constructor");
	}
	
	public static void main(String[] args)
	{
		Cookie cookie = new Cookie();
		cookie.bite();//need a public modifier
		
		//package access
		Cake cake = new Cake();
		cake.bite();//friendly or package access
		String x = new String("Hello");
		String y = new String("Hello");
		System.out.println(x==y);
		String b = "hello";
		System.out.println(b==y);
		String c = "hello";
		System.out.println(b==c);
	}

}
