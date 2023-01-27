package Stringss;

import java.net.Socket;

public class Strings1vowelcount {
    public static void main(String[] args) {
        String str = "AEIOU ";
        int vowel=0, cons=0, digit=0, space=0;
        str=str.toUpperCase();
        char[] charr= str.toCharArray();
        for (char ch : charr) {
            if(ch>=65&&ch<=90){
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vowel++;
                }
                else{
                    cons++;
                }
            }
            if(ch == ' ')
                space++;
            if(ch>=48&&ch<=57){
                digit++;
            }
        }
        System.out.println("The number of vowels in the given sentence is "+vowel);
        System.out.println("The number of consonants in the given sentence is "+cons);
        System.out.println("The number of spaces in the given sentence is "+space);
        System.out.println("The number of digits in the given sentence is "+digit);
    }
}
