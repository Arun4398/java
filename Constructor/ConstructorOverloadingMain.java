class ConstructorOverloading
{
	public ConstructorOverloading()
	{
		System.out.println("ConstructorOverloading()");
	}
	public ConstructorOverloading(int a)
	{
		System.out.println("ConstructorOverloading(int a)");
	}
	public ConstructorOverloading(double a)
	{
		System.out.println("ConstructorOverloading(double a)");
	}
	public ConstructorOverloading(int a, double b)
	{
		System.out.println("ConstructorOverloading(int a, double b)");
	}
	public ConstructorOverloading(double a, int b)
	{
		System.out.println("ConstructorOverloading(double a, int b)");
	}
	
}
class ConstructorOverloadingMain
{
	public static void main(String[] args) 
	{
		new ConstructorOverloading();
		new ConstructorOverloading(12);
		new ConstructorOverloading(1.23);
		new ConstructorOverloading(12,1.123);
		new ConstructorOverloading(1.123,12);

	}
}