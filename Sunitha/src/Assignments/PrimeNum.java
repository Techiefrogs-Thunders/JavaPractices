package Assignments;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int g=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter some no= ");
        int n=sc.nextInt();
        boolean prime=true;
        String p="";
        for(int a=1; a<n/2; a++){
            prime=checkprime(a);
            System.out.println(a);
            if (prime) {
                p=p+a+"";
            }
        }
                System.out.println("prime no= "+ p);
                
            }
            public static boolean checkprime(int Num) {
                int r;
                for(int a=2; a<=Num/2; a++){
                    r=Num%a;
                    if (r==0) {
                        return false;
                    }

                }
                return true;
                
            }
        
    }
