package methodsassignment;

public class Student {
    int age=0;
    String name="Unknown";
    String address="not availble";
    Student()
    {
        System.out.println("Student name: "+name+" age: "+age+" address: "+address);
    }
    void setInfo(String name,int age)
    {
        System.out.println("Student name: "+name+" age: "+age+" address: "+address);
    }
    void setInfo(String name,int age,String address)
    {
        System.out.println("Student name: "+name+" age: "+age+" address: "+address);
    }
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println("===========");
        student.setInfo("akhila kakarla",22);
        System.out.println("===========");
        student.setInfo("akhila",22,"5-8/1,duddukuru,west godavari,A.P.,534313");
    }
}
