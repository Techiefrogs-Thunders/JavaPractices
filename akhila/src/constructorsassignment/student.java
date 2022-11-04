package constructorsassignment;

public class student {
    public student(String name,int roll_no,String num, String address)
    {
        System.out.println("The name of the student is: "+name);
        System.out.println("The roll_no of the student is: "+roll_no);
        System.out.println("Student's contact number: "+num);
        System.out.println("The address of the student : "+address);
    }
    public static void main(String[] args) {
        new student("John",2,"9979453623","5-8/1,duddukuru");
        new student("Sam",3,"945362718","4/2,rajahmundry");
    }
}
