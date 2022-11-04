package Assignments;
public class CharAlphOrNot {
    public static void main(String[] args) {
        
        char c=789;
        //d=i;
        if (c>='a' && c<='z' || c>='A' && c<='Z') {
                System.out.println("Given char C is alphabet= "+ c);            
        } else {
            System.out.println("Given Charcter not alphabet= "+ c);
        }
        //System.out.println(c);
    }
} 