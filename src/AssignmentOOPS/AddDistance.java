package AssignmentOOPS;

import java.util.Scanner;

public class AddDistance {
    int feet1, inch1, feet2, inch2;

    void getDistance(Scanner ad){
        System.out.println("Enter the first distance");
        System.out.println("Enter feet: ");
        feet1 = ad.nextInt();
        System.out.println("Enter inches: ");
        inch1 = ad.nextInt();
        System.out.println("Enter second distance");
        System.out.println("Enter feet: ");
        feet2 = ad.nextInt();
        System.out.println("Enter inches: ");
        inch2 = ad.nextInt();
    }
    void add(){
        int inch = inch1 + inch2;
        int d = 0;
        
        if(inch>12){
            d = inch / 12;
            inch = inch % 12;
        } 
        int feet = feet1 + feet2 + d; 
        System.out.println("Total Distance is : "+feet+ " feet and  "+ inch+ " inches");
        
    }
     public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        AddDistance dis = new AddDistance();
        
        dis.getDistance(obj);
        dis.add();
    }
    
}
