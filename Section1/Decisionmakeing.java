class Decisionmakeing
{
 public static void ifstmt() 
	{
	int a=1;
	System.out.println("IF");
	System.out.println("if condtion is true execute the 'IF body' otherwise skip the stmt");

	if(a<5) 			// IF STATEMENT

	{
		System.out.println("IF statement is true");
	}
   }
public static void ifelsestmt() 
{
		int a=6;
		System.out.println("IF ELSE");
		System.out.println("if condtion is true execute the 'IF body' otherwise execte 'ELSE body'");
	if(a<5) 			// IF_else STATEMENT
	{
		System.out.println("IF statement condtion true");
	}	
	else
	{
		System.out.println("else statement condtion false");
	}
}

public static void ifelseif()
{
    int a=6;
    System.out.println("IF ELSE IF");
    System.out.println("if condtion is true execute the 'IF body' otherwise check the condtion of 'IF ELSE if it is true execute 'IFELSE'otherwise 'ELSE'executed");
	if(a<5) 			// IF_ELSE_IF STATEMENT

	{

		System.out.println("if stmt");

	}	
	else if(a==6)  
	{
		System.out.println("else if stmt");
	}
	else
	{
		System.out.println("else stmt");
	}
}

public static void switcstmt()
{
	char choice='A';
	System.out.println("SWITCH");
	System.out.println("switch case is used for only equal condition");
	System.out.println("choice = "+choice);
	switch(choice)
	{
	case 'A':System.out.println("YOUR CHOICE IS A");
					break;
	case 'B':System.out.println("YOUR CHOICE IS B");
					break;		
	case 'C':System.out.println("YOUR CHOICE IS C");
					break;		
	}
}
public static void main(String[] args) 
{
	ifstmt();
	ifelsestmt();
	ifelseif();
	switcstmt();
}
}
