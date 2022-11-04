package Assignments;

public class AlphaVowelOrConsonant {
    public static void main(String[] args) {
        char c='a';
        if (c=='A'|| c=='E'|| c=='I'||c=='O'||c=='U') {
         System.out.println("charcter is Vowels");
            
        } else {
            System.out.println("Chacter is consonant");
        } 
        switch (c) {
            case 'A','E','I','O','U':System.out.println("charcter is Vowel");
                break;
            default: System.out.println("Chacter is consonant");
                break;
        }
    }
}
