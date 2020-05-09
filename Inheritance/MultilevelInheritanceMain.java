class Ver1
{
   int a1=1234;
   public void test()
   {
   	System.out.println("send msg");
   }
}
class Ver2 extends Ver1
{
   int a1=3456;
   public void test1()
   {
   	System.out.println("send voice msg");
   }
}
class Ver3 extends Ver2
{
   int a1=7890;
    public void test2()
   {
   	System.out.println("send video msg");
      System.out.println("a1 in v3"+a1);
      System.out.println("a1 in super"+super.a1);
   }

}
class MultilevelInheritanceMain
{
	public static void main(String[] args) 
	{
         System.out.println("---------BY VER1--------");
         Ver1 ref1= new Ver1();
         ref1.test();

         System.out.println("---------BY VER2--------");

         Ver2 ref2 = new Ver2();
         ref2.test();
         ref2.test1();

         System.out.println("---------BY VER3--------");

         Ver3 ref3 =new Ver3();
         ref3.test();
         ref3.test1();
         ref3.test2();

	}
}