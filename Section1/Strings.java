class Strings
{
	public static void main(String[] args) 
	{
	String str="arunkumar";//------------------------> //declaration & initialization of string
	String str2="arunkumar";
	String str3="ARUNKUMAR";

	System.out.println("In Build Methods in String");

//----------------------------------------------------------
	System.out.println("1] var.Length(); -> it gives length of the given String");

	int length=str.length();
	System.out.println("String Length="+length);
//------------------------------------------------------------
	System.out.println("2] var.equals(str2 var); -> it compares the given 2 strings");

	boolean e=str.equals(str2);
	System.out.println("("+str+").equals("+str2+")="+e);

	boolean q=str.equals(str3);
	System.out.println("("+str+").equals("+str3+")="+q);
//-------------------------------------------------------------
	System.out.println("3] var.equalsIgnoreCase(str2 var); -> it compares the given 2 strings ignore the case(upper or lower)");

	e=str.equalsIgnoreCase(str3);
	System.out.println("("+str+").equals("+str3+")="+e);
//------------------------------------------------------------

	System.out.println("4] var.indexOf(Character) -> it gives the index position of the (Character)");

	char c='a';
	int index=str.indexOf(c);
	System.out.println("Index value of the char"+c+" is "+index);
//--------------------------------------------------------------
	System.out.println("5]str var.indexOf(Character,Starting index);-> it gives the index position of the (Character) and we give the where it start(stating position)");

	char d='a';
	int startidx=5;
	int index2=str.indexOf(d,startidx);
	System.out.println("Index value of the character "+"'"+d+"'"+" with Starting index "+startidx+" is "+index2);
//----------------------------------------------------------------
	System.out.println("6] var.chatAt(index) -> it gives the Character of the given index");

    int i=1;
	char f=str.charAt(i);
	System.out.println("Character at the index value :"+i+ " is "+f);
//----------------------------------------------------------------





     //----str.charAt(i);-----------gives the charater of string

	}
}
