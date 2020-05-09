class TypeCastingPrimitiveMain
{
	public static void main(String[] args) 
	{
		int i1= 15;

		double d1 = i1;

		System.out.println("Widening");

		System.out.println("i1 : "+i1);
		System.out.println("d1 : "+d1);

		System.out.println("Narrowing");

		double d2= 4.35;

		int i2=(int) d2;

		double d3=4.35;

		float i3 =(float) d3;

		System.out.println("d2 : "+d2);
		System.out.println("i2 : "+i2);
		System.out.println("----------------");
		System.out.println("d3 : "+d3);
		System.out.println("i3 : "+i3);
	}
}