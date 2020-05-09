class Staticsame
{
    static int a=1234;//-------------------------------------------------------- static data member
	
	public static void test() //------------------------------------------------ static function member
		{
			
			System.out.println("Static Function member in SAME class");

			System.out.println("Static data member in a SAME class => A= "+a);

        }
    public void test1() //------------------------------------------------ static function member
		{
			
			System.out.println("Non-Static Function member in SAME class");

			System.out.println("Static data member in a SAME class => A= "+a);

        }



    public static void main(String[] args) //---------------------------------- static function member(Main class alway static member)
 		{
 			System.out.println("STATIC MEMBERS ACCESSED IN SAME CLASS");

 			System.out.println("by using membername;");

	    	System.out.println("Static data member in a SAME class => A= "+a);//------- access by using data member name

	        test();  //-------------------------- access by using function member name

	        new Staticsame().test1();
		}
}