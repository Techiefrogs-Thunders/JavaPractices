package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Left rotate elements of an Array
public class Program3 {
    public static void main(String[] args) {
        System.out.println("Enter Array Length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();
        long[] numbers = new long[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a long value: ");
            numbers[i] = sc.nextLong();
            sc.nextLine();
        }
        sc.close();
        long[] rotates = rotation(numbers, 5);
        System.out.println("Values Before Rotation: " + Arrays.toString(numbers));
        //rotating 5 elements of array from left
        System.out.println("After rotation: " + Arrays.toString(rotates));

    }

    static long[] rotation(long[] array, int n) {
        //result to store left rotated elements of array
        long[] result = new long[array.length];
        //looping through array
        for (int i = 0; i < array.length; i++) {
            //assuming n=5
            //0<5,1<5,...=true,5<5=false
            if (i < n) {
                //assuming length=10
                // result[10+0-5]=array[0]-->result[5] has value of array[0]....
                result[array.length + i - n] = array[i];
            } else {
                //after 5<5 this block executes
                result[i - n] = array[i];
            }
        }
        return result;
    }
}
