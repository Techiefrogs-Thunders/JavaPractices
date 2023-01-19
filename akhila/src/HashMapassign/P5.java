package HashMapassign;

public class P5 {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
 
        while (slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
 
        return slow == 1;
    }
    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
