public class ifelse {

   
       /*  public static void main(String[] args) {  
            //defining a variable  
            int number=13;  
            //Check if the number is divisible by 2 or not  
            if(number%2==0){  
                System.out.println("even number");  
            }else{  
                System.out.println("odd number");  
            }  
        }  
        } */ 
    

           
            public static void main(String[] args) {    
                int number=13;    
                //Using ternary operator  
                String output=(number%2==0)?"even number":"odd number";    
                System.out.println(output);  
            }    
            }   
