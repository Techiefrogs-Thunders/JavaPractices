public class OperatorsAndTypes {
    static int x=10+2, y=14,z=7,i=2,p=4;
    static boolean r=false;
    public static void main(String[] args) {
        byte c= 45; int d = 9;

        //unary operator(++z, z++,--z, ~, !)
    System.out.println(x++ + ++x);
    System.out.println("This is increment of x:" +x);
    System.out.println(y++ - ++y);
    System.out.println("This is decrement of y:" +y);
    System.out.println(--z + --z);
    System.out.println("This is decrement of z:" +z);
    System.out.println(~c);  //"~ is negate it's change always from (+ve to -ve) and (-ve to +ve)"
    //System.out.println(!d);  // ! it will reverse the value
    }
}