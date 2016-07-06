/*
1. Extends Thread
2. interface Runnable

Thread : has 2 constructors..
there are about 20 life cycle methods..
start, sleep, stop, run
*/

class KuchBhi extends Thread
{
	//public void yahoo()
	public void run()
	{
		int i;
		try
		{
			for(i=1; i<=10; i++)
			{
				System.out.println("Yahoo : " + i);
				sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("ERROR Is : " + ie);
		}
	}
}

class thread03_childThread
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println("Start");
		KuchBhi k = new KuchBhi();

		Thread th;
		th = Thread.currentThread();

		th.setName("Harish");
		int i;

		//k.yahoo();
		k.start();	//k.run();

		for(i=1; i<=10; i++)
		{
			//System.out.println("Main : " + i);
			System.out.println( th.getName() + " : " + i);
			th.sleep(1000);
		}

		System.out.println("End of Program");
	}
}