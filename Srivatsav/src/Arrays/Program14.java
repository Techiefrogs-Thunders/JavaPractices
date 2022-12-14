package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Sort the elements in ascending order
public class Program14 {
    public static void main(String[] args) {
        System.out.println("Enter the length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        sc.close();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("All Elements: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sort: " + Arrays.toString(numbers));

    }
}
