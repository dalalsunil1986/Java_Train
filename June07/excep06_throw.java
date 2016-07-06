class excep06_throw
{
	public static void main(String args[])
	{
		System.out.println("Start");

		ArithmeticException ae = new ArithmeticException();

		int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);


		try
		{
			if(b==5)
			{
				throw ae;
			}
			c = a / b;
			System.out.println("Result is : " + c);			
		}
		catch(ArithmeticException ee)
		{
			System.out.println("ERROR : " + ee);
		}



		System.out.println("End of Program");
	}
}