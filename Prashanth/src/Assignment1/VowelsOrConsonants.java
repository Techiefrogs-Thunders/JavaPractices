package Assignment1;

import java.util.Scanner;

public class VowelsOrConsonants {
    public static void main(String[] args) {
        int p=0;
        Scanner pr=new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char ch=pr.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            p++;    
        }
            if (p==1) {
                System.out.println("Entered character " +ch+" is Vowel");
                
            } else {
                if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
                    System.out.println("Entered character " +ch+" is a Constant");
                    
                } else {
                    System.out.println("Not an Alphabet");
                    
                }
                
            }
    }
    
}
