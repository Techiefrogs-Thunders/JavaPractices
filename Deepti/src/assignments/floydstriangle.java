package assignments;
import java.util.Scanner;
public class floydstriangle {
    
    
       public static void main(String[] args)
       {
          int num=1;
          Scanner s = new Scanner(System.in);
          
          System.out.print("Enter the Row Size: ");
          int row = s.nextInt();
          
          for(int i=0; i<row; i++)
          {
             for(int j=0; j<=i; j++)
             {
                System.out.print(num+ " ");
                num++;
             }
             
             System.out.print("\n");
          }
       }
    }
