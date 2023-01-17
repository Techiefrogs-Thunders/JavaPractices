package HashMapassign;

public class P1 {
    public static int[] twoSum(int k, int target) {
        int[] ans = new int[2];
        int n = k.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (k[j] == target- k[i]) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       twoSum(5,2);
    }
}
