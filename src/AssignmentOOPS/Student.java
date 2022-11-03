package AssignmentOOPS;

public class Student {
    String name;
    int roll_no;
    String ph_no;
    String address;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.roll_no = 2;
        student1.ph_no = "234-432-5678";
        student1.address = "9877, Dallas";
        Student student2 = new Student();
        student2.name = "Sam";
        student2.roll_no = 3;
        student2.ph_no = "324-654-54321";
        student2.address = "7899, Austin";
        student1.display();
        student2.display();

    }

    void display(){
        System.out.println(name + "  " + roll_no + "  " + ph_no + "  " + address);
    }
    
}
