class Parent
{
  int a=123;
  public void display()
  {
  	System.out.println("display() of Parent");
  }
}
class Child1 extends Parent
{

} 
class Child2 extends Parent
{

}
class SuperclassRefMain3
{
	public static void test(Parent ref)
	{
    	System.out.println("ref : "+ref);

    	ref.display();
	}
	public static void main(String[] args) 
	{
		Child1 ref1 = new Child1();
		test(ref1);

		Child2 ref2 = new Child2();
		test(ref2);
	}
}