class Nonstaticsame
{
	int b = 1234;// Non-static data member

	public void display()// Non-static fucntion member
	  {
		  
		  System.out.println("Non-static Function member in same class");

	  }
	  public void display2()
	  {

	      System.out.println("2)Non-static Members accessed by Non-Static members in SAME class");

	      System.out.println("by using membername");

		  System.out.println("b="+b);

     }

    public static void main(String[] args) 

      {
      	 System.out.println("NON-STATIC MEMBERS ACCESSED IN SAME CLASS");

      	 System.out.println("1)Non-static Members accessed by Static members in same class");

      	 System.out.println("by (Object Creation) new classname().membername");

         System.out.println("Non-static Data Member in Static Function member in same class b="+new Nonstaticsame().b);

    	 new Nonstaticsame().display();

    	 new Nonstaticsame().display2();
      }
}