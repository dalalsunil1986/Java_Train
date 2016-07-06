class prg03_thread
{
	public static void main(String args[])
	{
		int i;
		System.out.println("Start");

		Thread tt = Thread.currentThread();

		System.out.println(tt);
		tt.setName("Sanjay");
		System.out.println(tt);


		System.out.println("End of Program");
	}
}