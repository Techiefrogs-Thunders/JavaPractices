public class Shiftoperator {
    public static void main(String[] args) {
        int x = 5; 
        int n = 3; // << Shift Operators 2^n
        int answer = x<<n;
        System.out.println("Left shift " + x + " by " + n + " Positions: "+ answer);
        x= answer;
        n=2;
        answer = answer<<n;
        System.out.println("Left shift " +x+ " by "+n+ " Positions: " + answer);
        System.out.println(40<<2); // 40*2^2=40*4= 160

        int y =-4;
        int m = 3;
        int sum = y<<m;
        System.out.println("Left shift " + y + " by " + m + " Positions: "+ sum);
        
        y= sum;
        m= 5;
        sum= sum>>m;
        System.out.println("Right shift " + y + " by " + m + " Positions: "+ sum);
        System.out.println(-32<<5);

        int f = 19;
        int j = 3;
        int ans = f>>j;
        System.out.println("Right shift " + f + " by " + j + " Positions: "+ ans); 
        System.out.println(f>>j); // 19>>3 = 19*2^3 = 19/8 = 2.375 decimals wont be printed
    }
    
}
