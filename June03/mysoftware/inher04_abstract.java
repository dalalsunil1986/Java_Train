//abstract class can not be INSTANTIATED..
abstract class A
{
	void display()
	{
		System.out.println("display of A");
	}

	abstract void greeting();
}

class inher04_abstract
{
	public static void main(String args[])
	{
		System.out.println("Hi");
		A a;
		a = new A();
		//a.display();
	}
}