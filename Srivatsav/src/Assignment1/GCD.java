package Assignment1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("FOR loop");
        int a, b;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First number: ");
        a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        b = sc.nextInt();
        int gcd = 0;
        for (int i = 1; i <=a && i <=b; i++) {
            if (a % i == 0 && b % i == 0) 
            gcd = i;    
            
            
        }
        System.out.println("GCD of Two numbers: "+gcd);
       
        System.out.println("WHILE loop");
        
        int x, y;
        Scanner hc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        x = hc.nextInt();
        System.out.print("Enter the Second number:");
        y = hc.nextInt();
        int hcf = 0;
        int Temp;
        while (y !=0) {
            Temp = y;
            y = x % y;
            x = Temp;
        }
        hcf = x;
        System.out.println("hcf of Two numbers: "+hcf); 
    }
    
}
