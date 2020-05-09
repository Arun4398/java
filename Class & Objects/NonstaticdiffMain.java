class Nonstaticdiff
{
	int z = 1234;// Non-static data member

    static int a=5678;

	public void display()// Nonp-static fucntion member
	  {
		  System.out.println("This is the Non-static FUCTION member in different class");
		  System.out.println("z= "+z);
		  System.out.println("a= "+a);
	  }
	public static void display2()// Nonp-static fucntion member
	  {
		  System.out.println("This is the Static FUNCTION member in different class");
		  System.out.println("a= "+a);
		  System.out.println("z= "+new Nonstaticdiff().z);
	  }
}
class NonstaticdiffMain
{
    public static void main(String[] args) 

      {

      	 System.out.println("NON-STATIC MEMBERS ACCESSED IN DIFFERENT CLASSES");

      	 System.out.println("Only by (Object Creation) new classname().membername");

   		 System.out.println("Non-static DATA Member in Different class z="+new Nonstaticdiff().z);

   		 System.out.println("Static DATA Member in Different class a="+new Nonstaticdiff().a);

    	 new Nonstaticdiff().display();

    	 new Nonstaticdiff().display2();
    }
}