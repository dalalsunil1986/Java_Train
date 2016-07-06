package girnarPack;
public class Box
{
	double length;
	double width;
	double height;

	/**default constructor**/
	public Box()
	{
		//length = width = height = 5.5;
		this(5.5);
		System.out.println("zero argument..");
	}

	public Box(double b)
	{
		length = width = height = b;
		System.out.println("one argument..");
	}

	/**COPY CONSTRUCTOR**/
	/**
		Box(Box *b)//Box(Box &b)
		{
			this->length = b.length;
			this->width = b.width;
			this->height = b.height;
		}
	**/
	public Box(Box b)
	{
		length = b.length;
		width = b.width;
		height = b.height;
	}


	/**three argument constructor**/
	public Box(double length, double width, double height)
	{
		//variables with same name hide the object members..
		this.length = length;	//this->length = length;
		this.width = width;
		this.height = height;
	}

	void setData(double length, double width, double height)
	{
		//variables with same name hide the object members..
		this.length = length;	//this->length = length;
		this.width = width;
		this.height = height;
	}

	public void display()
	{
		System.out.println("------------------------");
		System.out.println("Length : " + length);
		System.out.println("Height : " + height);
		System.out.println("Width  : " + width);
	}

	void greetings()
	{
		System.out.println("Good Morning!!");
	}	
}

