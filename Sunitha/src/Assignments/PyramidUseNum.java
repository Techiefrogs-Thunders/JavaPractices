package Assignments;

public class PyramidUseNum {
    public static void main(String[] args) {
        int a = 5, b= 0, c = 0, d = 0;

        for (int i = 1; i <= a; ++i) {
          for (int j = 1; j <= a - i; ++j) {
            System.out.print("  ");
            ++j;
          }
    
          while (b != 2 * i - 1) {
            if (c <= a - 1) {
              System.out.print((i + b) + " ");
              ++c;
            } else {
              ++d;
              System.out.print((i + b - 2 * d) + " ");
            }
    
            ++b;
          }
          d = c = b = 0;
    
          System.out.println();
        }
      }
    }
