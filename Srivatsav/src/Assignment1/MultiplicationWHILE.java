package Assignment1;

import java.util.Scanner;

public class MultiplicationWHILE {
    public static void main(String[] args) {
        int num ,i = 1;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (i<=10) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
    
}
