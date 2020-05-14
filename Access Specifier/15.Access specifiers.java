ACCESS SPECIFIERS:

     => public
     => protected
     => package level
     => private

     =>Access Specifiers are used to provide Security for the classes and its members by controlling the
       visiblity.

       ->public:

       		 -if you decleared any entity as public , then it can be accessed from any classes present in any package.

       		 -public entity will have a hightest visiblity and lowest Security.

       ->protected:

       		 -if you decleared any entity as protected , then it can be accessed from any classes present in same package.

       		 -protected entity of a class can be accesed by other classes present in different package by inheritance and
       		    createing Object of subclass.

        ->package-level:

        	-if you decleared any entity without using any Access Specifiers keywords then, that entity is called as 
        	package-level member or default member.

        	-if you decleared any entity as package-level , then it can be accessed  STRICITY by the classes 
        	present in the same  package.

        ->private:
 2.ConstructorOverloading<br/><br/>
        	 -if you decleared any entity as private , then it can be accessed only within the  class in which 
        		 they are decleared.

        	-private entity will have a hightest Security and lowest Visiblity.
