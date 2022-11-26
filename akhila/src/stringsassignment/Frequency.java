package stringsassignment;

public class Frequency {
    public static void main(String[] args) {
        String str="akhila kakarla";
        int[] freq=new int[str.length()];
        char str1[]=str.toCharArray();
        for(int i=0;i<str1.length;i++){
            freq[i]=1;
            for(int j=i+1;j<str1.length;j++){
                if(str1[i]==str1[j]){
                    freq[i]++;
                    str1[j]='0';
                }
            }
        }
        System.out.println("Frequencies of the characters in the string is ");
        for(int i=0;i<freq.length;i++){
            if(str1[i]!=' '&&str1[i]!='0')  {
                System.out.println(freq[i]+" ");
            } 
        }
    }
}
