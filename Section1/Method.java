class Method
{
	public static double interest (double p,double n,double r) // Method declaration.
		{
			double si;
			si=(p*n*r)/100;          // method defintion.
	 
			return si;
		}
	public static void concat(String str)
		{
			System.out.println("hello"+str);
			
			return ;
		}
	public static void main(String[] args) 
		{
		double si=interest(1000,2,3); // method calling.
		System.out.println(si+5);

		concat("worldf");
		concat("java");
		}


}