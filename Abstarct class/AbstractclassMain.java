abstract class Sample
{
	int a=123;

	static int b=456;

    abstract public void test();

    public void display()
    {
    	System.out.println("abstract display()");
    }

    public static void view()
    {
    	System.out.println("abstract view()");
    }
 
}
class Sample2 extends Sample
{
	@Override
	public void test()
	{
      System.out.println("supclass test() oveariden");
	}
}

class AbstractclassMain
{
	public static void main(String[] args)
	{
		Sample s1 = new Sample2();
		System.out.println("by superclass reference variable");
		System.out.println(s1.a);
        System.out.println(Sample.b);

		s1.test();
		s1.display();
		Sample.view();
        

		Sample2 s2 = new Sample2();
		System.out.println("by subclass reference variable");
		System.out.println(s2.a);
		System.out.println(Sample.b);

		s2.test();
		s2.display();
		Sample.view();
		

	}
}