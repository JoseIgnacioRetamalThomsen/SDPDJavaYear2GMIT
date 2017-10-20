package codeSnippets;
// classes taht extend animal
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog Eating");
	}
	public void roam()
	{
		System.out.println("Dog Roaming");
	}
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("Cat Eating");
	}
	public void roam()
	{
		System.out.println("Cat Roaming");
	}
}

class Wolf extends Animal
{
	public void eat()
	{
		System.out.println("Wolf Eating");
	}
	public void roam()
	{
		System.out.println("Wolf Roaming");
	}
}
class Lion extends Animal
{
	public void eat()
	{
		System.out.println("Lion Eating");
	}
	public void roam()
	{
		System.out.println("Lion Roaming");
	}
}
class Hippo extends Animal
{
	public void eat()
	{
		System.out.println("Hippo Eating");
	}
	public void roam()
	{
		System.out.println("Hippo Roaming");
	}
}

//public animal parent class test insede here also
public abstract class Animal
{
	public abstract void eat();
	public abstract void roam();

	public Animal()
	{
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args)
	{
		Animal[] animals = new Animal[5];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Wolf();
		animals[3] = new Hippo();
		animals[4] = new Lion();
		
		for(int i = 0 ; i < animals.length;i++)
		{
			animals[i].eat();
			animals[i].roam();
		}

	}

	
	
	
}

