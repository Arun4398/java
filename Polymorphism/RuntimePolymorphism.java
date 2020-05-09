class Superclass
{
	public void count()
	{
		System.out.println("Superclass count()");
	}
	public void display()
	{
		System.out.println("Superclass display()");
	}
}
class Subclass extends Superclass
{
	@Override
	public void count()
	{
		System.out.println("Subclass count()");
	}
}
class RuntimePolymorphism
{
	public static void main(String[] args) 
	{
		Superclass ref = new Subclass();

		ref.display();
		ref.count();

	}
}