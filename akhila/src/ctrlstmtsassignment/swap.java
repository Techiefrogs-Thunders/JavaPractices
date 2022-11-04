package ctrlstmtsassignment;

public class swap {
   int a=10;
   int b=5;
   void meth1()
   {
    int temp;
    System.out.println(a+" "+b);
    temp=a;
    a=b;
    b=temp;
    System.out.println(a+" "+b);
   } 
   public static void main(String[] args) {
    new swap().meth1();
   }
}
