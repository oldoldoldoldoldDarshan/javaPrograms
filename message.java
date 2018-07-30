
public interface message 
{
	void morning ();
	void evening ();
	void goodnight();

} 

public class implement implements message
{
	public void morning () { System.out.println(" morning");}
		public void evening () { System.out.println(" evening");}
			 void goodnight () { System.out.println(" goodnight");}

			Public static void main ( String [] args)
	{
               implement e = new implement();
			   e.goodnight ();
			}

}
  