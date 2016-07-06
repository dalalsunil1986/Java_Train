/*
INITIALIZATION
CONDITION
INCR/DECR

for loop is also known as compact loop..
SYNTAX:
	for( INITIALIZATION  ; CONDITION   ; INCR/DECR  )
		statement;

*/

class prg12_for3
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Start for ka version 3");

		i = 1;
		for(  ;  ; )
		{
			System.out.print(i + " ");
			i++;

			if(i>10)
				break;
		}


		System.out.println("\nEnd");
	}
}