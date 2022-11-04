package Assignments;

public class FactorialNum {
    public static void main(String[] args) {
        int n=5, fact=1;
       
        for(int a=1; a<=n; a++){
            System.out.print(a);
            fact = fact * a;
           if(a!=n){
               System.out.print("*");
            }
          //System.out.println(fact-1);
        }
            System.out.println("="+fact);
            //System.out.println(fact);

        }
    }
    

