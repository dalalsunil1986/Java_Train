class inher02
{
	public static void main(String args[])
	{
		System.out.println("Hello");
/*		Box b1;
		b1 = new Box();
		b1.display();
*/
		BoxWeight bw1 = new BoxWeight();
		//bw1.displayWeight();
		bw1.display();

		bw1.setData(1, 2, 3, 4);
		bw1.display();
		BoxWeight bw2 = new BoxWeight(11, 22, 34, 45);
		bw2.display();
	}
}