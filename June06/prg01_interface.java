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
		System.out.println("Yahoooooo");
	}
}


class prg01_interface
{
	public static void main(String []hi)
	{
		System.out.println("Hi");

		inter01 x;

		Employee e;
		e = new Employee();
		e.yahoo();
		System.out.println("Employee object instantiated..");

		System.out.println("End of Program");
	}
}