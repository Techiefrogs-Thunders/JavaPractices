package AssignmentOOPS;

import java.util.Scanner;

public class AreaRec { 
    int length, breadth;

    int returnArea(){
        int area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        Scanner rect = new Scanner(System.in); 
        System.out.println("Enter Length and Breadth: ");
        int l = rect.nextInt();
        int b = rect.nextInt();
        rect.close();
        AreaRec area = new AreaRec(l, b);
        System.out.println("Area: " + area.returnArea());
    }

    AreaRec(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
}
