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

	void setData(double length, double width, double height)
	{
		//variables with same name hide the object members..
		this.length = length;	//this->length = length;
		this.width = width;
		this.height = height;
	}

	void display()
	{
		System.out.println("Length : " + length);
		System.out.println("Height : " + height);
		System.out.println("Width  : " + width);
	}

	void greetings()
	{
		System.out.println("Good Morning!!");
	}	
}


class class02
{
	public static void main(String []yahoo)
	{
		System.out.println("Hi");

		Box a;	//reference variable of type Box
		a = new Box();//it returns the address
			//object is INSTANTIATED

		a.setData(111, 222, 333);

		a.display();
		a.greetings();
	}
}