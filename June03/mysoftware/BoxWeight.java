//class BoxWeight : public Box, public Material, public Anything

class BoxWeight extends Box
{
	double weight;

	BoxWeight()
	{
		super();
		weight = 10;
	}

	void setData(double length, double width, double height, double weight)
	{
		setData(length, width, height);
		//this.length = length;
		//////this.height = height;
		/////this.width = width;

		this.weight = weight;
	}
	

	BoxWeight(double length, double width, double height, double weight)
	{
		super(length, width, height);
		//this.length = length;
		//////this.height = height;
		/////this.width = width;

		this.weight = weight;
	}

	//void displayWeight()
	void display()
	{
		super.display();
		System.out.println("Weight : " + weight);
		//display();	//Box::display(); Material::display();
	}
}