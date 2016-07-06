class prg04_thread
{
	public static void main(String args[]) throws InterruptedException
	{
		int i;
		System.out.println("Start");

		Thread tt = Thread.currentThread();

		System.out.println(tt);
		tt.setName("Sanjay");
		System.out.println(tt);

		for(i=0; i<=10; i++)
		{
			System.out.println("harish : " + i);
			tt.sleep(1000);
		}


		System.out.println("End of Program");
	}
}