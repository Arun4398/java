interface Run1
{

   public default void test()
   {
    System.out.println("default run1 test()");
   }

   public static void click()
   {
    System.out.println("static click() Run1 ");
   }
}

interface Run2
{
  public default void test()
   {
    System.out.println("default run2 test()");
   }

   public static void click()
   {
    System.out.println("static click() Run2");
   }

 }

class Run3 implements Run1,Run2
{
  @Override
   public void test()
   {
    Run1.super.test();
    Run2.super.test();
   }
}

class interfaceMain4
{
	public static void main(String[] args) 
	{
  
    Run3 ref =  new Run3(); 
    
    Run1.click();
    Run2.click();

    ref.test(); 
	}
}