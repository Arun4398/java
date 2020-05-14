class Array
{  


   public static void main(String args[])
   {  
   		int c[];                   //declaration
   		c = new int[5];            // creation

    	c[0]=1;                    //initialization  
		c[1]=2;  
		c[2]=7;    
		c[3]=4;  
		c[4]=5;


   		int a[] = new int[5];      //declaration and creation

		a[0]=10;                   //initialization  
		a[1]=20;  
		a[2]=30;    
		a[3]=40;  
		a[4]=50; 


  		int b[] = {11,22,33,44,55};           //declaration, creation and initialization  


  	 	 int length= a.length;                //length is the property of array
  	 	 System.out.println("Array length="+length);
  	 	 int noofindex=(a.length-1);
  	 	 System.out.println("total index in array="+noofindex);
  	 	 int mid=(a.length-1)/2;
  	 	 System.out.println("Middle index in array="+mid);
		
		//printing array

	for(int i=0;i<a.length;i++)
	{								            
	System.out.print(" a["+i+"]= "+a[i]); 
	}  
    System.out.println();

	for(int i=0;i<b.length;i++)
	{								              
	System.out.print(" b["+i+"]= "+b[i]);  
	}  

	System.out.println();

	for(int i=0;i<c.length;i++)
	{								           
	System.out.print(" c["+i+"]= "+c[i]);  
	}
    
   }
}
