/*
INITIALIZATION
CONDITION
INCR/DECR

for loop is also known as compact loop..
SYNTAX:
	for( INITIALIZATION  ; CONDITION   ; INCR/DECR  )
		statement;

*/

class prg12_for
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Start for");

		i = 1;
		for( i = 2; i <= 10; i++)
		{
			System.out.print(i + " ");
		}

		while(i<=10)


		System.out.println("\nEnd");
	}
}