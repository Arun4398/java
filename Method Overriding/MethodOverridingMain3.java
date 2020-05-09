class AndroidOs
{
	 public void showHomeScreen()
	{
		System.out.println("Show 5 icons");
	}
}
class SamsungOs extends AndroidOs
{
	@Override
	public void showHomeScreen()
	{
		System.out.println("Show 8 icons");
	}
}
class OnepluseOs  extends AndroidOs
{
	@Override
	public void showHomeScreen()
	{
		System.out.println("Show 9 icons");
	}
}
class NokiaOs  extends AndroidOs
{
	@Override
	public void showHomeScreen()
	{
		System.out.println("Show 5 icons");
	}
}
class MethodOverridingMain3
{
	public static void main(String[] args) 
	{
		SamsungOs s1=new SamsungOs();
		s1.showHomeScreen();

		OnepluseOs o1= new OnepluseOs();
		o1.showHomeScreen();

		NokiaOs n1 =new NokiaOs();
		n1.showHomeScreen();
		
	}
}