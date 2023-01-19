package HashMapassign;
import java.util.*;
public class P10 {
    public static boolean match(String pattern, String str) 
	{ 
		String[] words = str.split(" "); 
		if (words.length != pattern.length()) 
			return false; 

		HashMap<Character, String> map = new HashMap<Character, String>(); 

		for (int i = 0; i < pattern.length(); i++) 
		{ 
			char c = pattern.charAt(i); 
			if (map.containsKey(c)) 
			{ 
				if (!map.get(c).equals(words[i])) 
					return false; 
			} 
			else
			{ 
				map.put(c, words[i]); 
			} 
		} 

		return true; 
	} 
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(match(pattern,s));
    }
}
