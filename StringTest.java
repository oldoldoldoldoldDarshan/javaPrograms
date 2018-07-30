public class StringTest 
{
	public static void main(String[] args) 
	{
		String a = "new";
		String b = "Darshan";
		StringBuffer c = new StringBuffer("Yadav");
		StringBuffer d = new StringBuffer("Venaktesh");

		StringBuffer e = c.append("**********"); 
		String f = b.concat("###########");

		System.out.println(e + "      "+ f);
		System.out.println(c + "      "+ b);

		
	}
}

/*

Difference between String and string buffer, 

original object in adding data is not effected in String
but in StringBuffer original object is effected check bellow 
Example.

D:\Java>
D:\Java>java StringTest
Yadav**********      Darshan###########
Yadav**********      Darshan

D:\Java>

*/