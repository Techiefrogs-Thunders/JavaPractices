package Assignment1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int x = 24;
        if (x%2==0) {
            System.out.println(x+" Number is Even");
        } else {
            System.out.println(x+" Number is Odd");
        }
        System.out.println();
        int num;
        System.out.println("Enter the number:");
        Scanner abc = new Scanner(System.in);
        num = abc.nextInt();
        if (num%2==0) {
            System.out.println("Number entered is Even");
        } else {
            System.out.println("Number enterd is Odd");    
        }

    }
    
}
