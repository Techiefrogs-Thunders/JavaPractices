package stringsassignment;

public class Duplicatechar {
    public static void main(String[] args) {
        String str="akhila kakarla";
        char string[]=str.toCharArray();
        int count=0;
        for(int i=0;i<string.length;i++){
            count=1;
            for(int j=i+1;j<string.length;i++){
                if(string[i]==string[j]){
                    count++;
                    string[j]='0';
                }
            }
            if(count>1&&string[i]!='0'){
                System.out.println(string[i]);
            }
        }
    }
}
