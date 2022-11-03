package Assignment1;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        a = sc.nextInt();
        System.out.print("Enter Second number: ");
        b = sc.nextInt();
        int gcd=0;
        for(int i = 1; i <=a && i <=b; i++) {
            if (a % i == 0 && b % i == 0) 
            gcd = i;
        }
        int lcm=(a*b)/gcd;
        System.out.println("LCM of Two numbers: "+lcm);

        System.out.println("WHILE loop");
        int x, y;
        Scanner lc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        x = lc.nextInt();
        System.out.print("Enter second number: ");
        y = lc.nextInt();
        int Lcm =(x < y)? x:y;
        while (true) {
            if (Lcm % x == 0 && Lcm % y == 0) {
                System.out.printf("The LCM of %d and %d is %d.", x, y, Lcm);
                break;
            }
            ++Lcm;
    }
    
}
}
