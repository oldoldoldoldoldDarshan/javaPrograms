

class  test2
{
}

class  parent extends test2
{
void Darshan () {System.out.println ( " overriden parent method"); }

int  integer() { System.out.println(" parent original method "); return 3; }
	
}

public class child extends parent
{
	void  Darshan () { System.out.println ( " child overriding method ");  }

    String f () { System.out.println( " original child method "); return " Darshan"; } 
	
	
	public static void main(String[] args)  
	{
		parent p = new child();

		p.integer();
		 
	}
}

