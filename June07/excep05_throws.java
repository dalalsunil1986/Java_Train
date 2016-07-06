import java.io.*;
class Sanjay
{
	public void input() throws IOException
	{
		BufferedReader br;
		InputStreamReader isr;
		String str;
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);

		System.out.print("Enter Name :");
		str = br.readLine();

		System.out.println("Hello " + str + " how are you?");
	}
}

class excep05_throws
{
	public static void main(String args[])
	{
		System.out.println("Start version");
		Sanjay ss = new Sanjay();
		try
		{
			ss.input();
		}
		catch(IOException ie)
		{
			System.out.println("ERROR : " + ie);
		}
		System.out.println("\nEnd of Program");
	}
}