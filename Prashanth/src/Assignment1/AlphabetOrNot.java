package Assignment1;

import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] args) {
        
        int i = 'a';
        if ((i>='a'&&i<='z')||(i>='A'&&i<='Z')) {
            System.out.println("It is an Alphabet");  
        } else {
            System.out.println("It is not an Alphabet");
        }
    }  
}
