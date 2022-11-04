package inheritance;
import java.util.Scanner;
public class singleinheritance extends employee{
    void meth2()
    {
        System.out.println("This is from parent class");
    }
   public static void main(String[] args) {
    singleinheritance sin=new singleinheritance();
    //employee emp=new employee();
    //employee emp=new singleinheritance();
    //singleinheritance emp=new employee();//C.E
     sin.meth1();
     sin.meth2();
     System.out.println("FINISH");
   } 
}

class employee {
    int empid,empnum;
    char empname,dept;
    float empsal;
    final String companyname="xyz";
    void meth1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("This is from child class");
        System.out.println("Employee name : ");
        sc.nextLine();
        System.out.println("Employee id: ");
        sc.nextInt();
        System.out.println("Employee num: ");
        sc.nextInt();
        System.out.println("Employee dept : ");
        sc.next();
        System.out.println("comapny name :"+companyname);
        System.out.println("Employee salary ");
        sc.nextFloat();
    }
    
}
