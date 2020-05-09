CONSTURCTORS:

	=> Constructors is a Special type of Method which has Same Name as the Class Name.

	=> Constructors are Executed only when the Object of the class is Created. (object creation --> new classname();)

	=> Every class must and should have a Constructor.

	=> if programmer do not write the Constructors then the Compiler will write a default Constructors implicitly at the complie time.

	=> The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

	       eg:
	           class demo
	            {
	            	public demo()    ---> default Constructors[Zero-argument Constructors]
	            	{
                        
	            	}
	            } 

	=> Programmer can write Constructors explicitly and there are two Types of Constructors,

	                 1.zero-argument Constructors.
	                 	eg: 
	                 	   public demo()
	                 	   {

	                 	   }

	                 2.parameterized  Constructors.
	                 	eg:
	                 		public demo(int a1)    ----->public demo(parameters)
	                 		{

	                 		}

	=> if programmer writes a Constructors then the  Compiler Will Not writes any Constructors implicitly.

	=> return statement can be speified within Constructor body.(optional) return stmt used to give the direction to the JVM

	-=> Constructors cannot be 

	       _> public static classname()
                                                ==================> This two are not Constructors
           -> public final classname() 

         
	-=> if you write a Returndatatype in the Constructors than it will be considered as Method().

	       -> public void classname()          ===================> This is Method()


	   eg:F:\JAVA\BASIC\Section 2\ConstructorsMain.java

06.04.2020

USE OF CONSTURCTORS:

	=>Constructors are used Only to Initialize Data Members of the class.
       
    this keyword:
 
 		=>it is used to differentiate global variable and local varible with in the Class or Constructors the variable names are same.

 		Syntex:
 		      this.variablename=variablename;

 		    eg:
 		      this.name[Global]=name[Local];

     eg:F:\JAVA\BASIC\Section 2\Constructor2Main.java

CONSTURCTORS OVERLOADING:

		=> Developing mulitiple Constructors within the same class which may differ in 
		   1.Number of argument.
		   2.Data Type of argument.
		   3.Order of argument. 
		   is called as Constructors Overloading.

	 eg:
	 	1.F:\JAVA\BASIC\Section 2\ConstructorOverloadingMain.java

USE OF CONSTURCTORS OVERLOADING:

	 eg:
	 	1.F:\JAVA\BASIC\Section 2\OverloadingEgMain.java
	 	
	 	2.F:\JAVA\BASIC\Section 2\Images\4.Constructors\8.ConstructorOverloading
        






	