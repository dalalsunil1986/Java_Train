class thread01
{
	public static void main(String args[])
	{
		System.out.println("Start");

		Thread th;
		th = Thread.currentThread();

		System.out.println(th);
		th.setName("Harish");
		th.setPriority(9);
		System.out.println(th);


		System.out.println("End of Program");
	}
}