package AssignmentOops;

public class No1 {
    public static void main(String[] args) {
      Student student=new Student("john",2);
       Student test=new Student(2,"john");
        Student test1=new Student("john");
    }
}
   class Student{
        int roll_no;
        String name;
    Student(){
            System.out.println("College");
        }
    Student(int roll_no, String name){
        roll_no=roll_no;
        name=name;
        System.out.println(name +" "+roll_no);  
        }
        Student(String name,int roll_no){
            System.out.println(roll_no+"  "+name);
        }
        Student(String name){
            System.out.println(name+"  :name onlr");
        }
    }
