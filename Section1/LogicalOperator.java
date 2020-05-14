class LogicalOperator
{
	public static void main(String[] args) 
	{
	System.out.println("Logical Operator");
	int a=20;
	int	b=10;
	int c=15;
	System.out.println("LOGICAL AND (&&)");
	System.out.println(a>b && a>c);
    System.out.println(a>b && a<c);
	System.out.println(a<b && a>c);
	System.out.println(a<b && a<c);

	System.out.println("LOGICAL OR (||)");
	System.out.println(a>b || a>c);
    System.out.println(a>b || a<c);
	System.out.println(a<b || a>c);
	System.out.println(a<b || a<c);

    System.out.println("LOGICAL XOR (^)");
	System.out.println(a>b ^ a>c);
    System.out.println(a>b ^ a<c);
	System.out.println(a<b ^ a>c);
	System.out.println(a<b ^ a<c);


	}
}