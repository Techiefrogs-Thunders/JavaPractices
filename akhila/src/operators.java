public class operators {
    void unary()
    {
        System.out.println("start");
        int a=10;
        int b=20;
        boolean c=true;
        boolean d=false;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(a++ + b++);
        System.out.println(a-- + b--);
        System.out.println(-a);
        System.out.println(-b);
        System.out.println(!c);
        System.out.println(!d);
        System.out.println("end");
    }
    void arithmetic()
    {
        System.out.println("start");
        int a=20,b=10,sum,sub,mul,div,mod;
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        mod=a%b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        System.out.println("end");
    }
    void shift()
    {
        int a=10;
        int b=2;
        System.out.println("right shift "+(a>>b));//a/2^b
        System.out.println("left shift "+(a<<b));//a*2^b
    }
    void logical()
    {
        int a=10;
        int b=5;
        int c=20;
        System.out.println("logical AND : "+(a<b && b<c));//any one is false then false
        System.out.println("logical OR : "+(a<b || b>c));//anyone is true then true
        // logical checks first condn if it's true then checks second or else print false
    }
    void bitwise()
    {
        int a=10;
        int b=5;
        int c=20;
        System.out.println("bitwise AND "+(a<b & a<c));//if one is false then false
        System.out.println("bitwise OR "+(a<b | a<c));//if one is true then true
        //checks both the statements
    }
    void ternary()
    {
        int a=10;
        int b=5;
        int min=(a<b)?a:b;//true prints a else b
        System.out.println(min);
    }
    void assignment()
    {
        int a=10;
        int b=5;
        System.out.println(a+=1);
        System.out.println(a-=4);
        System.out.println(a+=b);
        System.out.println(a-=b);
    }
    void comparison()
    {
        int a=10;
        int b=5;
        System.out.println("equal to == : "+(a==b));
        System.out.println("not equal != "+(a!=b));
        System.out.println("greater than > "+(a>b));
        System.out.println("less than < :"+(a<b));
        System.out.println("greater than or equal to >= "+(a>=b));
        System.out.println("less than or equal to <= "+(a<=b));
    }
    public static void main(String[] args) {
        System.out.println("main() method");
        new operators().unary();
        new operators().arithmetic();
        new operators().shift();
        new operators().logical();
        new operators().bitwise();
        new operators().ternary();
        new operators().assignment();
        new operators().comparison();
        System.out.println("end");

    }
}
