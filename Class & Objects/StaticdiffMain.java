class Staticdiff
{
   static int a=1234;//-------------------------------------------------------- static data member
	
   public static void test() //----------------------------------------------- static function member
		{
			System.out.println("Static Function member DIFFERENT class");

			System.out.println("Static data member in same class "+a);//------ static data member in static function memberby using mmember name
        }

}
class StaticdiffMain
{
	public static void main(String[] args) //---------------------------------- static function member(Main class alway static member)
 		{
 			System.out.println("STATIC MEMBERS ACCESSED IN DIFFERENT CLASSES");

 			System.out.println("by classname.membername");

	    	System.out.println("Static data member of DIFFERENT CLASS => A= "+Staticdiff.a);//------- access by using data member name

	        Staticdiff.test();//--------------------------------------------------------- access by using function member name

		}
}