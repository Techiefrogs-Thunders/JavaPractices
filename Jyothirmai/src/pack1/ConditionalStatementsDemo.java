package pack1;

import javax.lang.model.util.ElementScanner14;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        int age = 15;
        int weight = 60;
        if(age >= 18){
            System.out.println("Eligible to vote"); 
            System.out.println("In if block"); 
        }
        else{
            System.out.println("Not eligible to vote");
            System.out.println("In else block");
        }

        int n = 20;
           //if(n%2==0)
           //  System.out.println("Its an even num");
           // else
            //  System.out.println("Its an odd num");
        
        String output = (n%2==0)?"even":"odd";

        System.out.println(output);

        if(age >= 18){
            System.out.println("Eligible as per age");
            if(weight >= 60){
                System.out.println("Eligible to donate blood");
            }
            else{
                System.out.println("Not eligible as per weight criteria");
            }
        }
        else{
            System.out.println("Not eligible as per under the age");
        }

        System.out.println("After if block");

       }
    }    
