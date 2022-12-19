package BasicAssignments;

public class Assignment16 {
    public static void main(String[] args) {
        int a =153;
        int b = 0;
        int temp = a;
        while(temp>0){
           int c = temp%10;
           b = (c*c*c)+b;
            temp = temp/10; 
        }
        if(a==b){
            System.out.println("the num is armstrong");
    }
    else{
        System.out.println("the num is not an armstrong");
    }
}
        }
