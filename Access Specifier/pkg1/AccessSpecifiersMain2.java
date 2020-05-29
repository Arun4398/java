package pkg1;

public class AccessSpecifiersMain2 
{
   public    int a=123;
   protected double b=123.345;
             long c=123456789;
   private   String d="hello";
   
   public void test1()
   {
	   System.out.println("public test()");
   }
   protected void test2()
   {
	   System.out.println("protected test2()");
   }
    void test3()
   {
    	System.out.println("pkg level test3()");
   }
    private void test4()
    {
     	System.out.println("private test4()");
    }
    public static void main(String[] args)
    {
     	System.out.println("private only accesed by same class");
    	AccessSpecifiersMain2 s1 =new AccessSpecifiersMain2();
    	System.out.println("private d = "+s1.d);
    	s1.test4();
    }
}
