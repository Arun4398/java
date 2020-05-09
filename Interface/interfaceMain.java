interface Run
{
   int a=123;
   public void test();
}
class Subclass implements Run
{
	@Override
   public void test()
   {
    System.out.println("Override test()");
   }
}
class interfaceMain
{
	public static void main(String[] args) 
	{
		Run s1= new Subclass();

		System.out.println(Run.a);

		s1.test();
	}
}