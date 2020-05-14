/* looping statements helps to reduse duplicate line of code and to reduse the size of the program   */
class Forloop
{
	public static void Floop()
	{
	int i=1;
	for(i=1;i<=10;i++)
	{
		System.out.println(i);
	}
}
/*
public static void Flopp2()   // valid stmt but loop runs infinite time without given condition.
{
	for( ; ; )
	{
		System.out.println("Floop2 give the condition");
	}
}*/
public static void Flopp3()
{
	for(int i=1;i<=10;i++)
	{
		System.out.println("Floop3");
	}
}
public static void Flopp4()
{
	int i=1;
	for( ;i<=10; )
	{
		System.out.println("Floop4");
		i++;
	}
}
public static void NFlopp()
{
	System.out.println("nested Forloop");   // A for loop which is written with in the body og another forloop is called as Nested for loop.
	for(int i=1;i<=3;i++)
	{
		System.out.print("Outerloop");
		for(int j=1;j<=3;j++)
		{
		System.out.println("Innerloop");
		}

	}
}
public static void main(String[] args) 
{
	Floop();
	Flopp3();
	//Flopp2();
	Flopp4();
	NFlopp();
}
}