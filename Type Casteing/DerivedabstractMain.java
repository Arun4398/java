abstract class Demo
{
    int a1=1234;
    abstract public void view();
}
class Sample extends Demo
{
	double z=12.234;
	@Override
	public void view()
	{
     System.out.println("Override view() in Sample");
	}
	public void display()
	{
		System.out.println("display() of Sample class");
	} 
}
class DerivedabstractMain
{
	public static void main(String[] args) 
	{
		Demo d = new Sample();    //upcasteing

		System.out.println(d.a1);

		Sample d1 = (Sample)d;  // downcasteing

		System.out.println(d1.a1);
		System.out.println(d1.z);

		d1.view();
		d1.display();
	}
}