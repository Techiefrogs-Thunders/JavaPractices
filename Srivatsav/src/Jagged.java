import java.util.Scanner;

public class Jagged {
    public static void main(String[] args) {
        Scanner jd = new Scanner(System.in);
        System.out.println("Enter Number of rows:");
		int r = jd.nextInt();
		int arr[][] = new int[r][];

		for (int i = 0; i < arr.length; i++){
		 	arr[i] = new int[i + 1];
         }
		
		int count = 0;
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				arr[i][j] = count++;
            }
        }    
		
		System.out.println("Contents of 2D Jagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
            }    
            System.out.println();
		}
        //System.out.println();
	}
}