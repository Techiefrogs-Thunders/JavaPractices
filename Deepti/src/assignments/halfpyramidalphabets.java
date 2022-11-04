package assignments;
import java.util.Scanner;
 
public class halfpyramidalphabets {

  public static void main(String args[])
  {
    int rows, i, j;
    char ch;
    Scanner scan = new Scanner(System.in);
 
    System.out.print("Enter the number of rows: ");
    rows = scan.nextInt();
 
    System.out.print("Output:\n");
    for (i = 1; i <= rows; i++)
    {
      ch = 'A';
      for (j = 1; j <= i; j++)
      {
        System.out.print(" " + ch++);
      }
 
      System.out.print("\n");
    }
  }
}
    

