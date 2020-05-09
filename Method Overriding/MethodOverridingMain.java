class Superclass
{
  public void override(int n)
  {
  	System.out.println("method of Superclass");

    for(int i=1;i<=n;i++)
    {
    	System.out.println(i);
    }
  }
}
class Subclass extends Superclass
{
	@Override         //(Override annotation)
   public void override(int n)
  {
  	System.out.println("method of Subclass");

    for(int i=n;i>=1;i--)
    {
    	System.out.println(i);
    }
  }
}
class MethodOverridingMain
{
	public static void main(String[] args) 
	{
		Superclass s1 =new Superclass();
		s1.override(5);

		Subclass s2 =new Subclass();
		s2.override(5);
	}
}