package stringsassignment;
import java.util.*;
public class One {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        sc.close();
        int vowelscount=0;
        int consonantcount=0;
        int spacecount=0;
        int digits=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vowelscount++;
            }
            else{
                consonantcount++;
            }
            if(s.charAt(i)==' '){
                spacecount++;
            }
            if(s.charAt(i)>=48&&s.charAt(i)<=57){
                digits++;
            }
        }
        System.out.println("vowels: "+vowelscount);
        System.out.println("Consonents: "+consonantcount);
        System.out.println("spaces: "+spacecount);
        System.out.println("digits: "+digits);
    }
}
