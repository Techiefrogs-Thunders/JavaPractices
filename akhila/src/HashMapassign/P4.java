package HashMapassign;
import java.util.*;
public class P4 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        
        for (int num : nums) {
            if (numsMap.containsKey(num))
                numsMap.put(num, numsMap.get(num) + 1);
            else
                numsMap.put(num, 1);
        }
        
        int result = nums[0];
        int majority = numsMap.get(nums[0]);
        
        for (int num : numsMap.keySet()) {
            if (numsMap.get(num) > majority) {
                majority = numsMap.get(num);
                result = num;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] nums={2,4,4,1};
        System.out.println(majorityElement(nums));
    }
}
