// For the scenairo based programs ConstructorOverloading is used.
class OverloadingEg
{

	String name;
	String email;
	Long adhr;

  public OverloadingEg(String name,String email,Long adhr)    // all three inputs are given by user;
  {  
    this.name=name;
	  this.email=email;
	  this.adhr=adhr;
  }

  public OverloadingEg(String name,String email)              // only two inputs are given by the user; 
  {
   this.name=name;
	 this.email=email;
  }

  public void showUser()
  {
   System.out.println("name :"+name);
   System.out.println("email:"+email);
   System.out.println("adhr :"+adhr);
  }

}
class OverloadingEgMain
{

	public static void main(String[] args) 
	{
	 OverloadingEg u1=new OverloadingEg("arun","aK@gamil.com",359591249140l);

	 u1.showUser();

	 OverloadingEg u2=new OverloadingEg("deepak","dr@gamail.com");

	 u2.showUser();
	}

}