package Assignment1;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number, remainder, result = 0, n = 0;
        Scanner ar = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = ar.nextInt();

        number = num;

        for (;number != 0; number /= 10, ++n);

        number = num;

        for (;number != 0; number /= 10){
            remainder = number % 10;
            result += Math.pow(remainder, n);
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
        
    }
    
}
