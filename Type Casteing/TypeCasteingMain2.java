class TypeCasteingMain2
{
	 public static void test(String str)
      {
      for(int i=0;i<str.length();i++)
      	{
		char c= str.charAt(i);
		int a=c;
		System.out.println(str.charAt(i)+"="+a);
	     } 
}
   public static void main(String[] args)
   {
   	  String str="ABC";

   	  test(str);
   }
  	
  }

