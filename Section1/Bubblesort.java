class Bubblesort
{
	public static int[] Bubblesort(int a[])//--Called method
	{
		int len=a.length;//.....len=5
		for(int i=0;i<len-1;i++)//------.=> i=0--(0<4)-----------------------------------------------------------------------------------------------------------..=>i=2--(0<4).....................................(F)
		{
			for(int j=0;j<len-i-1;j++)//.=> j=0--(0<4)-(T)-------..=>j=1--(1<(4))-(T)----...=>j=2--(2<4)-(T)-------....=>j=3--(3<4)-(T)-----.....=>j=4--(4<4)-(F) .=>j=0--(0<3)(T)--------..=>j=1--(1<3)(T)
			{
//if(a[j]<a[j+1]) for desending order;
				if(a[j]>a[j+1])//-------.=> a[0]>a[1] {20>10}(T)--..=>a[1]>a[2] {20>30}(F)...=>a[2]>a[3] {30>50}(F)....=>a[3]>a[4] {50>40}(T)---------------------.=>a[0]>a[1]{10>20}(F)--..=>a[1]>a[2]{20>30}(F)
				{
					int temp =a[j];//----.temp=(20)a[0]-----------------------------(F)------------------(F)-------....=>temp=(50)a[3]--------------------------------------------------........................(F)
					a[j]=a[j+1];//-------.a[0]=(10)a[1}-----------------------------(F)------------------(F)-------....=>a[3]=(40)a[4]--------------------------------------------------.........................
					a[j+1]=temp;//-------.a[1]=(20)temp-----------------------------(F)------------------(F)-------....=>a[4]=(50)temp--------------------------------------------------
				}
			}//.{20,10,30,50,40}---------.{10,20,30,50,40}---------------------------------------------------------....=>{10,20,30,40,50}-----------------------------------------------..........................
		}//.....{ 0, 1, 2, 3, 4}--------..{ 0, 1, 2, 3, 4}---------------------------------------------------------....=>{ 0, 1, 2, 3, 4}-----------------------------------------------..........................
		return a;
	}
	public static void main(String[] args) // Main method
	{
		int a[]={20,10,30,50,40};// array 
		int res[]=Bubblesort(a);//..... Call method
		for(int i=0;i<res.length;i++)//......printing array
		{
			System.out.println(res[i]);
		}
	}
}