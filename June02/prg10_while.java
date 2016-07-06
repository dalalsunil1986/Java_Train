/*
SYNTAX:
	while(condition(s))
	{
		statement1;
		statement2;
	}

*/

class prg10_while
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Start");

		i = 1;
		while(i<=10)
			System.out.print(++i + " ");
			//i = i + 1;
		

		System.out.println("\nEnd");
	}
}