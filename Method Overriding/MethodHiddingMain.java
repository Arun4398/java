class Superclass
{
 public static void Hidding()
 {
System.out.println("Super class");
 }
}
class Subclass
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
	}
}