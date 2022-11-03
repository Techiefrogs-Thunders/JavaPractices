package assignments;
import java.util.Scanner;
public class sandglass {
    
private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Please Enter Sandglass Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Sandglass Star Pattern");
		int i = 0, j, k;
		
		do
		{
			j = 0 ;
			do
			{
				System.out.print(" ");

			} while(j++ < i );
			
			k = i;
			do
            {
				System.out.print("* ");

			} while( ++k <= rows - 1);
			
			System.out.println();

		} while (++i <= rows - 1);
		
		i = rows - 1;
		do
		{
			j = 0 ;
			do 
			{
				System.out.print(" ");

			} while ( j++ < i);
			
			k = i;
			do
			{
				System.out.print("* ");

			} while(++k <= rows - 1);
			
			System.out.println();

		} while ( --i >= 0 );
	}
}
    

