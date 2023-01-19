package HashMapassign;

public class P12 {
    public static int longestPalSubStr(String s){
        int n=s.length();
        int maxLength=1,start=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int flag=1;
                for(int k=0;k<(j-i+1)/2;k++){
                    if(s.charAt(i+k)!=s.charAt(j-k)){
                        flag=0;
                    }
                }
                if(flag!=0 && (j-i+1)>maxLength){
                    start=i;
                    maxLength=j-i+1;
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s="akhilakakarla";
        System.out.println(longestPalSubStr(s));
    }
}
