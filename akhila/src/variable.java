public class variable {
   int a=10;
   static int b=4;
   //int b=3;
   int eligibility;
   void meth1()
   {
    int c=3;
    System.out.println("Instance Variable : "+a);
    System.out.println("Instance Variable : "+new variable().a);
    System.out.println("======================");
    System.out.println("static variable : "+b);
    System.out.println("Static variable : "+new variable().b);
    System.out.println("static variable : "+variable.b);
    System.out.println("======================");
    System.out.println("local variable : "+c);
   }
   void meth2(int eligibility)
   {
    if( eligibility>18)
    {
        System.out.println("u r eligile to vote");
    }
    else{
        System.out.println("u r not eligible to vote");
    }    
   }
   void meth3()
   {
    int b=8;
    System.out.println("local variable : "+b);
    System.out.println("static variable : "+variable.b);
   }
   public static void main(String[] args) {
    new variable().meth1();
    new variable().meth2(22);
    System.out.println("===========");
    new variable().meth2(17);
    new variable().meth2(18);
    new variable().meth3();
   }
}
