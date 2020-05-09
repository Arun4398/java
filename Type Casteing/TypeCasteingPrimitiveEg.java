class TypeCasteingPrimitiveEg
{
	public static void test(int i)
	{
		System.out.println("int "+i);

	}
	public static void test(long i)
	{
		System.out.println("long "+i);
	}
	public static void test(double i)
	{
		System.out.println("double "+i);
	}
	
	public static void main(String[] args) 
	{
		
		byte a=12;
		test(a);

		short b=15;
		test(b);
		
		int c=123;
		test(c);

		float d=2.3f;
		test(d);

		long l=12345l;
		test(l);

		Double e=12.34d;
		test(e);

System.out.println("(widening)int to float");

		int g=12;
		float f=g;

		System.out.println(f);

System.out.println("(Narrowing)float to int");

		float h = 1.3f;

		int i = (int) h;

		System.out.println(i);

System.out.println("(widening)long to double");

		long j=12987634l;
		double k=j;

		System.out.println(k);

System.out.println("(Narrowing)double to long");

		double m = 13565.34d;

		long n = (long) m;

		System.out.println(n);

System.out.println("Character Data type");
System.out.println("widening");

		char o='A';
		int p=o;
        System.out.println("int "+p); 

        float s=o;
        System.out.println("float "+s);

        long t=o;
        System.out.println("long "+t);

        double u=o;
        System.out.println("double "+t);

System.out.println("Narrowing");
     
        int q=68;
        char r=(char)q;

        System.out.println(r);

        long v=123445l;
        char w=(char)v;

        System.out.println("Long "+w);

	}
}