/*
INITIALIZATION
CONDITION
INCR/DECR

for loop is also known as compact loop..
SYNTAX:
	for( INITIALIZATION  ; CONDITION   ; INCR/DECR  )
		statement;

*/

class prg12_for2
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Start for ka version 2");

		i = 1;
		for(  ; i <= 10; i++)
		{
			System.out.print(i + " ");
			i++;
		}

		while(i<=10)


		System.out.println("\nEnd");
	}
}