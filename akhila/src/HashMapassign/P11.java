package HashMapassign;

public class P11 {
    public static char findMissingLetter(char[] s, char[] t) {
        int[] m1 = new int[256];
 
    // store second string in map with frequency
    for (int i = 0; i < t.length; i++)
        m1[t[i]]++;
 
    // store first string in map with frequency
    for (int i = 0; i < s.length; i++)
        m1[s[i]]--;
 
    for (int i=0;i<m1.length;i++)
    {
 
        // if the frequency is 1 then this
        // character is which is added extra
        if (m1[i]== 1)
            return (char) i;
    }
    return Character.MIN_VALUE;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "cdabp";
 
        char c = findMissingLetter(s.toCharArray(), t.toCharArray());
        System.out.println("Missing letter is: " + c);
    }
}
