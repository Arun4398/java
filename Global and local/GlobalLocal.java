class GlobalLocal
{    
	static int g;                                       //Global variable initialized by the Compiler(default value based on data type)

	static int b=13;                                    // Global variable (static)

	int a=12;                                           // Global variable (non-static)

	public static void test(int f)                      // arguments variable is(local variable) 
	{
		int e=f;

     // int x;----------------------------------------- // Local variable Must Initialized by the programmer.

		int c=14;                                       // Local variable for the method test

		System.out.println("TEST METHOD");

		System.out.println("non-static Global a = "+ new GlobalLocal().a);   // access the non-static Global variable

		System.out.println("static Global b = "+b);       // access the static Global variable 

		System.out.println("static Global g = "+g);

		System.out.println("loacal c = "+c);              // access the loacal variable

		System.out.println("local argument e = "+e);      // access the local argument variable
		
	}

	public static void main(String[] args) 

	{

		int d=15;                                      //Local variable for the main method 

		System.out.println("MAIN METHOD");

		System.out.println("non-static Global a = "+  new GlobalLocal().a);          // access the non-static Global variable

		System.out.println("static Global b = "+b);          // access the static Global variable

		System.out.println("Global-initialized by the Compiler g = "+g);  //Access the Global variable initialized(default value) by the Compiler

		test(5);                             // called method with Local argument
	
	}
}