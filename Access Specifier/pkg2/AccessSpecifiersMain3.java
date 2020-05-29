package pkg2;

import pkg1.AccessSpecifiersMain2;

public class AccessSpecifiersMain3 extends AccessSpecifiersMain2
{
	public static void main(String[] args)
	{
    AccessSpecifiersMain2 s1 =new AccessSpecifiersMain2();
	
    System.out.println("public accessed by all classes present in same and different packages");
	System.out.println("public a = "+s1.a);
	s1.test1();
	

	System.out.println("protected accessed by all classespresent in package");
	System.out.println("by inheritance and subclass obj we can access it in different packages");
	
	AccessSpecifiersMain3 d1=new AccessSpecifiersMain3();
	
	System.out.println("protected b = "+d1.b);
	d1.test2();
	
	
	}
}
