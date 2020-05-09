OOPS:          Inheritace    -> code reuseablity
	           polymorphism  -> code flexiblity
	           Abstraction   -> code reuseablity and flexiblity
	           Encapsulation -> code security
	           
CLASS AND OBJECTS:

OBJECTS:
	Any entity which has states and behaviours is called as Object.

	STATES     -> Attributes
	BEHAVIOURS -> Methods

CLASSES:
	Class is blueprint of the objects

	Class wil have 2 typoe of mmembers
	          1. data members  (variables)
	          2. Function members (methods)

	Members of the class can be 2 type
			  1. Static     (Access modifier)     -- Static data members & Static function members
			  2. Non-Static                       -- Non-Static data members & Non-Static function members


STATIC MEMBERS:
	Any data (or) function members which is decleard using "Static" Keyword
	is called as static member.

	 				eg:
			              class Demo
			              { 
			               static int a1;
				   		   public static void test()
			               {--------}
			              }

  SAME CLASS 
   -------------> Using name of the members 
   				Syntex:
   				        membername;
   				   eg:
   				      	System.out.println(a1);
   				      	
   				      	test();

             eg:F:\JAVA\BASIC\Section 2\Staticsame.java
 
  DIFFERENT CLASS
  	------------> Only by using Class name with dot(.) operator with member name
  				Syntex:
  				        class name.member name;
  				   eg:
  				      	System.out.println(Demo.a1);
  				      	Demo.test();

             eg:F:\JAVA\BASIC\Section 2\StaticdiffMain.java
_______________________________________________________________________________________

NON-STAIC MEMBERS:
	Any data (or) function members which is decleard WITHOUT using "Static" Keyword
	is called as Non-static member.

				   eg:   
		                class Demo
		                {
		                int a1;
			    		public void test()
		                {-------}
		                }

  SAME CLASS
  (Non-static members accessed by static members)
   ------------>Only by Createing an object
   				Syntex:
   					    new class name().membername;

   				   eg:  
		                  System.out.println(new Demo().a1);

		   				  new Demo().test();

  (Non-static members accessed by Non-static members)
   ------------>Using name of the members
    			Syntex:
    				     membername;

    			   eg:  
		                 System.out.println(a1);

		                 test();

             	   eg:F:\JAVA\BASIC\Section 2\Nonstaticsame.java

    DIFFERENT CLASS
    (Non-static method accessed by static method)&&(Non-static method accessed by Non-static method)
    ------------> Only by Createing an Object->new[Keyword] is used to create a Object
            Syntex:
                   new class name().membername;

	               eg:   
		                   System.out.println(new Demo().a1);

		   				   new Demo().test();

	               eg:F:\JAVA\BASIC\Section 2\NonstaticdiffMain.java

	___________________________________________________________________________________________________

	STATIC    --> only one copy in memory

	NON-STAIC --> multiple copy in memory

DATA MEMBERS:

    Static:
    	Any data member whose value will be Same across all the object should be decleard as Static.

    Non-Static:
    	Any data member whose value will be Different across all the object should be decleard as Non-Static.	 

             eg:F:\JAVA\Image\section 2\class and object\10

FUNCTION MEMBERS:

	Static:
		Any function member which using Only Static member present in same class than that functions should be decleard as Static.

	Non-Static:
		Any function member which using  Atleast One Non-Static member present in same class than that functions should be decleard as Non-Static.

	           eg:F:\JAVA\basics\Section 2\Static_NonStatic.











