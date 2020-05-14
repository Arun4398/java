JAVA PACKAGES:

	=> A Package is a group of class and interface which are related to one single module in the 
		given project.

	=>Package nameing convention

	=>package name always in lowercase.

	=>package names are always written in reverse domin (www.gmail.com --> .com - domin ,gmail - appname)

		->convention-1
			domin.appname.modulename
			com.gmail.inbox 

		->convention-2
			domin.companyname.appname.modulename
			com.google.gmail.inbox 

	=> To access propreties of a class present in a different package we have 2 ways

	1.Fullu Qulified Classname
         
         ->A class name which is written with its package name.

         syntex:

               packagename(domin.appname.modulename).classname.membername();[static]

               packagename(domin.appname.modulename).classname ref =new  packagename(domin.appname.modulename).classname();[non-static]


	2.import statement
         
         ->

	 	 syntex:

	       	  import packagename(domin.appname.modulename).classname;
