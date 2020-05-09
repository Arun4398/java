class Constructor2
{
	int id;
	String name;
	String addr;
	long phn;
  public Constructor2(int id,String name,String addr,long phn)
  {
    // this keyword said to JVM this is Global variable
    
     this.id=id;        // id=id;
     this.name=name;    // name=name;    this gives default values. JVM take the local variable as global variables if the variables are same ;
     this.addr=addr;    // addr=addr;
     this.phn=phn;      // phn=phn;
  }
  public void showcust()
  {
  	System.out.println(id);
  	System.out.println(name);
  	System.out.println(addr);
  	System.out.println(phn);
  }
}
class Constructor2Main
{
	public static void main(String[] args)
	{
		Constructor2 c1=new Constructor2(732904,"Arun","Erode",9003416870l);
		c1.showcust();
		Constructor2 c2=new Constructor2(732910,"Deepak","Salem",8973089809l);
		c2.showcust();
	}
}