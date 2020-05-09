Global variable and Local variable
	
Global variable:

	=> Any variable which is declared within the body of the class is called as Global variable.

	=> Global variable accessed by all method present in the same class.

	=> Global variable wil be intialized by the Compiler implicitly with the default value depending on 
	   the data type of the variable the programmer do not initialize it.

  => Type of Global variables:

         1.Primitive static Global variables
         2.Reference static Global variables
         3.Primitive Non-static Global variables
         4.Reference Non-static Global variables
  eg:
	   class Demo
	   {
	   	  int a;                  // Primitive Non-static Globle variable.
        static a1;              // Primitive Static Globle variable.
        Account b;              // Reference Non-static Referance Globle variable.
        static Account b1;      // Reference Static  Referance Globle variable.
        
	   	   public static void main(String[] args) 
	   	   {
	   		stmt...;
	   	   }
	   }

Local variable:

	=>Local variable is cannot be Static or Non-Static. 

	=>Any variable which is declared with the method decleration or within the method definition is called as Local variable.

	=>Local variable can be accessed only within the methods in which they are declared.

	=>Local variable must be declared by the progrmmer explicitly.

  =>Type of LocaL variables:

         1.Primitive Local variables.
         2.Reference Local variables.

  eg:
  		class Demo
  		{
  			public void test(ina a) //(arguments)------->local variables
  			{
  				int a;                // Local variable
  			}
  			public static void main(String[] args) 
  			{
  				int a;                // Local variable;
  				Account a;            // Reference Local variable;
  			}
  		}

  eg:
      1.F:\JAVA\BASIC\Section 2\GlobalLocal.java
      2.F:\JAVA\IMAGES\Section 2\3.Global&Local\1.Global&Local.jpeg

 
 	