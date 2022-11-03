package Assignment1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num,t,s,rem;
        Scanner pa = new Scanner(System.in);
	    System.out.print("Enter any number: ");
        num=pa.nextInt();
	    t=num;
	    for(s=0;num>0;num/=10)
	    {
	    rem=num%10;
	    s=(s*10)+rem;
	    }
	   if (s == t) {
           System.out.println(t+" is a palindrome number ");
       } else {
           System.out.println(t+" is not a palindrome number ");
       }
    }
    
}
