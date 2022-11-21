 

class Shape{
    public void print_shape(){
        System.out.println("This is shape");
    }
}

class Rectangle1 extends Shape{
    public void print_shape(){
        System.out.println("This is rectangular shape");
        super.print_shape();
    }
}

class Circle extends Shape{
    public void print_shape(){
        System.out.println("This is circular shape");
        super.print_shape();
    }
}

class Square1 extends Rectangle1{
    public void print_shape(){
        System.out.println("Square is a rectangle");
        super.print_shape();
    }
}
public class Inheritance6 {
    public static void main(String[] args) {
        Square1 s1 = new Square1();
        s1.print_shape();
    }

    
}
