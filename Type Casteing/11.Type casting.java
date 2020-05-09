TYPE CASTEING:
		
		Casteing->Converting

	=>Converting one type to another Type is called TypeCasteing.

	=>TypeCasteing is of 2 Types 

		->Primitive Casteing
		->Derived Casteing

Primitive Casteing:

	=>One Primitive data type Converting into another Primitive
		data type is called as Primitive Casteing.

	=> It has a Two Types
		->Widening
		->Narrowing

	Widening:
		->Converting lower data type value to higher data type value.
		->Widening is done Implicitly by Compiler.

	Narrowing:
		->Converting higher data type value to lower data type value.
		->Narrowing should be done by explicitly by programmer by writting
		  Casteing statement.

		  	Syntex: (data type) value/variable;


		  	eg:F:\JAVA\BASIC\Section 2\TypeCastingPrimitiveMain.java


	=>if a method haveing Primitive data type argument then for the same method we Can 
		    pass value which are lower data type compared to given method argument.

	=>if there are 2 overloaded methods one with lower data type argument ,if you pass the lower data type value
		 	and call the method Compiler will choose  method with lower data type argument.

		 	->Time takeing for data type Convertion. so it choose lower data type.

	=>Even though int and float have a same capactiy the data is represent in different format.

	=>Compared to int and float ,float is higher data type and int is lower data type.

	=>Even though long and double have a same capactiy the data is represent in different format.

	=>Compared to long and double, double is higher data type and long is lower data type.

	=>if we store the Character value into tht Integer variable then its UNICODE value will be
		   stored in the given Integer.

	=>if we store the other data types value into the Character variable then its value converted to Character
		    value using UNICODE.


		    	eg:
		    	   1.F:\JAVA\BASIC\Section 2\TypeCasteingPrimitiveEg.java
                   2.F:\JAVA\OOPS\Programs\11.Typecasteing\TypeCasteingMain2.java
		    	   3.F:\JAVA\OOPS\Programs\11.Typecasteing\TypeCasteingMain3.java
	    	       4.F:\JAVA\OOPS\Images\11.Typecasting\Type Casteing.jpg

Derived Casteing:

	=> Converting one object reference type to another object reference type 
	  is called as Derived Casteing.

	  Derived Casteing is of 2 types

	 	->Upcasteing
	 	->Downcasteing

Upcasteing:
	
	=>Converting Subclass object reference to superclass object reference is called as
	  Upcasteing.

	=>Upcasteing is achived by storing the address of Subclass object into Superclass reference variable.

	      eg:Superclass ref = new Subclass();

	=>Any superclass reference variable pointing Subclass object is called Upcaste reference variable.

	      eg:Subclass ref = new Subclass();

	         Superclass ref1 = ref;

	=>Using Upcasted reference variable we can access only the propreties of superclass and its 
	   impossible to access the Subclass propreties.

Downcasteing:

	=>Converting Upcasted object reference back to Subclass object reference is called Downcasteing.

	     eg:Subclass ref = new Subclass();
                                              -----------Upcasteing
	         Superclass ref1 = ref;

	         Subclass ref2 = (Subclass)ref1;  -----------Downcasteing


	=>With Out Upcasteing we did not done Downcasteing. 

	=>Using an Downcasted reference we can access  propreties of Both Superclass and Subclass.

		eg:
		   1.F:\JAVA\OOPS\Programs\11.Typecasteing\DerivedcasteMainEg.java
		   2.F:\JAVA\OOPS\Programs\11.Typecasteing\DerivedabstractMain.java
		   3.F:\JAVA\OOPS\Programs\11.Typecasteing\DerivedInterfaceMain.java

|----------------------------------------------------------------------------------------------------------------|
|	                                    What is ClassCastException?												 |
|																												 |		
|	=>whenever we try to Downcaste and Upcasted reference to a different class reference which do not			 |
|	  contains the propreties of given Object,the JVM will throw ClassCastException.						     |
|																												 |
|	 	eg:F:\JAVA\OOPS\Programs\11.Typecasteing\classcaseException.java	 									 |
|----------------------------------------------------------------------------------------------------------------|
	

	=>if method is haveing superclass reference argument then for the same method we can pass all of its Subclass
	   reference which compared to given method argument.

	=>if there are 2 overloaded methods one with Superclass reference argument and other with Subclass reference
	   argument,if we pass the Subclass reference and call the method,Compiler will always choose the lower
	   method with Subclass reference.

	=>if you want to access the Superclass propreties which is common to all Subclass then, there is no
	   need of Downcasteing.

	     eg:
	        1.F:\JAVA\OOPS\Programs\11.Typecasteing\SuperclassRefMain.java
	        2.F:\JAVA\OOPS\Programs\11.Typecasteing\SuperclassRefMain2.java
	        3.F:\JAVA\OOPS\Programs\11.Typecasteing\SuperclassRefMain3.java	

Instanceof:[keyword]

	=> instanceof operator compares given object reference with the given class returns true if it contains the given class
	   propreties else it returns false.

	     eg:F:\JAVA\OOPS\Programs\11.Typecasteing\TypecatseingDerivedMain.java

