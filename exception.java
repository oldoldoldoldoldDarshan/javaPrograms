import java.util.*;
class exception 
{
	void m1() { m2();}
		void m2() { m3() ;}
		void m3() { System.out.println(10/5); }

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("please give the input");
		int g = s.nextInt();
		
		exception h = new exception();
		
      System.out.println("checkpoint1");	
         try
		{
				h.m1();
		}
		catch (Exception darshan )
		{ 
			System.out.println("Method exception");
		}

System.out.println("checkpoint2");


		try
		{
			System.out.println(10/g);
			System.out.println("It will execute only if we did not get exception");
		}
		
		catch (Exception darshan)
		{
			System.out.println("ArithmeticException catch block is printing"); 
			System.out.println(darshan);

System.out.println("******************Second try catch block*******************");
System.out.println("please enter the position of letter you want in 'darshan' ");
int b = s.nextInt();
  try
  {
	System.out.println("charecter position ="+"darshan".charAt(b));
  }
  catch (ArithmeticException abcd)
  {
	  System.out.println("Execting secont try catch block - catch block");
  }
		finally { System.out.println("printing finally block-2"); }
}



		
		finally {
		System.out.println("printing finally block");
		}
		

		



	}
}
