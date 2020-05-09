Inheritace:

   =>One class  Acquiring a properties of  another class is called as Inheritace.

   =>The Class From where properties are Inherited is called as Superclass or Baseclass or Parantclass.

   =>The Class Which is Inheriting the  properties is called Subclass or Derivedclass or Childclass.

   =>In Java Inheritace is achived by using [extends] keyword.

   =>Useing Superclass Object we can access only Properties Superclass.

   =>Useing Subclass  Object we can access Properties Both Subclass and  Superclass.

    ->Useing Subclass  Object we can access both Static and Non-Static members Properties of Both Subclass and  Superclass.

   =>Constructor of the class cannot be Inherited.[it is done by super();(super statement)]


         eg:
            1.  F:\JAVA\BASIC\Section 2\Images\6.Inheritance

            2. class Superclass
               {
                  add()
                  sub()
               }
               class Subclass extends Superclass
               {
                  sin()
                  cos()
               }

   =>final Data member and Function member of the class can be Inherited.

         eg:
           class Name
           {
               final int a;
               final public void test()
               {
                  stmt..;
               }
           }

   =>final classes cannot be Inherited. 

         eg: 
            final class Name
            {
               stmt..;
            }

   =>private Data member and Function member of the class cannot be Inherited.

         eg:
            class Name
           {
               private int a;
               private void test()
               {
                  stmt..;
               }
           }

  CONSTRUCTOR CHAINING:
    
    =>The Process of Subclass Constructor calling its Superclass Constructor and superclass 
      Constructor calling Objectclass Constructor is called Constructor chaining.

<------------------------------------------------------------------------------------------------------------------------------------------>

   => Different Types of Inheritace are

       1.Single Inheritace
       2.Multilevel Inheritace
       3.Mutiple Inheritace
       4.Hierarchical Inheritace
       5.Hybrid Inheritace




   1.SINGLE INHERITACE:

      =>One Subclass Inheriting from one Single Superclass is called as Single Inheritace.

            eg:
               1.F:\JAVA\BASIC\Section 2\Images\6.Inheritance\single.jpeg
               2.F:\JAVA\BASIC\Section 2\SingleInheritanceMain.java

   2.MULTILEVEL INHERITACE:

      =>Subclass Inheriting the properties of Superclass and the Superclass Inheriting the properties of 
         another Superclass is called as Multilevel Inheritace.

            eg:
               1.F:\JAVA\BASIC\Section 2\Images\6.Inheritance\multilevel.jpeg
               2.F:\JAVA\BASIC\Section 2\MultilevelInheritanceMain.java

   3.MULTIPLE INHERITACE:

      =>one Subclass Inheriting from 2 or more Subclass Is called Mutiple Inheritace.

      =>java do not support Mutiple Inheritace.[supported through interface only]


  4.HIERARCHICAL INHERITACE:

      =>One Superclass class Inherited by 2 or more Subclass is called Hierarchical Inheritace.

      Generalization:

        ->Declaring common methods and variables of all Subclasses in One Superclass.

      Specialization:

        ->Declaring methods and variables Specifically for one Subclass.

            eg:
                1.F:\JAVA\BASIC\Section 2\Images\6.Inheritance\3.hierarchical.jpeg
                2.F:\JAVA\BASIC\Section 2\HierarchicalInheritanceMain.java

  5.HYBRID INHERITACE:

      =>It is the combination of Different Type of Inheritance.

<---------------------------------------------------------------------------------------------------------------------------------------->

  super(); {super statement]   {for Constructor}

      =>super(); Create the  Object of Superclass whenever Object of the Subclass is Created to Inherit the properties.

      =>Can be Written explicity by the programmer or implicity by the Compiler in compile time.

      =>if the superclass contains only parameterized Constructor then the programmer should write the super(); explicity and pass the arguments.

      =>super(); must be Written only with in Constructor  body and it should be the first stmt in the Constructor.

      =>Always Superclass Object is Created first and then the properties should Inherited to subclass object.

      =>Mutiple super(); within the same Constructor body is not allowed.because writting Mutiple super(); may lead creation of 
        Mutiple superclass objects which is not required.

      =>Objectclass is the super most class in java. 

      =>Each and Every class Directly or Indirectly inherits from Objectclass. 

            eg:F:\JAVA\BASIC\Section 2\SuperStatement.java


|-----------------------Explain Diamond Problem In Java? OR Why Java Donot Support Mutiple Inheritace?--------------------------|
|                                                                                                                               | 
|                                                                                                                               |   
|    =>It Create an Ambiguity/Confusion for the Compiler to choose the path from where properties of                            |
|      object class shoud be copied to subclass.                                                                                |
|                                                                                                                               |
|    =>To Call multiple constructor of multiple supercalss  we should write multiple super(); which not supported in java.      |
|                                                                                                                               |
|    =>If both superclass have the same name and same arguments than it creates an ambifuity for the complier to choose which   |
|      method should be callee for the execution when it callsed  using subclasses.                                             |
|                                                                                                                               |
|            eg:                                                                                                                |
|                1.                                                                                                             |
|                                                                                                                               |
|-------------------------------------------------------------------------------------------------------------------------------|
                

  super [keyword]: {for members of Subclass}

    => super keyword is special in-bulid reference variable which it will Created By JVM it will point 
      to immediate parant class

    =>super keyword is used within the Subclass In order to access the properties of immediate Superclass.




