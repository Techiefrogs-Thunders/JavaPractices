package assignments;
import java.util.Scanner;
public class rightpascalstriangle {
    
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.print("Enter Right Pascals Triangle Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Right Pascals Triangle Star Pattern");
		int j, i = 0;
		
		while(i < rows ) 
		{
			j = 0 ;
			
			while( j <= i ) 
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
        i = rows - 1; 
		while (i >= 0) 
		{
			j = 0 ;
			while ( j <= i - 1 ) 
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
    

