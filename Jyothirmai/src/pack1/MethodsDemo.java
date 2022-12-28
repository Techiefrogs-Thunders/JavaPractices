package pack1;
import java.util.*;

public class MethodsDemo {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int a=obj.nextInt();
        System.out.println("Enter the second num: ");
        int b=obj.nextInt();
        int c=a+b;
        System.out.println("Sum is: "+c);
        //int sum=add(3,4);
        welcome();
        obj.close();
    }
    public static void welcome(){
        System.out.println("Welcome");
    }
    public static int add(int a, int b){
        System.out.println("function called");
        System.out.println(a+b);
        int sum = a+b;
        return sum;
    }
}
