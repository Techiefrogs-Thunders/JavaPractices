public class Variables {
    int A = 20;  // instance variable
    static int G = 55;  // static variable
    static final int F = 300;  // Final Variable, if it is not static it throws error because main is static
    public static void main(String[] args) {
        int U = 88; //Local Variable
        //int F = 44; // throws error
        System.out.println(U);
        System.out.println(F);
        System.out.println(Variables.G); // Correct way to access static variable is by classname
        // System.out.println(A); // throws error because A is not static   

    }
    
}
