package stringsassignment;

public class Punctuation {
    public static void main(String[] args) {
        String str="I , am . ( akhi?la : kaka)rla!";
        int count=0;
        for(char ch:str.toCharArray())
        {
            if(ch==','||ch=='?'||ch=='('||ch==':'||ch==')'||ch=='{'||ch=='}'){
                count++;
            }
        }
        System.out.println(count);
    }
}
