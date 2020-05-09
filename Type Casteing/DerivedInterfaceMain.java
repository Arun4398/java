interface Run
{
	int a1=123;
	abstract public void click();

	public default void count()
	{
		System.out.println("default count() of Run interface");
	}
}
class Demo1 implements Run
{
	double k=234.45;
	@Override
	public void click()
	{
		System.out.println("Overriding click()");
	}
}
class DerivedInterfaceMain
{
	public static void main(String[] args) 
	{
	 	Run ref= new Demo1(); //upcasteing
        ref.count();
        
        Demo1 ref1 = (Demo1)ref;

        System.out.println(ref1.a1);
        System.out.println(ref1.k);

        ref1.count();
        ref1.click();

	}
}