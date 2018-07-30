/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practce;

/**
 *
 * @author Darshanvyadav
 */
public class innerclass  {
    
    private int r = 1;
    private int t = 2;

   // innerclass p = new  innerclass();
    void m1(){
        System.out.println("outer method");
       
        
    }
    class inner{

      innerclass q = new innerclass();
       int x = 10;
       int y = 20;
     // innerclass.inner t = f.new inner();
       void m2() {
           System.out.println("inner method");
           System.out.println(r);
           System.out.println(t);
       }    
    }
}


class cartoon {

public static void main (String [] args)
{
    innerclass g = new innerclass();
    g.m1();
    innerclass.inner f = g.new inner();
    f.m2(); 
    
    class check {

       void m1(){
           System.out.println("Inner class method inner class check");
       }
           
    }
}
    
}