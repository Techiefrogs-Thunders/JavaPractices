package stringsassignment;

public class DivideString {
    public static void main(String[] args) {
        String str="adnjjjjnjdjd";
        int n=4;
        int len=str.length();
        int temp=0;
        int chars=len/n;
        String[] s=new String[n];
        if(len%n!=0){
            System.out.println("String can't be divided");
        }
        else{
            for(int i=0;i<str.length();i+=chars)
            {
                String part=str.substring(i,i+chars);
                s[temp]=part;
                temp++;
            }
            for(int i=0;i<s.length;i++){
                System.out.println(s[i]);
            }
        }

    }
}
