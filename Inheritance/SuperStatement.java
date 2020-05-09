
/*Object is the super most class.
  Each and Every class Directly or Indirectly inherits from Objectclass.*/

class Superclass extends Object    // 
{
	public Superclass()
	{
		/*Create the  Object of Superclass whenever Object 
		of the Subclass is Created to Inherit the properties.*/
		
      super();//call Object() constructor
	  System.out.println("this is Superclass() const");
	}

	public Superclass(int v1)
	{
      super();//call Object() constructor
	  System.out.println("this is Superclass(int v1) const");
	}
}

class Subclass extends Superclass
{
	public Subclass()
	{
	  super();//call superclass() const..
	  System.out.println("this is Subclass() const");
	}	
}

class SuperStatement extends Object
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
       
       new Subclass();

	   System.out.println("Program ends...");
	}
}