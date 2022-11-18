import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Row Size:");
        int rowSize = in.nextInt();
        System.out.println("Enter Coloumn Size:");
        int colSize = in.nextInt();
        int[][] twoD = new int[rowSize][colSize];

        System.out.println("Enter Array Values: ");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                //3System.out.println("Enter Array Value: ");
                twoD[i][j] = in.nextInt();
            }
        }
        // for (int i = 0; i < twoD.length; i++) {
        //     for (int j = 0; j < twoD[0].length; j++) {
        //         System.out.print(twoD[i][j]+" ");
        //     }
        // }
        //System.out.println();
        //System.out.println(Arrays.toString(twoD));
        System.out.println(Arrays.deepToString(twoD));
    }
}
