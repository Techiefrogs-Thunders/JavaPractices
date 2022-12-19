package BasicAssignments;

public class Assignment12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int gcd = 1;
        int i = 1;
        for(i=1;i<=a&&i<=b;++i){
            if(a%i==0&&b%i==0)
            gcd = i;
        }
        int c = (a * b)/gcd;
        System.out.println(c);
    }
}
