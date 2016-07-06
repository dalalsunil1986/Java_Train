/*
SYNTAX:
	do
	{
		statement1;
		statement2;
	}
	while(condition(s));

*/

class prg11_dowhile
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Start do while");

		i = 15;
		do
		{
			System.out.print(++i + " ");
			//i = i + 1;
		}
		while(i<=10)


		System.out.println("\nEnd");
	}
}