class Parent
{
	int v=123;
	public void count()
	{
		System.out.println("count() of Parent");
	}
}
class Child1 extends Parent
{
	double z=123.45;
	public void display()
	{
		System.out.println("display() of Child1");
	}
}
class Child2 extends Parent
{
	String str="ABCDEF";
    public void view()
    {
    	System.out.println("view() of Child2");
    }
}
class classcaseException
{
	public static void main(String[] args) 
	{
		Parent ref1 = new Child1();

		Parent ref2 = new Child2();

		Child1 ref3 = (Child1)ref1;     // Child1 ref5 = (Child2)ref1;
                                                                        // classCaseExecption
		Child2 ref4 = (Child2)ref2;     //Child2 ref6 = (Child1)ref2;

		ref3.count();

		ref4.count();

		ref3.display();

        ref4.view();





	}
}