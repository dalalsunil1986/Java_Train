class prg07_ifelse
{
	public static void main(String args[])
	{
		System.out.println("Hi");

		int n;
		n = Integer.parseInt(args[0]);

		if(n==1)
		{
			System.out.println("SUnday");
		}
		else if(n==2)
		{
			System.out.println("Monday");
		}
		else if(n==3)
		{
			System.out.println("Tuesday");
		}

		System.out.println("Bye");
	}
}