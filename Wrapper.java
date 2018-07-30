class Wrapper 
{
	public static void main(String[] args) 
	{
		Integer i = new Integer (10);
		Integer r = new Integer ("123456");
	//	Integer t = new Integer ("darshan");
		Float f = new Float(10.10);
		Float f1 = new Float ("10.10");
		Float f2 = new Float (10.10f); 
		System.out.println(i + " **** "+ r  + " **** ");
		System.out.println("Flaot " + f + " " + f1 + " " + f2);

		Integer q = Integer.valueOf(9);
		Integer q1 = Integer.valueOf("010");
        
		System.out.println(q+ " "+ q1);

		int e = q.intValue();
		byte b =q.byteValue();
		double d = q.doubleValue();
		System.out.println(e + " " + b + " " + d);

		String h = "100";
		String z = "200";
     int a = Integer.parseInt(h);
	 double l = Double.parseDouble(z);
	 System.out.println(a+" " + l);
	}
}
