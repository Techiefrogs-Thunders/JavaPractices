package Assignments;

public class GCDoFTwoNum {
    public static void main(String[] args) {
        int m=12,n=15, p=1;
        for (int i = 1; i <= m && i <= n; ++i) {

            // check if i perfectly divides both n1 and n2
            if (m % i == 0 && n % i == 0){
                p = i;
                System.out.println(i);

            }
          }
      
          System.out.println("GCD of " + m +" and " + n + " is " + p);
        }
            
    }
