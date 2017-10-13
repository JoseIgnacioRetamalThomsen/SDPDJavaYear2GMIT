package codeSnippets;

public class VariousStringMethods
{

	
	
	public static void main(String[] args)
	{
		String sentence;
		String str1;
		String str2;
		int index, length;
		
		sentence = "Now is the time for the birthday party";
		
		length = sentence.length();
		
		System.out.printf("the legnth of the String:\"%s\" is: %d \n",sentence,length);
		
		for(int i = 0 ; i< length; i++)
		{
			System.out.printf("The character at index %d is \'%c\'\n",i,sentence.charAt(i));
		}
		
		System.out.printf("sentence.subString(4,10)= %s\n", sentence.substring(4,10));
		
		str1 = sentence.substring(0,8);
		
		System.out.printf("str1 = sentence.substring(0,8); str1= %s\n", str1);
		
		str2 = sentence.replace('t', 'T');
		
		System.out.printf("str2 = sentence.replace('t', 'T'); str1= %s\n", str2);

	}

}
