//abstract class can not be INSTANTIATED..
abstract class A
{
	void display()
	{
		System.out.println("display of A");
	}

	abstract void greeting();
}


class B extends A
{
	void greeting()
	{
		System.out.println("Happy New Year");
	}
}

class C extends A
{
	void greeting()
	{
		System.out.println("Happy HOli");
	}
}

class inher05_abstract
{
	public static void main(String args[])
	{
		System.out.println("Hi");
		A a;
		//a = new A(); ERROR
		//a.display(); ERROR

		B b;
		b = new B();
		System.out.println("Done..");

		a = new B();
		a.greeting();
		a = new C();
		a.greeting();
	}
}