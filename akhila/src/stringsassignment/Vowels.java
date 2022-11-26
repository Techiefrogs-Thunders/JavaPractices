package stringsassignment;

public class Vowels {
    public static void main(String[] args) {
        String str="akhila kakarla";
        int vowelscount=0;
        int consonantcount=0;
        str=str.toUpperCase();
        for(char ch:str.toCharArray())
        {
            if(ch>=65&&ch<=90){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowelscount++;
            }
            else{
                consonantcount++;
            }
        }
        
        }
        System.out.println(vowelscount);
        System.out.println(consonantcount);
    }
}