package Exceptions;

import java.io.IOException;

class Custom3 {
    void msg() throws IOException {  
        System.out.println("Custom method");  
        }    
    }    
        
    public class Test extends Custom3{    
      
      // overriding the method in child class  
      // gives compile time error  
      void msg() throws IOException {    
        System.out.println("Test Method");    
      }  
      
      public static void main(String args[]) {    
       Custom3 p = new Test();    
       try {
        p.msg();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }    
      } 
    
}
