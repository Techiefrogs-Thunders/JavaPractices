package Methods;

public class Methods1 {
    
    public static void main(String[] args) {

        PrintNumber pn = new PrintNumber();

        int a = 6;
        double b = 7.5;
        float c = 8.5f;
        
        System.out.println("         ");
        pn.printn(a,b);
        System.out.println("         ");
        pn.printn(c,b);
        System.out.println("         ");
        pn.printn(b,3L);
        System.out.println("         ");
        pn.printn(2L, a);



    }
}
