class Account              // Generalizatation
{ 

  int acc_no;
  double bal;
  public Account(int acc_no)
  {
   this.acc_no=acc_no;
  }
 
  public void credit(double amt)
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
   
   public Savings(int acc_no)
   {
    super(acc_no);
   }
   double min_bal;
   String date;
   public void add_cust()
   {
     System.out.println("Savings account added");
   }
   public void rem_cust()
   {
     System.out.println("Savings account removed");
   }
}
class Current extends Account
{  
   	
   public Current(int acc_no)
   {
    super(acc_no);
   }
   
  double inst;
   String date;
   public void add_cust()
   {
    System.out.println("Current account added");
   }
   public void rem_cust()
   {
    System.out.println("Current account removed");
   }

}
class HierarchicalInheritanceMain
{
	public static void main(String[] args)
	{
        

		 Savings s1= new Savings(20700);

		 s1.add_cust();
		 System.out.println("Account no: "+s1.acc_no);

		 Current c1 = new Current(70200);

		 c1.add_cust();
		 System.out.println("Account no: "+c1.acc_no);
	}
}