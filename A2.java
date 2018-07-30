package darshan;
import java.util.*;

class A2
{

	int a = 10;

	double parthu () 
	{
		System.out.println("Darshan testing demo");

	}

	static void status(int g )

	{
              if (g>20)
              {
				  System.out.println("elegable for marrage");
              }
			  else 
		      {
				  new ArithmeticException ("Darshan Yadav is awesome"); 
			  }
	}
	
	
	public static void main (String [] args)
	{
           Scanner sc = new Scanner (System.in);
           System.out.println("please inter your age ");		
		   int age = sc.nextInt();
		  
		  A2.status(age);
	}
}
