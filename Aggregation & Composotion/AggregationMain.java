class Branch
{
	int branch_code = 121;  // Global Non Static primitive variable;

	String city = "Blr";    // Global Non Static primitive variable; 

// (Aggregation is achived by creating "Global Static Reference Variable" that points to Object of another class.)
    
    static Account a1;      // "Global Static Reference variable;"  is Decalared

// The reference variable a1 is points the Object of the another class (Account)

	public static void addAccount(int a)  
	{
      a1 = new Account(a);  // Object is Created (Constructor call)
	}
 
}

class Account
{
	int acn_no;
	double bal;

	public Account(int acn_no)    // Constructors are used to initilaize the data member of the class;
	{
       this.acn_no = acn_no;
	}
    
    public void showAcntDetails()
    {
    	System.out.println("Accn No     : "+acn_no);
    	System.out.println("Bal         : "+bal);
    	System.out.println("Branch code : "+new Branch().branch_code);
    	System.out.println("city        : "+new Branch().city);
    }
}

class AggregationMain
{
	public static void main(String[] args) 
	{
	 int acno=20700;

	   Branch.addAccount(acno);

	   Branch.a1.showAcntDetails();

	   Branch.addAccount(acno+1);

	   Branch.a1.showAcntDetails();

	   Branch.a1.showAcntDetails();
	}
}
