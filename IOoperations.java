package practce;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darshanvyadav
 */
public class IOoperations {
    
    public static void main(String[] args) throws IOException,FileNotFoundException {
        
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
         BufferedWriter bw = new BufferedWriter(new FileWriter("fuck.txt"));
         
        
         
         String dar;
         
         while((dar = br.readLine())!= null)
         {
             System.out.println(dar);
            bw.write(dar);
         }
         
         bw.close();
         br.close();
        
    }  
}
