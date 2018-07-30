 interface message 
{
	void morning ();
	
} 

interface message1 extends message
{
	void evening ();
	

}
interface message2 extends message 
{
	void goodnight();
}

public class implement implements message2
{
	//public void morning () { System.out.println(" morning");}
		//public void evening () { System.out.println(" evening");}
			public void goodnight () { System.out.println(" goodnight");}

			public static void main ( String [] args)
	{
               implement e = new implement();
			   e.goodnight ();
			   
			}

}
  