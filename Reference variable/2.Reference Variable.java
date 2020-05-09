REFERENCE VARIABLE:

        =>It is the type of varible which is Used to Store the Address of the Object.

		=>If two different Reference variable are pointing to a Different Objects
		than changes done by reference variable.one Willnot Impact another Object.

		=>If two different Reference variable are pointing to a Same Objects
		than changes done by reference variable one Will Impact another Object.

		=>Default value of the Reference variable is NULL.

        =>Primitive values cannot be stored in reference variable.     eg: Address {Reference@63961c42}.....{classname@address}

		=>Address of the Object cannot store in Primitive datatypes. eg: int,char,String,byte,.....(this are Primitive data types.)

    Syntex:  
    		1.Initilaization & Creation of reference variable:
    				Syntex:
                          Classname referencevariable= new classname();    new => Keyword
     		            eg:
    		              Account a=new Account();

    		2. use the reference variable:
    		        Syntex:
    		              referencevariable.methodname();      
			            eg:
			               a.showdetails();              method Showdetails is inside the Class (Account);



			             eg:
