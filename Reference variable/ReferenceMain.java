class Reference
{
     
    String name="Arun";

    static String bankName = "ICICI";

    public void display()
    {
    	System.out.println("name : "+name);

    	System.out.println("Bank   : "+bankName);
    }
}

class ReferenceMain
{
  public static void main(String[] args) 
  {

    Reference a1;                              // DECALTARATION OF  Reference variable [classname refvarmname]

    a1 = new Reference();                      // creating object of the Reference variable [refvarmname= new classname();]

    Reference a2= new Reference();             // Declaration and creation of Reference variable ; [new is used to create a object]

    a1.display();                              // Using the Reference variable[refvarmname.methodname();]

    a2.display();                              // Using the another Reference variable

    System.out.println("a1="+a1);              // reference variable contains address of the object;

    System.out.println("a2="+a2);              // reference variable contains address of the object;

     Reference a3=a2;                          // a3 and a2 contains address of same object;

    System.out.println("a3="+a3);

   }
}=
