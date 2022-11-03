package AssignmentOOPS;

import java.util.Scanner;

public class Area {   // Question 6
    int length, breadth;

    void setDim(){
        Scanner rec = new Scanner(System.in);
        System.out.println("Enter Length and Breadth: ");
        length = rec.nextInt();
        breadth = rec.nextInt();
        rec.close();
    }

    int getArea(){
        int a;
        a = length * breadth;
        return a;
    }

    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Area of the Rectangle: " + area.getArea());
    }
    
    Area(){
        setDim();
    }
}
