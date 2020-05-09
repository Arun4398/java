interface Run1
{
   public void test();
}

interface Run2
{
   public void click();
   public void test();
}

class Run3 implements Run1,Run2
{
   @Override
   public void test()
   {
     System.out.println("Overriding test()");
   }

   @Override
   public void click()
   {
     System.out.println("Overriding click()");
   }
}

class interfaceMain3
{
	public static void main(String[] args) 
	{
  
    Run3 ref =  new Run3();
    ref.test();
    ref.click();
   
	}
}