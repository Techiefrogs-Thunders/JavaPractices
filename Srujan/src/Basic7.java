public class Alphabet {

    public static void main(String[] args) {

        char h = 'A';
        
        String output = (h >= 'a' &&  h <= 'z') || (h >= 'A' && h <= 'Z')
                ? h + " is an alphabet."
                : h + " is not an alphabet.";
        
        System.out.println(output);
    }
}