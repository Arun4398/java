interface Run1 // interface not Inherite the class.
{
   int a=123;
   public void test();
}

interface Run2 extends Run1
{
   int a=123;
   public void count();
}

class Subclass implements Run2
{
	@Override
   public void test()
   {
    System.out.println("Override test()");
    }
    public void count()
   {
    System.out.println("Override count()");
    }

}
class interfaceMain2																					
{
	public static void main(String[] args) 
	{
		Subclass s1= new Subclass();

		System.out.println(Run1.a);

		s1.test();
		s1.count();
	}
}