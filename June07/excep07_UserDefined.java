/*
	1. create a user defined class.
	2. extends from Throwable
	3. checked exception..
*/
class Sanjay extends Throwable
{
	int id;
}

class excep07_UserDefined
{
	public static void main(String args[])
	{
		System.out.println("Start");
		Sanjay ss = new Sanjay();
		int b;
		b = 2;

		if(b==5)
		{
			System.out.println("hi");
			throw ss;
		}
		System.out.println("End of Program");
	}
}