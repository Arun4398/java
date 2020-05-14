// Only for sorted array (this program assending)
class Binarysearch
{
	public static boolean assending(int a[],int ele)//........Execute Called Method
	{
		int first=0;//-------------->first=0;
		int last=a.length-1;//------>last=9;  

		for(int i=0;i<a.length;i++)
	    {
		   int mid=(first+last)/2; //----> I-((0+9)/2=>mid=4 -II->((5+9)/2)=>mid=7

		   if(a[mid]==ele)   //----------> I=>40==80 (f)------II=> 80==80(t)
		   {
			return true; //-----------------------------------II-> return true
		    }
		    else if(a[mid]<ele) //-------> I=>40<80(t)
		   {
			first=mid+1;  //i------------=>first=5
		   }
		   else
		   {
		   last=mid-1;
		   }	 
	   }
          return false;
	}
	public static boolean desending(int a[],int ele)//........Execute Called Method
	{
		int first=0;//-------------->first=0;
		int last=a.length-1;//------>last=9;    

		for(int i=0;i<a.length;i++)
	    {
		   int mid=(first+last)/2; //------------->I-((0+9)/2=>mid=4-II->((5+9)/2)=>mid=7

		   if(a[mid]==ele)   //- ----------------->I=>40==30 (F)-----II=> 30==30(t)
		   {
			return true; //------------------------------------------II-> return true
		    }
		    else if(a[mid]>ele) //---------------->I=>40>30(T)
		   {
			first=mid+1;  // --------------------->I=>first= 5;
		   }
		   else
		   {
		   last=mid-1;
		   }	 
	   }
     return false;
	}
	public static void main(String[] args)//............ Execute main method
	{
	int a1[]={10,20,30,40,50,60,70,80,90,100};//............declaration, creation and initialization 
	int b1[]={100,90,80,70,60,50,40,30,20,10};//............declaration, creation and initialization 
	boolean res=assending(a1,80);//.........................Calling the method named as assending
	boolean res=assending(a1,150);//.........................Calling the method named as assending
	boolean res1=desending(b1,30);//........................Calling the method named as desending
	boolean res2=desending(b1,120);//.......................Calling the method named as desending
	System.out.println(res);//..............................Print res
	System.out.println(res1);//.............................Print res1
	System.out.println(res2);//.............................Print res2

	}
}