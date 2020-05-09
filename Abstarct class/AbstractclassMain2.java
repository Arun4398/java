abstract class Account              // Generalizatation
{ 

  int acc_no;
  double bal;
  abstract public void add_cust();
  abstract  public void rem_cust();   // by useing abstract class we can ensure there are no missing method implimentatioms in the sub class
 
  public void credit(double amt)     // abstract acts a blueprint to create the concrete class.
  {
     bal=bal+amt;
  }
  public void debit(double amt)
  {
     bal=bal-amt;
  }
  public void getbal()
  {
    System.out.println("Balance :"+bal);
  }
}
class Savings extends Account         // Specialization
{
   
   double min_bal;
   String date;
   @Override
   public void add_cust()
   {
     System.out.println("Savings account added");
   }
   @Override
   public void rem_cust()
   {
     System.out.println("Savings account removed");
   }
}
class Current extends Account
{  
   double inst;
   String date;
   @Override
   public void add_cust()
   {
    System.out.println("Current account added");
   }
   @Override
   public void rem_cust()
   {
    System.out.println("Current account removed");
   }
}
class AbstractclassMain2
{
	public static void main(String[] args)
	{
        

		 Savings s1= new Savings();

		 s1.add_cust();
		 System.out.println("Account no: "+s1.acc_no);

		 Current c1 = new Current();

		 c1.add_cust();
		 System.out.println("Account no: "+c1.acc_no);
	}
}