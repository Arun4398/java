ABSTRACT CLASS & ABSTRACT METHOD:
		
		=> A method which has only method Decleration and no method Definiton is called Abstract method.

		=>Abstract method must be declerad by using abstract Keyword.

		=>If a class contains aleast one abstract method,then the class must be declerad as abstract class.

		=>it is Imposible to create a Object of abstract class.

		=>we can Create a Reference variable of abstract class.

		<=>If a class inherite from an abstract class then the subclass must Override the all the abstract method 
		present in the superclass else the subclass must be declerad as abstract class. 
        
        =>final, private and static methods cannot be Overriden, So abstract method cannot be declerad as final,private,static

        => within the abstract class
        	-> only Abstract methods or 
        	-> only Concrete methods or
        	-> both Abstract and Concrete methods.

        =>Non-static Non-private members of abstract class can be Accessed by Createing Object of it sub class

        =>Static non-private member of abstract class can be accessed by classname.membername;.

        =>if Generalized method of all the subclass have Different Definition then those methods should be declared as 
        Abstract method in generalized class. 

        =>By useing abstarct class we can ensure there are no missing method implimentatioms in the sub class.

        =>abstract class acts a blueprint to create the concrete class.


        	eg:
        	   1.F:\JAVA\BASIC\Section 2\AbstractclassMain.java
        	   2.F:\JAVA\BASIC\Section 2\AbstractclassMain2.java


 CONCRETE METHOD & CONCRETE CLASS:[Normal Method]

 		=>A method which has a both method Decleration and Definitaion is called concrete method.

 		=>if class contains only concrete method then the class called as concrete class.

 		=>if Generalized method of all the subclass have Same Definition then those methods should be declared as 
 		 	Concrete method in generalized class.

