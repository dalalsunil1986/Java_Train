interface inter01
{
	public abstract void yahoo();
}

class Employee implements inter01
{
	void display()
	{
		System.out.println("Hi");
	}

	public void yahoo()
	{
		System.out.println("Yahoooooo from Employee");
	}
}


class Student implements inter01
{
	void display()
	{
		System.out.println("Hi");
	}

	public void yahoo()
	{
		System.out.println("Yahoooooo from Student");
	}
}


class prg02_interface
{
	public static void main(String []hi)
	{
		System.out.println("Hi");

		inter01 x;

/**		Employee e;
		e = new Employee();
		e.yahoo();
		System.out.println("Employee object instantiated..");

		Student s = new Student();
		s.yahoo();
**/

		x = new Employee();

		x.yahoo();
		//ERROR: x.display();
		//bcoz it is not declared in interface..
		x = new Student();
		x.yahoo();


		System.out.println("End of Program");
	}
}