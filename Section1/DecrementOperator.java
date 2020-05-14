class DecrementOperator
{
	public static void main(String[] args) 
	{
		System.out.println("Decrement");
		int x=10;
		int y=10;
		int res1,res2;
		System.out.println("pre-Decrement");
		System.out.println(x);
		res1=--x + 10;           //pre-Decrement
		System.out.println(res1);
		System.out.println(x);
		System.out.println("post-Decrement");
		System.out.println(y);
		res2=y-- + 10;          // post-Decrement
		System.out.println(res2);
		System.out.println(y);

// pre and post Decrement operator's are Independent of any mathamatical expression than operator will give same result.

		System.out.println("pre and post Decrement operator's are Independent of any mathamatical expression than operator will give same result.");
		int a=10;
		int b=10;
		int res3,res4;
		System.out.println(a);
		--a;                  //x=x-1 pre-Decrement
		System.out.println(a);

		System.out.println(b);
		b--;                 //y=y-1 post-Decrement
		System.out.println(b);
	}
}