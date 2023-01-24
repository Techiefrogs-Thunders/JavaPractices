package StringsAssignment;

public class Assignment1 {
    public static void main(String[] args) {
        String str = "Welcome to java programming";
        int vowels = 0, consonents = 0, digits = 0, spaces= 0;
        str = str.toLowerCase();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch== 'a'|| ch=='e'|| ch=='i' ||ch=='o' || ch=='u'){
                ++vowels;
            }
            else if(ch>='a'&&ch<='z'){
                ++consonents;
            }
            else if(ch>='0'&& ch<='9'){
                ++digits;
            }
            else if(ch == ' '){
                ++spaces;
            }
        }
        System.out.println("vowels is: "+vowels);
        System.out.println("consonents are: "+consonents);
        System.out.println("digits are: "+digits);
        System.out.println("spaces are: "+spaces);
    }
}
