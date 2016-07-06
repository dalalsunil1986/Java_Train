class A
{
	void display()
	{
		System.out.println("display of A");
	}

	void greeting()
	{
	}
}

class B extends A
{
	void display()
	{
		System.out.println("display of B");
	}

	void greeting()
	{
		System.out.println("Good Morning");
	}
}

class C extends A
{
	void display()
	{
		System.out.println("display of C");
	}

}

/**
	draw
	paint
**/

class inher04_Logic
{
	public static void main(String args[])
	{
		System.out.println("Hi");
		A a;
		//B b = new A();//downCasting is not allowed..
		//Base class pointer/ reference variables are type
		//compatible with derived class INSTANCE variables..

		a = new B();
		a.display();
		a.greeting();

		a = new C();
		a.display();
		a.greeting();
	}
}