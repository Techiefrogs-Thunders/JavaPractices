import java.util.Scanner;

public class Jagged3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows:");
        int rowSiz = sc.nextInt();

        int a[][] = new int[rowSiz][];
        //a = new int[2][2];
        //a ={{1,2},{3,4}};
        //int b[][] = {{1,2},{3,4,5}};
        for (int i = 0; i < rowSiz; i++) {
            System.out.println("Enter Column Size:");
            int columnSiz = sc.nextInt();
            a[i] = new int[columnSiz];
        }

        for (int row = 0; row < rowSiz; row++) {
            for (int column = 0; column < a[row].length; column++) {
                System.out.println("Enter Array Values");
                a[row][column] = sc.nextInt();
            }
        }    

            for ( int row = 0; row < rowSiz; row++) {
                for (int column = 0; column < a[row].length; column++) {
                    System.out.print(a[row][column]+" ");
                }
                System.out.println();
            }
            
        }
    }
    

