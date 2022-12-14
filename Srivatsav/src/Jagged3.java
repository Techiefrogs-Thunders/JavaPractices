import java.util.Scanner;

public class Jagged3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows:");
        int rowSiz = sc.nextInt(); 
        int columnSiz1=0;
        int columnSiz2=0;    

        int a[][] = new int[rowSiz][];
       
        
        for (int i = 0; i < rowSiz; i++) {
            System.out.println("Enter Column Size:");
            columnSiz1 = sc.nextInt();
            a[i] = new int[columnSiz1];
        }
        System.out.println("Enter A Array Values");
        for (int row = 0; row < rowSiz; row++) {
            for (int column = 0; column < a[row].length; column++) {
                
                a[row][column] = sc.nextInt();
            }
        } 
        
        int b[][] = new int[rowSiz][];
        
        for (int i = 0; i < rowSiz; i++) {
            System.out.println("Enter Column Size:");
            columnSiz2 = sc.nextInt();
            b[i] = new int[columnSiz2];
        }
        System.out.println("Enter B Array Values");
        for (int row = 0; row < rowSiz; row++) {
            for (int column = 0; column < b[row].length; column++) {
                
                b[row][column] = sc.nextInt();
            }
        } 
        System.out.println("ARRAY A");
        for ( int row = 0; row < rowSiz; row++) {
            for (int column = 0; column < a[row].length; column++) {
                System.out.print(a[row][column]+" ");
            }
        }

        System.out.println("ARRAY B");
            for ( int row = 0; row < rowSiz; row++) {
                for (int column = 0; column < b[row].length; column++) {
                    System.out.print(b[row][column]+" ");
                }
                System.out.println();
            }
            int res[][] = new int[rowSiz][];
            int columnSiz = 0;
            for (int i = 0; i < rowSiz; i++) {
                if(columnSiz1>columnSiz2){
                    columnSiz = columnSiz1;
                }
                res[i] = new int[columnSiz];
            }
          
        System.out.println("Adding Jageed Arrays not Possible");
        for (int row = 0; row < rowSiz; row++) {
            for (int column = 0; column < a[row].length; column++) {
                res[row][column]+= a[row][column]*b[row][column];
            }
        }
    }
}