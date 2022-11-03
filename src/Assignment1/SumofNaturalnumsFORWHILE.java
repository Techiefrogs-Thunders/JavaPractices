package Assignment1;

import java.util.Scanner;

public class SumofNaturalnumsFORWHILE {
    public static void main(String[] args) {
        System.out.println("For Loop");
        Scanner fo= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = fo.nextInt();

        int i, sum = 0;
        
        for(i=1;i<=num;++i){
            sum = sum+i;
        }
        System.out.println("sum of First "+num+" Natural number is= "+ sum);
        System.out.println("While Loop");
        Scanner wh= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = wh.nextInt();
        int l=1,sol=0;
        while (l<=n) {
            sol+=l;
            l++;
        }
        System.out.println("Sum of First "+n+ " natural Numbers is= "+ sol);
    }
    
}
