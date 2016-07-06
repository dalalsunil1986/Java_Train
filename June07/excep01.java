class excep01
{
	public static void main(String args[])
	{
		System.out.println("Start");

		int a, b, c;
		a = 10;
		b = 0;
		System.out.println("Variables initialized..");

		System.out.println("Starting calculation..");

		try
		{
			c = a / b;
			System.out.println("Result is : " + c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ERROR occured: " + ae);
		}


		System.out.println("End of Program");
	}
}