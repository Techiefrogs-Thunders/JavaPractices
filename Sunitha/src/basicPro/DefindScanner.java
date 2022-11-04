import java.util.Scanner;
import java.io.File;
import java.util.*;

import org.xml.sax.SAXException;

public class DefindScanner {
    public static void main(String[] args) {
    Scanner d=new Scanner(System.in);
    Scanner gh=new Scanner("started scanner method");
   System.out.println("give int value");       int     i=d.nextInt();
    System.out.println("give boolen value");    boolean bo=d.nextBoolean();
   System.out.println("give String value"); 
   d.nextLine();
       String  st=d.nextLine(); 
    System.out.println("give byte value");    
      byte    b=d.nextByte(); 
    //System.out.println("give short value");  
       short   sh=d.nextShort(); 
    System.out.println("give Stringnext value");
    String  s=d.next();      
    System.out.println("give long value");     
     long    l=d.nextLong();
    System.out.println("give float value");    
     float   f=d.nextFloat();
    System.out.println("give double value");    double  e=d.nextDouble();
     //System.out.println("nextline");
     // String sd=d.next();
    System.out.println(" "+ st+""+ s);

    }
}
