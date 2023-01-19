package HashMapassign;

public class P9 {
    public static int firstNonRepeatingCharacter(String str) {
        
        int count[] = new int[256];
        int index = -1;

        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        String str = "akhilakakarla";
        int index = firstNonRepeatingCharacter(str);

        System.out.println(index == -1 ? "Either all characters are repeating or string " +
                "is empty" : "First non-repeating character is " + str.charAt(index));
    }
}
