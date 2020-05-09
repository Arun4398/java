class Parent
{

}
class Child1 extends Parent
{

} 
class Child2 extends Parent
{

}
class SuperclassRefMain2
{
	public static void test(Parent ref)
	{
    	System.out.println("ref of Parent : "+ref);
	}
	public static void test(Child1 ref)
	{
    	System.out.println("ref of Child1 : "+ref);
	}
	public static void test(Child2 ref)
	{
    	System.out.println("ref of Child2 : "+ref);
	}

	public static void main(String[] args) 
	{
		Child1 ref1 = new Child1();
		test(ref1);

		Child2 ref2 = new Child2();
		test(ref2);
	}
}