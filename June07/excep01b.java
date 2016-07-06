class excep01b
{
	public static void main(String args[])
	{
		System.out.println("Start");

		int a, b, c;

		try
		{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			System.out.println("Variables initialized..");

			System.out.println("Starting calculation..");

			c = a / b;

			System.out.println("Result is : " + c);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("ERROR : " + nfe);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ERROR : " + ae);
		}
		finally
		{
			System.out.println("End of Program");
		}
	}
}