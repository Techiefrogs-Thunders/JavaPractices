import java.util.Scanner;

class Calculation {
    int z;
         
    public void addition(int x, int y) {
       z = x + y;
       System.out.println("The sum of the given numbers:"+z);
    }
         
    public void Subtraction(int x, int y) {
       z = x - y;
       System.out.println("The difference between the given numbers:"+z);
    }
}
     
class sum extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }
}

public class Inheritance2{
    public static void main(String args[]) {
        System.out.println("Enter Values:");
        Scanner val = new Scanner(System.in);
        int a = val . nextInt();
        int b = val . nextInt();
        Inheritance2 sum = new Inheritance2();
        sum.addition(a, b);
        sum.Subtraction(a, b);
        sum.multiplication(a, b);
    }

    private void Subtraction(int a, int b) {
    }

    private void multiplication(int a, int b) {
    }

    private void addition(int a, int b) {
    }
}    
