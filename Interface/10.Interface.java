=>final class cannot be inherited.

=>final method can be inherited but cannot be Overriden.

=>final variables can be inherited but cannot be reinilize.



INTERFACE: [As a part of jdk 8 enhancement interface now on suports concrete methods]
		
	=>Interface is a type where methods are by default abstract method and  variables are by default
	  static and final.

	  	eg:
	  		interface <interface_name>
			{  
			    // declare constant fields  
			    // declare methods that abstract   
			    // by default.  
    		}  


	=>it is impossible to create Object of an Interface.

	=>We can create reference variables of interface type.

	=>The class inherite the properties of an interface only by using implements keyword.

	=>the interface from where the properties are inherited is called as SuperInterface(superclass).

	=>the class  which is implements the interface is called as Implemetation class(subclass).

			Dia:F:\JAVA\BASIC\Section 2\Images\10.Interface\Impliments.jpg

	<=>If a class implements (inherite) from an Interface then the  Implimentation class(subclass) must 
	  Override the all the abstract method present in the Super Interface (superclass) else the 
	  Implimentation class(subclass)  must be declerad as abstract class.

	=>we can inherite Class ---> Interface   impliments [keyword]

		-> A class can implements any Number of Interface.

		-> A class can extends and implements at the same time. 

		-> A class can extends only one superclass but it can implements any number of
	  		Interface at the same time.

				eg:class main extends Object impliments Interface1,Interface2 

	=>we can inherite Interface ---> Interface  extends [keyword]

		->An Interface should only exdends another Interface.

		->An interface cannot implements another interface.

	=>we can inherite Class ---> Class   extends [keyword]

	=>we cannot inherite Interface --> Class  

		->An Interface never Inherit or extends the Class[also Object class].

	
JDK-8 Interface supports concrete methods:

	=>concrete methods of interface should be declerad by using keywords

	   ->Static[use which should not be Overriden]

	   		-->Static method of Interface can be accessed by using interface name with dot(.) Operator.

	   ->default[use which you want to be Overriden]

	   		-->default methods of Interface can be accessed by using object of its implimentation class only.

	=>if you want a within the interface which should not be Overriden in the implimentation classes then the method
	declerad to be Static.
    
    =>if you want a within the interface which you want to be Overriden in the implimentation classes then the method
	declerad to be default.


		eg:
			1.F:\JAVA\BASIC\Section 2\interfaceMain.java
			2.F:\JAVA\BASIC\Section 2\interfaceMain2.java
			3.F:\JAVA\BASIC\Section 2\interfaceMain3.java

	=>if two Interface contain static methods with in the same name and same arguments then, we differentiate with the help
	of Interface name.

	=>if two Interface contain default methods with in the same name and same arguments then, it should overriden in
	Implimentation class.

    APPLICATIONS:

    =>if we have develop a class using two types then we should use interface.

    =>Note:abstract class cannot be used here becasue a class cannot extends from two different superclasses at the same time.
    