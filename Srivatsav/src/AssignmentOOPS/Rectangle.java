package AssignmentOOPS;

public class Rectangle { // Question 5
    int length;
    int breadth;

    int area(){
        int a;
        a = length*breadth;
        return a;
    }
    
    /*Rectangle(int l, int b){
        l = length;
        b = breadth;
    }*/

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 5);
        Rectangle rec2 = new Rectangle(5, 8);
        System.out.println("Area 1: " + rec1.area() + " ,Area 2: " + rec2.area());
    }

    Rectangle(int l, int b){
        length = l;
        breadth = b; 
    }
}
