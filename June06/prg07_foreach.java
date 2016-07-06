class prg07_foreach
{
	public static void main(String args[])
	{
		System.out.println("Start");
		System.out.println("Using for each");
		int ary[] = {10, 20, 30, 40, 50};

		int i;
/*		for(i=0; i<ary.length; i++)
		{
			System.out.println(ary[i]);
		}
*/

		for( int k : ary )
		{
			//System.out.println(ary[k]);
			System.out.println(k);
		}

		System.out.println("End of Program");
	}
}