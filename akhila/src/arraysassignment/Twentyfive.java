package arraysassignment;
import java.util.Arrays;
public class Twentyfive {
    public static void main(String[] args) {
        int arr1[]={4,8,9,5};
        int arr2[]={5,8,4,9};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean a1=Arrays.equals(arr1,arr2);
        System.out.println(a1);
    }
}
