/*
In Java, arrays are allocated as objects..

	dataType aryVar[SIZE];
	dataType aryVar[] = {commaSeparated values..};

	new : a dynamic memory allocation operator..
	new ClassName();
	new priDataTypeName();
	new ClassName[noOfEle];
*/

class prg14_array
{
	public static void main(String args[])
	{
		System.out.println("Start again..");

		int ary[] = {1, 32, 45, 65,77, 3, 4, 5,4, 55};
		//int ary[] = new int[10];
		int i;
		System.out.println("Total Elements are : " + ary.length);
		for(i=0; i< ary.length; i++)
		{
			System.out.println(ary[i]);
		}

		System.out.println("\nEnd");
	}
}