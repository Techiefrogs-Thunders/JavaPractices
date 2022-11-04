public class Arguments {
        public static void main(String[] args) {
          System.out.println(args[5]); // ArrayIndexOutOfBoundsException shows error if the given arguments not between 0-10 
           // System.out.println(arg[]);// arguments can not be blank
            System.out.println(args[+11]);//if give '-' '+' it will consider as 10/11 only
            System.out.println("No of arguments:"+"   " +args[0]+"   "+args[12]);
    
        }
        
    }
