package Assignment1;

import java.util.Scanner;

public class SwaptwoNumber {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 21;
        int swap;
        System.out.println("num1 Before swap = "+ num1);
        System.out.println("num2 Before Swap = "+ num2);
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("After swap num1 = "+ num1);
        System.out.println("After swap num2 = "+ num2);
        
        System.out.println();
        
        int a , b, x;
        Scanner abc = new Scanner(System.in);
        
        System.out.print("Enter First number: ");
        a = abc.nextInt();
        
        System.out.print("Enter Second number: ");
        b = abc.nextInt();

        x = a;
        a = b;
        b = x;
        
        System.out.println("First number: "+ a);
        System.out.println("Second number: "+b);


    }
    
}
