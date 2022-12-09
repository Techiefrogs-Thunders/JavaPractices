package Arrays;

import java.util.Arrays;

//To copy all elements of one array into another
public class Program1 {
    public static void main(String[] args) {
        int a1[] = new int [] {1, 2, 3, 4, 5};     
        int a2[] = new int[a1.length];    
            
        for (int i = 0; i < a1.length; i++) {     
            a2[i] = a1[i];     
        }      
            
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < a1.length; i++) {     
            System.out.print(a1[i] + " ");    
        }     
           
        System.out.println();    
           
             
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < a2.length; i++) {     
            System.out.print(a2[i] + " ");    
        }     
    }  
}   