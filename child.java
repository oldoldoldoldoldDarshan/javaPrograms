

class  test2
{
}

abstract class  parent extends test2
{
	
 abstract void Darshan ();

  abstract void integer() ;

  parent () { System.out.println (" abstractor parent class  constructor "); }

  static { System.out.println ( " checking static block execution in abstract class");   }

  { System.out.println ( " checking instance  block execution in abstract class");   }
	
}

abstract class child extends parent
{
	child () { System.out.println (" abstractor child class  constructor "); }

	void  Darshan () { System.out.println ( " child overriding method ");  }

    String f () { System.out.println( " original child method "); return " Darshan"; } 
	public static void main(String[] args)  
	{
		System.out.println("checking can i create main method in abstract class ");
	}
	
static { System.out.println ( " checking static block execution in abstract class child ");   }

       { System.out.println ( " checking instance  block execution in abstract class");   }
	
}

class child2 extends child 
{
	child2 () { System.out.println (" abstractor child2 class  constructor "); }
	void integer()  { System.out.println(" parent original method ");  } 
   
	public static void main(String[] args)  
	{
		child p = new child2();
        
		p.Darshan();
		p. integer();	
		 
	}
}