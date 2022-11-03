public class Ifsatement {
    public static void main(String[] args) {
        int age = 18; 
        if(age >= 18) {
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Elgible");
        }
        System.out.println("Odd or Even"); // Odd or Even
        int number = -0;
        if (number%2==0) {
            System.out.println("Even number");
            
        }else{
            System.out.println("Odd number");
        }
        System.out.println("  "); // Leap year
        int year = 2020;
        if ((year % 4 ==0 && year % 100 !=0) || year % 400 ==0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Common Year");
        }
        System.out.println("If Else If");
        
        if (number>0) {
            System.out.println("Positive");
        } else if (number<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
        System.out.println("  ");
        int marks =100;
        if (marks<50) {
            System.out.println("Fail");
        } else if (marks>=50 && marks<60) {
            System.out.println("D grade");
        } else if (marks>=60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        }else if (marks >=80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid");
        }  
        }
    }

