package assignments;
import java.util.Scanner;
public class halfpyramidnumbers {
    
  public static void main(String[] args)
  {
    int rows;
 
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter the no. of rows: ");
    rows = sc.nextInt();
 
    for (int i = 1; i <= rows; ++i)
    {
      for (int j = 1; j <= i; ++j)
      {
        System.out.print(j + " ");
      }
 
      System.out.println();
    }
  }
}
    

