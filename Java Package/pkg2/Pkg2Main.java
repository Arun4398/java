package com.jspiders.pkg2;

import com.jspiders.pkg1.Pkg1Main;

public class Pkg2Main {

	public static void main(String[] args) 
	{
		Pkg1Main.test();

		Pkg1Main s1 = new Pkg1Main();
		s1.display();

	     System.out.println("--------------------------");
		
		com.jspiders.pkg3.pkg1Main.test();

		com.jspiders.pkg3.pkg1Main s2 = new com.jspiders.pkg3.pkg1Main ();
		s2.display();
		
    
	}

}
