package Assignments;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
       int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("give 'n' value= ");
        int n=sc.nextInt();
      
        for(int i=1; i<=n; ++i, c=0){
            for(int j=1; j<=n-i; ++j){
                System.out.print(" ");
            }
            while (c!=2*i-1) {
               System.out.print("* ");
                
                //System.out.print(i);
                ++c;
                
            }
            System.out.println();

        }
    }
}
