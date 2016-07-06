class class03
{
	public static void main(String args[])
	{
		System.out.println("Hello");
		Box b1;
		b1 = new Box();
		b1.display();

		Box b2 = new Box(10, 12, 20);
		b2.display();

		Box b3 = new Box(11.11);
		b3.display();
		System.out.println("End of Program");

		Box b4 = new Box(b2);//=new Box(&B2);
		b4.display();
	}
}