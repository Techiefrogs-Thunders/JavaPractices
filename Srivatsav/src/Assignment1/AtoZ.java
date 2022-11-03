package Assignment1;

public class AtoZ {
    public static void main(String[] args) {
        char a, b;

        for(a = 'a'; a <= 'z'; ++a){   // alphabet ascii code a =097 z = 122
            System.out.print(a + " ");
        }
        System.out.println();
        for (b = 'A'; b<='Z'; ++b ) {  // alphabet ascii code A =065 Z = 090
            System.out.print(b + " ");
        }
    }
}
