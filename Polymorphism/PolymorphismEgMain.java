interface Card
{
   public void makepayment();
}
class Debit implements Card
{
	@Override
	public void makepayment()
	{
		System.out.println("payment by Debit card");
	}
}
class Credit implements Card
{
	@Override
	public void makepayment()
	{
		System.out.println("payment by Debit card");
	}
}
class SwipeMachine
{
	public static void Swipecard(Card ref)
	{
	ref.makepayment();
	}
}
class PolymorphismEgMain
{
	public static void main(String[] args) 
	{
		Debit d= new Debit();

		SwipeMachine.Swipecard(d);

		Credit c= new Credit();

		SwipeMachine.Swipecard(c);


	}
}