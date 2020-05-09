METHOD OVERRIDING:

		=>Subclass Inheriting Method of Superclass and changeing the method definition according to Subclass Specification without 
		  changeing method declaration is called as method Overriding
 
		=>Inheritance is Manditory for Method Overriding.

		=>@Override -(Override annotation)

			->it compares the method declaration of Subclass with every other method declaration present in Superclass 
			  and throw the error if there is no matching method declaration found.

		    ->@-annotation

		=>final, private and static methods cannot be Overriden.

				eg:
					1.F:\JAVA\BASIC\Section 2\MethodOverridingMain.java
					2.F:\JAVA\BASIC\Section 2\MethodOverridingMain2.java
					2.F:\JAVA\BASIC\Section 2\MethodOverridingMain3.java


METHOD HIDDING:

		=> If Subclass and superclass contain Static Method with same name and same arguments than it is called Method Hidding.

		=>it Hidding the method of superclass so this is called as method Hidding.

		=>if subclass object cannot access the method which are in Hidding.

		=>Hidden methods access only by the class which is present.

		 		eg:
		 			1.F:\JAVA\BASIC\Section 2\Images\8.Method Overriding\5.method hidding.png
		 			2.F:\JAVA\BASIC\Section 2\MethodHiddingMain.java
