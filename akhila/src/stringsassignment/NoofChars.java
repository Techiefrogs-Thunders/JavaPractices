package stringsassignment;

public class NoofChars {
    public static void main(String[] args) {
        String str="Akhila kakarla";
        str=str.toUpperCase();
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch>64&&ch<91){
                count++;
            }
        }
        System.out.println(count);
    }
}
