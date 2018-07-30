

class Child 
{
	void m3 (int ... a ) 
{
		System.out.println( " ***************************** ");
          for (int darshan : a)
		{
			System.out.println(darshan);
		}
}

void m3 (boolean ... a ) 
{
		System.out.println( " ***************************** ");
          for (boolean darshan : a)
		{
			System.out.println(darshan);
		}
}

void m3 (char ... a ) 
{
		System.out.println( " ***************************** ");
          for (char darshan : a)
		{
			System.out.println(darshan);
		}
}
	
void m3(int a) {System.out.println( "Normal method " + a);}

	public static void main(String[] args) 
	{ 
	Child child  = new Child();
	child.m3(10,20,30);
	child.m3('a','b','c');
	child.m3(true,false,true);
child.m3();
	
		
		
	}
	
}