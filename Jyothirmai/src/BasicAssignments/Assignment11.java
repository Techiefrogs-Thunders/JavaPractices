package BasicAssignments;

public class Assignment11 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int i = 1;
        int gcd=1;
        for(i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
                
            }
        }
        System.out.println(gcd);
    }
}
