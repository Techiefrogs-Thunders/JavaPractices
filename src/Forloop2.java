public class Forloop2{
    public static void main(String[] args) {
        
      int sum = 0;
      int n = 1000;
      for (int i = 1; i <= n; i++) {
        
        sum += i;     // sum = sum + i
      }
         
      System.out.println("Sum = " + sum);
        
      int x = 0;
      int y = 1000;
      for (int i = y; i >= 1; --i) {

        x += i;     // sum = sum + i
      }
         
      System.out.println("ans = " + x);
    }
  }
