class prg08_foreach
{
	public static void main(String args[])
	{
		System.out.println("Start");
		System.out.println("Using for each");
		String ary[] = {"Jaipur", "Kota", "Udaipur", "Banswara"};

		int i;
/*		for(i=0; i<ary.length; i++)
		{
			System.out.println(ary[i]);
		}
*/

		for( String k : ary )
		{
			//System.out.println(ary[k]);
			System.out.println(k);
		}

		System.out.println("End of Program");
	}
}