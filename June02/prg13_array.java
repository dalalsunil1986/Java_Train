/*
In Java, arrays are allocated as objects..

	dataType aryVar[SIZE];
	dataType aryVar[] = {commaSeparated values..};

	new : a dynamic memory allocation operator..
	new ClassName();
	new priDataTypeName();
	new ClassName[noOfEle];
*/

class prg13_array
{
	public static void main(String args[])
	{
		System.out.println("Start again..");

		//int ary[] = {1, 32, 45, 65,77};
		//ERROR : int ary[10];	//STATIC MEMORY Allocation..
		int ary[];
		ary = new int[10];	//memory for 10 integers is requested..

		System.out.println("\nEnd");
	}
}