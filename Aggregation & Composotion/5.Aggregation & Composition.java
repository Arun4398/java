RELATION BETWEEN CLASSES:

Class Diagram:

	=> It is a pictorial representation of class.

	=> It is helps to understand the logical relation between the classes in much better way.

	  eg:F:\JAVA\IMAGES\section 2\5.Aggregation & Composition\1.class diagram.jpeg

    => Two are More classes related useing two type of relations

          1.Has-A relation (Aggregation&Composition)

          2.Is-A relation  (Inhertance)

 Has-A Relation:

	=> Has-A relation defines logical dependentcy of one object to another object

    => Has-A relation are two Types 

 		      1.Aggregation

 		      2.Composition

      eg:F:\JAVA\IMAGES\section 2\5.Aggregation & Composition\5.eg diagram.jpeg

 Aggregation:

 	=>It is a Weaker Has-A relation where one Object is Weakly depended on another Object.

 	=>Aggregation is achived by creating Global Static Reference Variable that points to Object of anther class.


 	 eg:F:\JAVA\BASIC\Section 2\AggregationMain.java
 	 
 	 	->Branch.a1.showdetails();

 	 		  Branch        --> Class

 	 	 	  a1            --> Global Static Reference Variable of Account type

 	  	      showdetails() --> non-static method of Account class

 	  	->System.out.println();

 	  			System      --> Class

 	  			out         --> Global Static Reference Variable of PrintStream type

 	  			Prinntln    --> non-static method of PrintStream class


 Composition:

  =>It is  a Stronger Has-A relations where existance of the object is Strongly depenedent on another object.

  =>Composition is achived by creating Global Non-Static Reference Variable that points to Object of another class.

  		 eg:F:\JAVA\BASIC\Section 2\ComposisionMain.java



