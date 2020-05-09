ABSTARCTION:

		Abstraction -> Hidding

	=>Hidding the implementation details of the class and exposing only the serivce or behavioues is called Abstraction.

	=>Abstraction is achived by creating 3 layers

Steps To Achive The Abstraction:

	1.object implementation layer.

		->Generalize all the subclass methods and decleraed them as abstract method in a common 
			Superclass or SuperInterface and create Object implementation layer.

	2.object creation layer.

		->create Object creation layer by createing a class that will create the object of implementation 
			and upcast it to Superclass or SuperInterface reference.

	3.object utilization layes.

		->within the object utilization layer utilize upcasted reference returned by object creation layer
		to call a Generalize methods.

Loose Coupling:

	=>By useing Abstraction we can achive Loose Coupling where changes done in the object implementation layer will
		not have any impact on object utilization layer. 


		eg:F:\JAVA\OOPS\Programs\13.Abstraction\CustmorMain.java