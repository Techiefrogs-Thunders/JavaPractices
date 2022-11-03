package Assignment1;

import java.util.Scanner;

public class FactorialFORWhile {
    public static void main(String[] args) {
        System.out.println("FOR Loop");
        int i,fact=1, number;  
        //int number=19;
        System.out.print("Enter the number: ");
        Scanner fo = new Scanner(System.in);
        number = fo.nextInt();
        
        for(i=1;i<=number;++i){    
            System.out.print(i);
            if (i!= number) {
                System.out.print("*");
            }
            fact=fact*i;


        }    
        System.out.println("Factorial of "+number+" is: "+fact);
        
        System.out.println("WHILE Loop");

        /*int i =1, factorial = 1, number;
        System.out.print("Enter the number: ");
        Scanner wh = new Scanner(System.in);
        number = wh.nextInt();

        while (i<=number) {
            fact = fact*i;
            i++;
            
        }
        System.out.println("Factorial of "+number+" is "+fact);*/

    }
    
}
