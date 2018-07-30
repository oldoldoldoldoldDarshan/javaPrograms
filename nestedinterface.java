 
	interface It2
	{
		void m1();
		void m2();
		void m3();
		void m4();
		void m5();
	}
	
	class adoptor implements It2
	{
		void m1() { }
		void m2() { }
		void m3() { }
		void m4() { }
		void m5() { }

	}
	interface It3 
	{
		int d = 10;
		String f = "Farheen";

	}
	

class test implements It2,It3
{
	public void m5() {System.out.println("darshan abcd");  }
	
	public static void main(String [] args )
	{
           new test().m1();
		   System.out.println(It3.d);
	}
}