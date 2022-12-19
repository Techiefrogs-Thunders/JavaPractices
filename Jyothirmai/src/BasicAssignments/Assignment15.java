package BasicAssignments;

public class Assignment15 {
    public static void main(String[] args) {
        int a = 121;
        int b=0;
        int temp = a;
        while(temp>0){
            int c =temp%10;
            b=b*10+c;
            temp=temp/10;
        }
        if(a==b){
            System.out.println("the num is palindrome");
        }
        else{
            System.out.println("the num is not a palindrome");

        }
        
        
    }
}
