package Assignments;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of t=");
        int t=sc.nextInt();
        if (t%2==0) {
            System.out.println("this is even= "+t );
            
        } else {
            System.out.println("This is odd"+t);
        }
    }
    
}
