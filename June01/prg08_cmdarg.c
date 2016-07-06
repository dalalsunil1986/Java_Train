int main(int a, char *b[])
{
	int i;
	printf("\nHieeeee");
	printf("\nTotal Argumens are : %d", a);

	printf("\nThe arguments are :\n");
	for(i=0; i<a; i++)
	{
		printf("\n %d %s", i, b[i]);
	}
	printf("\nBye Bye");
	getch();
}
