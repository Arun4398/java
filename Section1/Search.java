class Search
{
	public static boolean test(int a[],int ele)//........Execute Called Method
	{
		for(int i=1;i<a1.length;i++)//---->i=1............=> i=2.............=> i=3
		{
			if(a[i]==ele)//-------------->a[1]=20 ==50 (F)=> a[2]=10 ==50 (F)=> a[3]=50 == 50(T)
			{
				return true;//...............................................=> return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args)//.......Execute main method
	{
	int a1[]={20,10,50,30,40}; //............declaration, creation and initialization  
	boolean res=test(a1,50);  // ............Calling the method named as test
	System.out.println(res);//...............printing the result
	}
}