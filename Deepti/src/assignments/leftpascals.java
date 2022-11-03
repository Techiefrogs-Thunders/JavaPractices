package assignments;
import java.util.Scanner;
public class leftpascals {
    
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter Left Pascals Number Triangle Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Left Pascals Triangle Number Pattern");
		int i = 1, j, k;
		
		do
		{
			
			j = i ;
			do 
			{
				System.out.print("  ");

			} while ( j++ < rows );
			
			k = 1;
			do
            {
				System.out.print(k + " ");

			} while( ++k <= i);
			
			System.out.println();

		} while (++i <= rows );
		
		i = rows; 
		do
		{
			
			j = i - 1;
			do
			{
				System.out.print("  ");

			} while (++j <= rows);
			
			k = 1;
			do
			{
				System.out.print(k + " ");

			} while( ++k < i);
            System.out.println();

		} while (--i > 1) ;
	}
}
    

