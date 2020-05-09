class Parent
{

}
class Child1 extends Parent
{

} 
class Child2 extends Parent
{

}
class SuperclassRefMain
{
	public static void test(Parent ref)
	{
    	System.out.println("ref : "+ref);
	}
	public static void main(String[] args) 
	{
		Child1 ref1 = new Child1();
		test(ref1);

		Child2 ref2 = new Child2();
		test(ref2);
	}
}