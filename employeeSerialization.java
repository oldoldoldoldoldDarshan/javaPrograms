/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Darshanvyadav
 */

@interface Smartphone {
    String Consultency() default "USA";
    String Name() default "Darshan";
    int EmployeName() default 111;
    
}


@Smartphone(Consultency = "Signature IT", Name = "Darshan",EmployeName = 111)
class Farheen {
    
    String w;
    int a ;
    public Farheen (String w, int a)
    {
        this.w = w ;
        this.a = a ;
    }
  
}

public class employeeSerialization {

   public static void main (String[]  args) throws FileNotFoundException, IOException
   {
       
       Farheen F = new Farheen ("Check", 123);
       
       Class v = F.getClass();
       
       Annotation an = v.getAnnotation(Smartphone.class);
       
       
       Employee e = new Employee(1, "Darshan Yadav Venkatesh");
       FileOutputStream fos = new FileOutputStream("abx.txt");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(e);
       System.out.println("Serialization completed");
       
   }
    
    
}

class Employee implements Serializable  {
    
   transient  int Eid;
   transient String Ename;
    public Employee(int Eid, String Ename)
    {
        this.Eid = Eid;
        this.Ename = Ename;
    }
    
}

