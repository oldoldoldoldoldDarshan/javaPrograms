

class throwstest 
{

	void m1() throws InterruptedException
		{ 
		m2();
		}
	
	void m2() throws InterruptedException
		{
		m3();
		}
   	void m3() throws InterruptedException
		{
		
		Thread.sleep(3000);
		System.out.println("Hi");
		}

	public static void main(String[] args) throws InterruptedException
	{
	System.out.println("Hello World!");
    throwstest v = new throwstest();
    v.m1();
	}
}
