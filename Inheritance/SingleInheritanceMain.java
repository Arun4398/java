class Superclass
{
   final int a=1;
   public int b=12;
   protected int c=123;
   final static String str="AK";
   int d=245;

   public void test()
   {
   	System.out.println("test() of superclass");
   }
}
class Subclass extends Superclass
{
     int d=1234;
     public void display()
     {
     	System.out.println("display() of Subclass");
     	System.out.println("d in "+super.d);
     }
}
class SingleInheritanceMain
{
	public static void main(String[] args) 
	{
		Superclass ref1= new Superclass();

		System.out.println("called by Superclass object");
		System.out.println("---------------------------");
		System.out.println(ref1.a);
		System.out.println(ref1.b);
		System.out.println(ref1.c);
		System.out.println(ref1.str);

		ref1.test();
		
		Subclass ref2 = new Subclass();
		
		System.out.println("called by Subclass Object");
 		System.out.println("--------------------------");
 		
		
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		System.out.println(ref2.c);
		System.out.println(ref2.d);
		System.out.println(ref2.str);

		ref2.test();

		ref2.display();

	}
}