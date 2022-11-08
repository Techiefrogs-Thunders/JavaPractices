import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter index Size: ");
        int size = input.nextInt();
        int[] grades = new int[size];
        //int[][] grade =new int[size][size];
        System.out.println("Enter Arrays");
        for ( int i = 0; i < grades.length; i++) {
          
            grades[i] = input.nextInt();             
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]+" ");            
          }
       

        //System.out.println(Arrays.toString(grades));
        //System.out.println(Arrays.deepToString(grade));
      
    }
    
}
