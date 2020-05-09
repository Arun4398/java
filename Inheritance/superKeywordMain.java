class Superclass
{
	int a1=1234;
	public void test()
	{
      System.out.println("test() of Superclass");
	}
}
class Subclass extends Superclass
{
    int a1=4567;
	public void display()
	{
		System.out.println("display() of Subclass");
		System.out.println("Subclass a1="+a1);
		System.out.println("Superclass a1="+super.a1);
	}
}
class superKeywordMain
{
	public static void main(String[] args) 
	{
		Subclass s1= new Subclass();
		s1.display();
	}
}