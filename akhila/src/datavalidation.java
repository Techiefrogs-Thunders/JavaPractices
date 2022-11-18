import java.util.Scanner;
public class datavalidation {
    void meth1(){
        Scanner sc=new Scanner(System.in);
        Parent parent=new Parent();
        parent.setstudentName(15);
        
        while(!sc.hasNext("exit"))
        {
            System.out.println(
                sc.hasNextLine() ? "(string)"+sc.nextLine() :
                sc.hasNextInt() ?  "(int)"+sc.nextInt());
        }
        System.out.println("=================");
        System.out.println("Student Name: "+parent.getstudentName());
        System.out.println("Student Rollno: "+parent.getstudentRollno());
        sc.close();
    }
    /*Encapsulation : The process of making fields as private and providing access to those fields 
    with the help of public method through getters and setters methods.
    Also known as combination of Data hiding and Abstraction.
    */
    public static void main(String[] args) {
        new Encapsulation().meth1();
    }
}
class Parent
{
    private String studentName;
    private int studentRollno;
    public String getstudentName()
    {
        return studentName;
    }
    public void setstudentName(String studentName)
    {
        this.studentName = studentName;
    }
    public int getstudentRollno()
    {
        return studentRollno;
    }
    public void setstudentRollno(int studentRollno)
    {
        this.studentRollno=studentRollno;
    } 
}   

