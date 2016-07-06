class prg04_cmdArg_add
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

		//Integer n = new Integer();
		//n.parseInt(s1);
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);

		int n3 = n1 + n2;

		System.out.println("Result is : " + n3);

		System.out.println("End of Program");
	}
}