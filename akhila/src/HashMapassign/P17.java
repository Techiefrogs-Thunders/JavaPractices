package HashMapassign;
import java.util.*;
public class P17 {
    public static int maxDifferentCandyTypes(int[] candyType) {
        int n = candyType.length;
        int maxTypes = 0;
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < n / 2; i++) {
            if (!seen.contains(candyType[i])) {
                seen.add(candyType[i]);
                maxTypes++;
            }
        }
        return maxTypes;
    }
    public static void main(String[] args) {
        int[] candyType={1,3,2,2,3};
        System.out.println(maxDifferentCandyTypes(candyType));
    }
}
