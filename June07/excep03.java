class excep03
{
	public static void main(String args[])
	{
		System.out.println("Start");

		int a, b, c;
		Sanjay ss = new Sanjay(); ////////////

		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);

		System.out.println("Variables initialized..");

		System.out.println("Calling Function..");
		try
		{
			ss.calculate(a, b); /////////////
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("ERROR : " + nfe);
		}
		System.out.println("End of Program");

	}
}