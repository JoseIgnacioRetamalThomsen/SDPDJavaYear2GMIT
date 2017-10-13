package codeSnippets;

public class StringRef
{

	public static void main(String[] args)
	{
		String a = "java";
		String b = "java";
		String x = "ja";
		String y = "va";
		String c;
		c = x + y;

		StringBuffer d = new StringBuffer("java");
		StringBuffer e = new StringBuffer(" beans");
		StringBuffer f = d.append(e);

		System.out.println("d : " + d);
		System.out.println("e : " + e);
		System.out.println("f : " + f);
		System.out.println("a==b : " + (a==b));
		System.out.println("a==c : " + (c==a));
		System.out.println("b==c : " + (c==b));
		
		StringBuffer str1 = new StringBuffer("java");
		System.out.println(str1.reverse());
	}

}
