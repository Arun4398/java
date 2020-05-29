package pkg1;

public class AccessSpecifiersMain1 
{
public static void main(String[] args)
{
	AccessSpecifiersMain2 s1 =new AccessSpecifiersMain2();
	
 	System.out.println("public accessed by all classes present in same and different packages");
 	
	System.out.println("public a = "+s1.a);
	s1.test1();
	
	System.out.println("protected accessed by all classespresent in package");
	System.out.println("by inheritance  and subclass obj we can access it in different packages");
	
	System.out.println("protected b = "+s1.b);
	s1.test2();
	
	System.out.println("package level accessed by all classespresent in package");
	
	System.out.println("package level c = "+s1.c);
	s1.test3();

}
}
