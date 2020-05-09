class Superclass
{
	int i=1234;
	public void count()
	{
        System.out.println("Superclass count()");
	}
}
class Subclass extends Superclass
{
	double d=3.45;

	public void display()
	{
        System.out.println("Subclass display()");
	}
}
class TypecatseingDerivedMain
{
	public static void main(String[] args) 
	{
		System.out.println("upcasteing");

		Superclass ref1 = new Subclass();//upcasteing

		ref1.count();
		System.out.println(ref1.i); 

		Subclass ref2 = new Subclass();

		Superclass ref3=ref2;  // upcasteing

		ref3.count();
		System.out.println(ref3.i);

//-----------------------------------------------------

        System.out.println("Downcasteing");
		Subclass ref4 = new Subclass();

		Superclass ref5=ref4;  // upcasteing

		Subclass ref6=(Subclass)ref5;// downcasteing

		ref6.count();
		System.out.println(ref6.i);

		ref6.display();
		System.out.println(ref6.d);






	}
}