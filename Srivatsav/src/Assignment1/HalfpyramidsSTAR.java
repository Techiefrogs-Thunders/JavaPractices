package Assignment1;

import java.util.Scanner;

public class HalfpyramidsSTAR {
    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        System.out.println(" Enter number of rows:");
        int rows = st.nextInt();
        
    for (int i = 1; i <= rows; ++i) {
        for (int j = 1; j <= i; ++j) {
          System.out.print("* ");
        }
        System.out.println();
    }
}
}
