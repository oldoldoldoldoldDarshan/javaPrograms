 
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
		public void m1() { }
		public void m2() { }
		public void m3() { }
		public void m4() { }
		public void m5() { }

	}
	interface It3 
	{
		int d = 10;
		String f = "Farheen";

	}
	

class test extends adoptor implements It2,It3,Cloneable 
{
	int y = 10;
	int v = 8;

	public void m5() {System.out.println("darshan abcd");  }
	
	 final static public void main(String  DArshan[] ) throws   CloneNotSupportedException
	{
         test t =   new test();
		 t.m5();
		   System.out.println(It3.d);
		   t.y = 20;
		   t.v=16;
		  test u  = (test)t.clone();


		   System.out.println(t.y +" testing "+ t.v);

		   t.y = 30;
		   t.v = 24;

		    System.out.println(t.y +" " + t.v);

			System.out.println("printing old values ");
			System.out.println(u.y + "testing  " + u.v); 




	}
}