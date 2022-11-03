public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a++); // a++ is Post Increment here output will remain the same but the variable will increase for next line
        System.out.println(++a); // ++a is Pre Increment here the variable increase  +1
        System.out.println(a++); // here the variable will be the same as preincrement
        System.out.println(a); // here the variable is +1
        System.out.println(b--); // b-- is Post Decrement here variable will remain the same but the variable will decrease for next line
        System.out.println(--b); // --b is Pre Decrement here the variable decreses -1
        System.out.println(--b);
        System.out.println(b);
        System.out.println(a++ + ++a);
        System.out.println(++a + a++);
        System.out.println(++a - b++);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b-- + --b);
        System.out.println(--b - a--);
        System.out.println(a);
        System.out.println(b);
    }   
    
}
