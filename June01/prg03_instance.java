class Student
{
	int roll;

	void display()
	{
		System.out.println("Display from Student");
		System.out.println("Roll Number is : " + roll);
	}
}

class prg03_instance
{
	public static void main(String []hello)
	{
		Student s;
		s = new Student();
		s.display();
	}
}