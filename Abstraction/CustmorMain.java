// object implimetation layer
interface Account
{
	public void credit();
	public void debit();
}
class Savings implements Account
{
	@Override
	public void credit()
	{
		System.out.println("credit in Savings");
	}
	@Override
	public void debit()
	{
		System.out.println("debit in Savings");
	}
}
class Current implements Account
{
	@Override
	public void credit()
	{
		System.out.println("credit in Current");
	}
	@Override
	public void debit()
	{
		System.out.println("debit in Current");
	}
}
//  object creation layer
class Admin
{
	public static Account CreateAccount(String type)
	{
		Account ref = null;
		if (type.equalsIgnoreCase("Savings"))
		{
  			ref=new Savings();
  			return ref;
		}
		else
		{
			ref = new Current();
			return ref;
		}
	}
}
// object utilization layer
class CustmorMain
{
	public static void main(String[] args) 
	{
		Account a1=Admin.CreateAccount("Savings");
		a1.debit();

		Account a2=Admin.CreateAccount("Current");
		a2.debit();
	}
}