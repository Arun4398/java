class Static_NonStatic
{

// Any data member whose value will be Different across all the object should be decleard as Non-Static.

	  long   acno = 1234567890;               // Non-Static data member
	  double bal = 0.0;                      // Non-Static data member 
    String owner = "smith";               // Non-Static data member
    String branch = "BTR";               // Non-Static data member

// Any data member whose value will be Same across all the object should be decleard as Static.

    static String bankName = "ICICI";  // Static data member

//Any function member which using Only Static member present in same class than that functions should be decleard as Static.
    
    public static void showBankName() //-------------------------------------------------------------> Static function member.
    {
        System.out.println("Bank : "+bankName);  // Static data member
    }

    public void debit(double amt)    //-------------------------------------------------------------> Non-Static function member.
    {
      bal = bal - amt;          //Non-Static data member
      System.out.println("Avl.bal="+bal);
    }       

    public void credit(double amt)   //-------------------------------------------------------------> Non-Static function member.
    {
      bal = bal + amt;         //Non-Static data member
      System.out.println("Avl.bal="+bal);
    }       

//Any function member which using  Atleast One Non-Static member present in same class than that functions should be decleard as Non-Static.

    public void showAccntDetails()    //-------------------------------------------------------------> Non-Static function member.
    {
    	System.out.println("acno   : "+acno);     
    	System.out.println("bal    : "+bal);                  //Non-Static data member
    	System.out.println("owner  : "+owner);    
    	System.out.println("branch : "+branch);   

    	System.out.println("Bank   : "+bankName);             //Static data member
    }
  public static void main(String[] args)  // Static
  {
      showBankName();        // static
      new Static_NonStatic().debit(1000);       // Non-static
      new Static_NonStatic().credit(500);       // Non-static 
      new Static_NonStatic().showAccntDetails();// Non-static

  }
}