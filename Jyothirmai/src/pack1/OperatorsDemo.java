package pack1;

public class OperatorsDemo {
    public static void main(String[] args) {
        int i =20, j = 10;
        System.out.println(i++);
        System.out.println(i);

        System.out.println(++j);
        System.out.println(j);

        System.out.println(i--);
        System.out.println(i);
        
        System.out.println(--j);
        System.out.println(j);

        int a = 10;
        int b = 10;
        System.out.println(~a);
        System.out.println("a value = "+a);
        System.out.println(~b);

        //boolean b1 = false;

        //System.out.println(!b1);
        System.out.println(a++ + ++a);
        System.out.println(++b + b++);
        System.out.println(b);

          a = 10;
          b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        System.out.println(10<<3);
        System.out.println(6<<4);

        System.out.println(10>>3);
        System.out.println(6>>4);

        a =20;
        b =15;
        System.out.println(a>b & b<a);
        System.out.println("Integer bitwise or");
        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a<b | b>a);
        System.out.println(5|10);

        System.out.println(a<b && b<a++);
        System.out.println(a);
        System.out.println(a<b || b<a);


        a += 10;
        b -= 5;

        //short k = 10;
        //short l = 20;
        short m = 10 + 20;
       // m = (short)(k + l);
        System.out.println(m);



    }



}
