import javax.servlet.*;
import java.io.*;

public class LifeSrv implements Servlet 
{

  

	public static void main(String[] args) 
	{
		 public void init(ServletConfig config) throws ServletException()
		{
            System.out.println("Init method");
		}

 public ServletConfig getServletConfig()
		{
            System.out.println("servlet config");
		}

  public void service(ServletRequest req, ServletResponse res)
	throws ServletException, IOException()
		{
     System.out.println("service importent");
  }

public String getServletInfo()
		{
	System.out.println("servlet info");
		}

public void destroy(){
System.out.println("destroy method");
}

	}
}
