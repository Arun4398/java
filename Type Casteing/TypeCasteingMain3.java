// write a function to convert the string Uppercase to lowercase and return the value?
class TypeCasteingMain3
{
	public static String test(String str)
	{
			String s2="";
		for(int i=0;i<str.length();i++)
		{
	        char c1= str.charAt(i);
			int a1=c1;
			
			if(a1 >= 65 && a1 <=90)
			{
			 a1= a1+32;
			 c1=(char)a1;
		    }
			s2=s2+c1;
		 }
	        return s2;
	}
	public static void main(String[] args) {
		

		String str="ABC";
		String str2="HELLO";

		String s=test(str);
		String s1= test(str2);

		System.out.println(s);
		System.out.println(s1);

	}
}