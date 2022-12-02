package arraysassignment;
import java.util.Arrays;
public class Twentyone {
    public static void main(String[] args) {
        int[] arr={4,7,9,3,3};
        Arrays.sort(arr);
        System.out.println("Elements of array sorted in ascending order: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
