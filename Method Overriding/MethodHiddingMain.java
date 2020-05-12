class Superclass
{
 public static void Hidding()
 {
System.out.println("Super class");
 }
 public void test()
 {
 	System.out.println("test() 0f Superclass");
 }
}
class Subclass extends Superclass
{
 public static void Hidding()
 {
   System.out.println("Sub class");
 }
}
class MethodHiddingMain
{
	public static void main(String[] args) 
	{
		Superclass s1= new Superclass();
		s1.Hidding();

		Subclass s2 =new Subclass();
		s2.Hidding();
		s2.test();
	}
}