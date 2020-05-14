Introduction Of Java:
 
Work Flow Of Java:


          .java     --->    .class[by java Compiler]     --->     JVM(Byte code)

                            -check the syntax                    -Read a line of code
                            -Give complie time Error             -Understand & Execute the Code
                                                                 -Give Runtime Error (if any misbehave)

Keywords:

	=>Keywords are those reserved words which have a pre-defined meaning defined in a programming language.

	=>Keywords always written in lowercase.

	=>Keywords in java

		->

Identifiers:

	=>Identifiers are Names which are used to Identify class, methods and variables in a program.

 Rule of Identifiers:

    ->Identifiers can be alpha numaric. (Demo123)
    ->$ and _ are the only two specical characters which can be used with Identifiers. (Demo$, Demo_, _Demo)

    ->Identifiers cannot start with numbers. (1223)
    ->Single '_' is a invalid Identifier.
    ->Keywords cannot be used as Identifiers.

Data Types:

	   primitive type
	   non-primitive type
	   
	   Byte    -- 8  bits -- 1 byte --  0     default value
	   Short   -- 16 bits -- 2 byte --  0     default value
	   int     -- 32 bits -- 4 byte --  0     default value
	   long    -- 32 bits -- 4 byte --  0l    default value
	   float   -- 32 bits -- 4 byte --  0.0f  default value
	   double  -- 64 bits -- 8 byte --  0.0d  default value

	   char    -- 16 bits -- 4 byte --  space default value
	   boolean -- 8  bits -- 1 byte --  false default value

Variables:

	=>A variable is named memory location which is used to store the values of the program.(it stored in RAM)

	=> It should start with a lowercase letter such as id, name,...

	=>To use the a variables in a program we have to follow three steps.

	  ->Deceleration

	  	-->it is a statement which is written to specifiy what type of data should be stored in given variable.
	  	-->int x; ->Deceleration - specifiy what type of data can be stored in the variable.

	  ->Intialization

	  	-->storeing or Assigning the value to the variable is Initialization.
	  	-->x=20;  ->Intialization- Assigning the to a variable useing assignment.

	  ->Utilization

	  	-->it is one or group of statements which is written to use the values present in the variables to perform some operations.
	  	-->z=x+y; ->Utilization - one or group of statement to use the values present in the variable.

	 eg:F:\JAVA\BASICS\Variables.java

Operators:

	=>Operators perform Operations on the operands and give the result.

	=>Operators are classified into 3 types:

		->UnaryOperator
		->BinaryOperator
		->TernaryOperator

	=>ArithmaticOperators(+,-,*,/,%)

	   eg:F:\JAVA\BASICS\ArithmaticOperators.java

	=>IncrementOperator & DecrementOperator (++,--)

        IncrementOperator(++)

        =>Increment operator is used to Increase the value of a variable by unit 1.

           ->pre-Increment (ISO) <---->    ISO-increment & subtitute & operation.
 
           ->post-Increment(SOI) <---->    SOI-& subtitute & operation & increment.

        =>pre and post Increment operators are Independent of any mathamatical expression than operator will give same result.

         eg:F:\JAVA\BASICS\IncrementOperator.java

        DecrementOperator(--)

		=>Decrement operator is used to decrease the value of a variable by unit 1.

	      ->pre-decrement[--x] (DSO) <----> DSO-decrement & subtitute & operation.

	      ->post-decrement[x--](SOD) <----> SOD-& subtitute & operation & decrement.

	    =>pre and post Decrement operators are Independent of any mathamatical expression than operator will give same result.

	    eg:F:\JAVA\BASICS\DecrementOperator.java

	=>ComparisionOperator OR RelationalOperator (<,>,==,!=,<=,>=)

		->Comparation operator compare the given two values and produce the boolen result.

	  eg:F:\JAVA\BASICS\ComparisionOperator.java

	=>LogicalOperator(&&,||,^)

	  ->It is used to combain multiple boolean condition to one single condition.
		
		AND &&
		C1  C2  RES
		T   T    T
		T   F    F
		F   T    F
		F   F    F

		OR  ||
		C1  C2  RES
		T   T    T
		T   F    T
		F   T    T
		F   F    F

		XOR ^
		C1  C2  RES
		T   T    T
		T   F    F
		F   T    F
		F   F    T

		eg:F:\JAVA\BASICS\LogicalOperator.java

	=>BitwiseOperator(&,|,^)

		->it perfrom bitwise operation on a every bit in the given data and produce result.

		->it's convert the int to boolean and perfrom the operation and give the result as int'
		 
		 FOR LOGIC TABLE REFER logical 

		 a & b -- 20 & 10   covert into binary 

		 20---->10100
		 10---->01010
		----------------
		  0<----00000     convert into int

		a | b -- 20 | 10   covert into binary 

		 20---->10100
		 10---->01010
		----------------
		 30<----11110    convert into int 

		 a ^ b -- 20 ^ 10   covert into binary 

		 20---- 10100
		 10---- 01010
		----------------
		 30-----11110    convert into int

		eg:F:\JAVA\BASICS\BitwiseOperator.java

Methods:

	=> Methods are named block of codes which perform specific task.

	 Syntxt

        accessspecifer   accessmodifier  returntype   Methodname  (argument list)     --> Method Declaration
		{
	     stmt...;
	     stmt...;                                                                     --> Method Definition

	    return ;
		}   

	 Syntxt for calling the method

		->methodname();
	                                                                                      --> Method Calling
		->returntype  variable name  = method name ();


	=> Methods are used to eleminate the duplicate line's of code's in the program.

	=> Method Name should start with lowercase letter.

	=> If the name contains multiple words, start it with a lowercase letter followed by 
	   an uppercase letter such as actionPerformed().

	=>A method which is calling another method is knowns as calling method.

	=>A method which is called by another method is knowns as called method.

	=>return[Keyword]

	 ->return statement transfers control and value from the called method to calling method.

	=>return type specifiy what type of data will be return from by given method.

	=>if the called method returns a value than it should be stored in variable matching the return type of called method. 

	=>If the method without return any value than the return type of the method should be declared as "void".

	=>for void return type the return stmt is not necessary to write. The complier write automatically (only for "void")	

	=>The value which are passed at the time of method calling are known as Actual argument or Actual perameters.

	=>The value which are recived by called method are called as Formal argument or Formal perameters.

      eg:F:\JAVA\BASICS\Method.java

Flow Control Statements:

	=>JVM executes the program in a natural order where all the statements in the program line by line without skipping
		any statements.

	=>if the programmer wants to manipulate this  nartural execution order of the JVM programmer can use Flow Control Statements.

 Define Flow Control Statement?

  	=>These statements are used to block of code based on the programmer requirment.

  	=>Flow Control Statements are based on 2 types.

  		->Based on No of time they get executed.(Looping Statements)

  		->Based on the boolean condition.(Decision Making Statements)


 Decision Making Statements:

	=>This statements are used to execute a block of code's based on the programmer requirment.' 

	=>This statement allow you to make a decision based upon thr result of a  boolean condtion.
    
    =>Any operation that are performed useing RelationalOperator or LogicalOperator and gives true or false 
      known as boolean condition.

		->IF STMT
		->IF ELSE STMT
		->IF ELSE IF STMT
		->SWITCH STMT


	=>IF:

		->if condtion is true execute the 'IF body' otherwise skip the statements.

			if(condition)
			{

			}

	=> IF-ELSE:

		->It is a type of decision makeing statement where this statements present in if body will be executed an only 
		  if the result of boolean condition is true otherwise else body will be executed.

		  	if(condition)
		  	{

		  	}
		  	else 
		  	{
		  		
		  	}

	=> IF-ELSE-IF:

		->It is a type of decision makeing statement to the given value compare with multiple conditions.if body will 
		  be executed an only if the result of boolean condition is true .elseif body only if the result of boolean condition 
		  is true.otherwize else is executed.

		  	if(condition)
	  		{

	  		}
	  		elseif(condition)
	  		{

	  		}
	  		else
	  		{

	  		}

	=> SWITCH CASE:

		->It is a type of decision makeing statement which is used only when the given choice should be compard only with equal's  '
		  condition.

		   switch(optn)
		   {
		   	case choice1 : stmt;
		   	               break;
		   	case choice2 : stmt;
		   	               break;
		   	.
		   	.
		   	.
		   	default: stmt;
		   }

	    eg:F:\JAVA\BASICS\Decisionmakeing.java

 Looping Statements:

 	=>This statements are used to execute a block of code repeatedly based on the programmer requirment.

 	=>looping statements helps to reduse duplicate line of code and to reduse the size of the program.

 	=>looping statements required to be tracked so that they donot end up in infinite looping state.

 	=>Hence we track the iteration with the help of iteration variable.

    =>What is iteration?

 		->An iteration is a process in which JVM execute the block of code complitely once.

 	=>Tracking can be done with 3 steps

 	    ->Declaration & Initialization of iteration variable
 	    ->boolean condition to specifiy when the loop is stoped.
 	    ->Re-Initialization statements to change the value of the iteration variable.

 	 	->for loop
 	 	->while loop
 	 	->do-while loop

 	=>for loop:
 	  	
 	  	->  for(Dec&Ini;Condi;Re-Ini)
			{
              stmt..;
			}

		eg:F:\JAVA\BASICS\Forloop.java

    =>while loop

    	->It is a control flow statement that allow code to be executed repetedly based on a 
    	  given boolean condtion.(Only if the condtion is true).

        ->  while(condition)
			{
				stmt..;
			}

		eg:F:\JAVA\BASICS\Whileloop.java

	=>do-while loop

		->It is a control flow statement that allow code to be executed repetedly based on a 
		given boolean condtion.

		->In do while loop first execute the stmt at one time after it check the condition is true or false

		->  do
			{
				stmt,,;
			}
		    while(condition);

		eg:F:\JAVA\BASICS\DoWhileloop.java

Array:

	=>Array is homogenious(same) group of data which has fixed Size(Size of the array) and 
	  Index(pointing the perticular value in the array). 

 Array Declarationc:

 		Syntax:

 			1.datatype[] arrayvar;
 			2.datatype arrayvar[];

        eg:
             int a[];
             int[] a;

 Array Creation:

		Syntax:

		     arrayvar=new datatype[size];

		 eg:
		     a=new int[5];

 Array Initialization:

		Syntax:

			arrayvar[index]=value;

		 eg: 
		 	a[0]=1,a[1]=1,......

  Array Declaration and Creation:

 		syntax:

 	         datatype arrayvar[]=datatype[size];

 	     eg: 

 	         int a[]=int[5];

  Array Declaration,Creation & Initialization  (dynamically)

		Syntax:

			datatype arrayvar[]={v1,v2,v3,..}

		eg: 

			int a[]={1,2,3,...}

		The elements in the array allocated by new will automatically 
		be initialized to 
		1.0 (for numeric types), 
		2.false (for boolean),
		3.null (for reference types)


	eg:
	 	1.F:\JAVA\BASICS\Array.java
	 	2.F:\JAVA\BASICS\Search.java
	 	3.F:\JAVA\BASICS\Binarysearch.java
	 	4.F:\JAVA\BASICS\Bubblesort.java
	 	5.F:\JAVA\BASICS\Selectionsort.java
	 	6.F:\JAVA\BASICS\Insertionsort.java

String:

	=>Strings is the group characters present in the " ".

 In-Build Methods In String

	1.var.Length();

		-> it gives length of the given String

	2.var.equals(var2);

		-> it compares the given 2 strings

	3.var.equalsIgnoreCase(var2);

		-> it compares the given 2 strings ignore the case(upper or lower)
	
	4.var.indexOf(Character);

		-> it gives the index position of the (Character)

	5.var.indexOf(Character,Starting index);

		it gives the index position of the (Character) and we give the where it start(stating position)

	6.var.chatAt(index);

		-> it gives the Character of the given index


	  eg:F:\JAVA\BASICS\Strings.java

Scannerclass:

	=>Scannerclass is the In-Build class of java for getting the input.

	=>Create a object for the Scannerclass and pass the argument (System.in)

		->Scanner in = new Scanner(System.in);

	=>Scannerclass haveing a In-Build methods

		->nextBoolean();	Reads a boolean value from the user.

		->nextByte();		Reads a byte value from the user.

		->nextDouble();		Reads a double value from the user.

		->nextFloat();		Reads a float value from the user.

		->nextInt();		Reads a int value from the user.

		->nextLine();		Reads a String value from the user.

		->nextLong();		Reads a long value from the user.
		
		->nextShort();		Reads a short value from the user.
 
    =>To Read the Integer Array:

    	->	System.out.println("enter ur array size");

	        int size=in.nextInt();

	        int array[]= new int[size];    // Array Declaration and Creation:

	        System.out.println();

	        for(int i=0;i<array.length;i++)
	        {
	            System.out.println("enter the array "+i);
	 
	            array[i]=in.nextInt();
	        }

    eg:F:\JAVA\BASICS\Scannercls.java