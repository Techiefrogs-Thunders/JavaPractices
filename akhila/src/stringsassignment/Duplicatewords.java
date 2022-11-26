package stringsassignment;

public class Duplicatewords {
    public static void main(String[] args) {
        String str="big black bug bit a black dog";
        str=str.toLowerCase();
        String words[]=str.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            count=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if(count>0&&words[i]!="0"){
                System.out.println(words[i]);
            }
        }
    }
}
