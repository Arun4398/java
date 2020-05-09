class Custmor
{
int id;
String name;
long phn;
Account a1;
 public Custmor(String name)
 {
 	this.name=name;
 	a1= new Account(name);
 }
}
class Account
{ 
	int acno;
	double bal;
	String owner;

	public Account(String owner)
	{
        this.owner=owner;

	}
   public void showdetails()
   {
   	System.out.println(acno);
   	System.out.println(bal);
   	System.out.println(owner);
   }
}
class ComposisionMain
{
	public static void main(String[] args)
	 {
		Custmor c1 = new Custmor("Arun");

		c1.a1.showdetails();

        Custmor c2 = new Custmor("Deepak");

        c2.a1.showdetails();

        


	}
}