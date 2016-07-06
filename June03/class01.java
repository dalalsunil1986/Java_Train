/*
CLASS: it is a BLUE PRINT of the object.
OBJECT: INSTANCE of the class.
	real world.

<specifier> class [CLASS_NAME]
{
data_member_1;
}
new : dynamic memory allocation OPERATOR
*/
class Box
{
	double length;
	double width;
	double height;


	void greetings()
	{
		System.out.println("Good Morning!!");
	}	
}


class class01
{
	public static void main(String []yahoo)
	{
		System.out.println("Hi");

		Box a;	//reference variable of type Box
		a = new Box();//it returns the address
			//object is INSTANTIATED


		a.height = 5;
		a.length = 10;
		a.width = 2;
		System.out.println("Height is : " + a.height);

		a.greetings();
	}
}