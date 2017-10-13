package codeSnippets;

public class Student
{
	String studentName;
	int number;

	public Student(String name, int num)
	{
		studentName = name;
		number = num;
	}

	@Override
	public String toString()
	{
		return "Student Name: " + studentName + "\nnumber:       " + number;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student student1 = new Student("pato",1);
		System.out.println(student1.toString());
		
	}

}
