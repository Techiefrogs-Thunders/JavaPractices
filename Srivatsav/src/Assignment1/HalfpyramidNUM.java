package Assignment1;

import java.util.Scanner;

public class HalfpyramidNUM {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = no.nextInt();
        
    for (int i = 1; i <= rows; ++i) {
        for (int j = 1; j <= i; ++j) {
          System.out.print(j + " ");
        }
        System.out.println();
        }
    }
    
}
