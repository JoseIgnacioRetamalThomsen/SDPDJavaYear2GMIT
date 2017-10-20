package codeSnippets;

abstract class Shape
{
	abstract void draw();

	abstract void erase();

}//end shape

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle draw!");
	}

	void erase()
	{
		System.out.println("Circle erase!");
	}
}//end circle

class Square extends Shape
{
	void draw()
	{
		System.out.println("Square draw!");
	}

	void erase()
	{
		System.out.println("Square erase!");
	}
}//end square

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Triangle draw!");
	}

	void erase()
	{
		System.out.println("Triangle erase!");
	}
}//end triangle

public class Shapes
{

	public static Shape randShape()
	{
		switch ((int) (Math.random() * 3))
		{
			default:
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Triangle();
		}
	}

	public static void main(String[] args)
	{
		Shape[] shape = new Shape[9];
		// Fill up the array with shapes:
		for (int i = 0; i < shape.length; i++)
		{
			shape[i] = randShape();
		}
		// Make polymorphic method calls:
		for (int i = 0; i < shape.length; i++)
		{
			shape[i].draw();
		}

	}

}//end shapes
