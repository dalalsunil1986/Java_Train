class prg02_cmdArg02
{
	public static void main(String ss[])
	{
		System.out.println("Welcome");

		System.out.println("Total Arguments : " + ss.length);
		int i;
		System.out.println("Arguments are :");
		for(i=0; i<ss.length; i++)
		{
			System.out.println(i + " : " + ss[i]);
		}

		System.out.println("End of Program");
	}
}