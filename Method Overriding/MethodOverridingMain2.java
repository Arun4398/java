class Whatsappv1
{
  public void showTickMark()
  {
System.out.println("One tick mark");
  }
}
class Whatsappv2 extends  Whatsappv1
{
	@Override
public void showTickMark()
  {

  	System.out.println("Two black tick mark");
  }
}
class Whatsappv3 extends  Whatsappv2
{
public void showTickMark()
  {
System.out.println("two blue tick mark");  }
}
class MethodOverridingMain2
{
	public static void main(String[] args) 
	{
		Whatsappv1 v1=new Whatsappv1();
		v1.showTickMark();

		Whatsappv2 v2= new Whatsappv2();
		v2.showTickMark();

		Whatsappv3 v3=new Whatsappv3();
		v3.showTickMark();
	}
}
