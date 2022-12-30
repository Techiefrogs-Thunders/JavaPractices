package Queue_DequeAssign;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
public class P5 {
    public static class RecentCounter {
      private Deque<Integer> q = new ArrayDeque<>();
        public RecentCounter() {
        }
    
        public int ping(int t) {
          q.offer(t);
        while (q.peekFirst() < t - 3000) {
            q.pollFirst();
        }
        return q.size();
        }
        
      }
      public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
    
        RecentCounter obj = new RecentCounter();
    
        while (read.ready()) {
          int val = Integer.parseInt(read.readLine());
          int ans = obj.ping(val);
          System.out.println(ans);
        }
    
      }

}
