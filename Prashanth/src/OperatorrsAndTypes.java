public class OperatorrsAndTypes{
    static int a= 12,b=14,c=16;
    public static void main(String[] args) {
        // Logical operator (&&, ||)
        System.out.println("Logic operator &&");
        System.out.println(true&&true);
        System.out.println(false&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);

        System.out.println(a>b && c<b);
        System.out.println("Logical operator ||");
        System.out.println(true||true);
        System.out.println(false||true);
        System.out.println(true||false);
        System.out.println(false||false);

        System.out.println("Logic operator with unary operator");
        System.out.println(a>b || b>c);
        System.out.println(a++>b-- && --c>b++);
        System.out.println(++a>--c || c++>b++);
        System.out.println(--a<=b++ && b++>=--c);
    }
}

