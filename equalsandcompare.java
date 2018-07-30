class equalsandcompare 
{
	public static void main(String[] args) 
	{
		String a = "DARSHAN";
		String b = "darshan";

		String c = "aa";
		String d = "zzzzzzzzzzzzzzzzzzlsdiblkjJBKLJVDSKJ C.dsmnv.kj.vbjkvjbx .NZBCdkjsB";
		String [] darshan = new String  [100];

		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b) + "*********");
		System.out.println(a.equals(c));
	    System.out.println(a.equals(d));

System.out.println(a.compareTo(b));        	
		System.out.println(a.compareToIgnoreCase(b)+ "*********");
		System.out.println(a.compareTo(c));
	    System.out.println(a.compareTo(d) );

		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equals(c));
	    System.out.println(a.equals(d));


		 System.out.println("**********************************************************");

// example to check the defference between length variable and length() method


		 System.out.println(darshan.length);
		  System.out.println( d.length());



	}
}

/*

D:\Java>java equalsandcompare
false
true*********
false
false
-32
0*********
-29
-54
true
false
false
*/