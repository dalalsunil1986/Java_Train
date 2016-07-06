class prg03_cmdArg_add
{
	public static void main(String ss[])
	{
		System.out.println("Welcome");

		System.out.println("Total Arguments : " + ss.length);
		int i;
		System.out.println("Arguments are :");

		String s1, s2;
		s1 = ss[0];
		s2 = ss[1];

		System.out.println("arguments are : " + s1 + "," + s2);

		String s3;
		s3 = s1 + s2;
		System.out.println("Result is : " + s3);

		System.out.println("End of Program");
	}
}