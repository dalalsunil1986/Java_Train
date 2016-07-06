/*
	mainLine 1, 2, 3, 4
	switch(expr)
	{
		case expr1: statements;
		case expr2: statements;
	}
*/

class prg07_switch
{
	public static void main(String args[])
	{
		System.out.println("Hi");

		int n;
		n = Integer.parseInt(args[0]);

		switch(n)
		{
			case 1: System.out.println("Sudnay");
			case 2: System.out.println("Monday");
			case 3: System.out.println("Tuesday");
			case 4: System.out.println("Wednesday");
			default: System.out.println("Wrong Choice");
		}

		System.out.println("Bye");
	}
}