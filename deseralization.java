/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 *
 * @author Darshanvyadav
 */
public class deseralization 
{
    // to read 
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
    
    FileInputStream fis = new FileInputStream("abx.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Employee y = (Employee)ois.readObject();
        System.out.println("Eid =   " + y.Eid + " "+ "Ename: " + y.Ename);
    }
}
