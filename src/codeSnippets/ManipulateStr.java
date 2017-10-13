package codeSnippets;

public class ManipulateStr
{
	public static String reverserString(String str)
	{
		String result = "";

		for (int i = 0; i < str.length(); i++)
		{
			result = str.charAt(i) + result;
		}
		/*
		 * for (int i = str.length() - 1; i >= 0; i--) { result +=
		 * str.charAt(i); }
		 */
		return result;
	}

	public static String converToUpperCase(String str)
	{
		String result = "";
		char tempChar;
		for (int i = 0; i < str.length(); i++)
		{
			tempChar = str.charAt(i);
			if (tempChar >= 'a' && tempChar <= 'z')
			{
				tempChar = (char) ((int) (tempChar) - 32);
				result += tempChar;
			} else
			{
				result += "" + tempChar;
			}
		}
		return result;
	}
	
	public static int countOfUpperCase(String str)
	{
		int result=0 ;
		char tempChar;
		for (int i = 0; i < str.length(); i++)
		{
			tempChar = str.charAt(i);
			if (tempChar >= 'A' && tempChar <= 'Z')
			{
				result++;
			}
		}
		
		return result;
	}

	public static void main(String[] args)
	{
		System.out.println(reverserString("atar ala rata"));
		System.out.println(reverserString("streesed"));
		System.out.println(converToUpperCase("to upper case"));
		System.out.println(countOfUpperCase("How Many"));
	}
}
