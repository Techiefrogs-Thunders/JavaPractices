package Assignments;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give rows count");
        int rows =sc.nextInt();
        System.out.println("give number");
        int number=sc.nextInt();
        for(int i = 1; i <= rows; i++) {
    
          for(int j = 1; j <= i; j++) {
            System.out.print(number + " ");
            ++number;
          }
    
          System.out.println();
        }
    }
}
