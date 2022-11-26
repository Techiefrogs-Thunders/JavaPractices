package stringsassignment;

public class Iterate2 {
    public static void main(String[] args) {
       String str="I am akhila ";
       System.out.println(str.toLowerCase());
       
       for(char c:str.toCharArray()) {
        System.out.println(c+" ");
       }
    }
}
