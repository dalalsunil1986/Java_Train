import java.io.*;
class excep04
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Start version 2");
		BufferedReader br;
		InputStreamReader isr;
		String str;
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);

		System.out.print("Enter Name :");
		str = br.readLine();

		System.out.println("Hello " + str + " how are you?");


		System.out.println("\nEnd of Program");
	}
}