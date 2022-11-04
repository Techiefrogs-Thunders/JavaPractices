import java.util.Scanner;
public class Encapsulation {
    void meth1()
    {
        Scanner sc=new Scanner(System.in);
        parent aobj=new parent();
        System.out.println("student Name is ");
        aobj.setstudentname("akhila");
        sc.nextLine()
        System.out.println("student rollno is ");
        aobj.setrollno(38110221);
        
        System.out.println("student name : "+aobj.getstudentname());
        System.out.println("student rollno : "+aobj.getrollno());
    } 
    public static void main(String[] args) {
        Encapsulation encap=new Encapsulation();
        encap.meth1();
    }  
}
public class parent
{
   private studentname;
   private rollno;
   public getstudentname()
   {
    return studentname;
   } 
   public setstudentname(String studentname)
   {
    this.studentname=studentname;
   }
   public getrollno()
   {
    return rollno;
   }
   public setrollno(int rollno)
   {
    this.rollno=rollno;
   }
}