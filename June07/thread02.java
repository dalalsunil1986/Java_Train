class thread02
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Start");

		Thread th;
		th = Thread.currentThread();

		th.setName("Harish");
		int i;
		for(i=1; i<=10; i++)
		{
			//System.out.println("Main : " + i);
			System.out.println( th.getName() + " : " + i);
			th.sleep(1000);
		}

		System.out.println("End of Program");
	}
}