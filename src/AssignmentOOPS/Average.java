package AssignmentOOPS;

import java.util.Scanner;

public class Average {
    int num1, num2, num3;
    void average(){
        double aveg = (num1+num2+num3)/3;
        System.out.println("Average: "+ aveg);
    }
    
    public static void main(String[] args) {
        int num1, num2, num3;
        System.out.println("Enter three numbers: ");
        Scanner avg = new Scanner(System.in);
        num1 = avg.nextInt();
        num2 = avg.nextInt();
        num3 = avg.nextInt();
        avg.close();
        Average avgobj = new Average(num1, num2, num3);
        avgobj.average();    
    }

    Average(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
}
