package HashMapassign;
import java.util.*;
public class P6 {
    public static boolean containsDuplicates(int[] nums) {
        Set<Integer> checker = new HashSet<>();
        for (int num : nums) {
            if (checker.contains(num)) {
                return true;
            }
            checker.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicates(nums));
    }
}
