package Assignments;

import java.util.Scanner;

public class InvertFullPyramid {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int rows=sc.nextInt();
            System.out.println("enter row count");
        
            for(int i = rows; i >= 1; --i) {
              for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
              }
        
              for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
              }
        
              for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
              }
        
              System.out.println();
            }
          }
}
