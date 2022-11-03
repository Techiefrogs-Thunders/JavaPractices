package Assignment1;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
      Scanner pr = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = pr.nextInt();
      boolean prime = false;
      for (int i = 2; i <= num / 2; ++i) {
      
        if (num % i == 0) {
          prime = true;
          break;
        }
      }

      if (!prime)
        System.out.println(num + " is a prime number.");
      else
        System.out.println(num + " is not a prime number.");
      }
}
