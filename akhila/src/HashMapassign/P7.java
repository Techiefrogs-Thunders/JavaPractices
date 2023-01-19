package HashMapassign;
import java.util.*;
public class P7 {
    public static boolean checkDuplicatesWithKDistance(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
 
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int prevIndex = map.get(arr[i]);
 
                if (i - prevIndex <= k) {
                    return true;
                }
            }
 
            map.put(arr[i], i);
        }
 
        return false;
    }
public static void main(String[] args) {
    int[] nums={1,2,3,2,3};
    int k=2;
    System.out.println(checkDuplicatesWithKDistance(nums, k));
}
}
