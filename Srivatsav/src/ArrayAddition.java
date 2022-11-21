import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rowSize = scan.nextInt();
        int a[][] = new int[rowSize][];
        int b[][] = new int[rowSize][];
        int result[][] = new int[rowSize][];

        for (int i = 0; i < rowSize; i++) {
            System.out.println("Enter column Size");
            int columnSize = scan.nextInt();
            a[i] = new int[columnSize];
            b[i] = new int[columnSize];
            result[i] = new int[columnSize];
        }

        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < a[row].length; column++) {
                System.out.println("Enter Array Values of a");
                a[row][column] = scan.nextInt();
            }
        }

        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < b[row].length; column++) {
                System.out.println("Enter Array Values of b");
                b[row][column] = scan.nextInt();
            }
        }
        
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < a[row].length; column++) {
                result[row][column] = a[row][column]+b[row][column];
            }
        }
        // for (int row = 0; row < rowSize; row++) {
        //     for (int column = 0; column < a[row].length; column++) {
        //         System.out.println(result[row][column]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println(Arrays.deepToString(result));

    }
    
}
