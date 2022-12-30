package ClassObjectsAssignment;
import java.util.*;

public class EncapsulationAssignment {
    void meth1(){
         Scanner sc = new Scanner(System.in);
            int n;
            
            n=sc.nextInt();
            Test t=new Test();
            for(int i=1;i<=n;i++){
                /*
                rollno=sc.nextInt();
                
                name=sc.nextLine();
                address=sc.nextLine();
                phonenum=sc.nextLine();
                */
                t.setName(sc.nextLine());
                t.setAddress(sc.nextLine());
                t.setRollno(sc.nextInt());
                t.setPhone(sc.nextLine());
            
            
            System.out.println("The student name is "+t.getName());
            System.out.println("student roll no "+t.getRollno());
            System.out.println("student address is "+t.getAddress());
            System.out.println("student phonenum is "+t.getPhone());}
            sc.close();
    }
    public static void main(String[] args) {
        EncapsulationAssignment enc =new EncapsulationAssignment();
        enc.meth1();
    }
class Test{
    private int rollno;
    private String name;
    private String address;
    private String phonenum;
    

    public int getRollno() {
        
        
        return rollno;
    }

    public void setRollno(int rollno) {
        
        this.rollno = rollno;
    }

    public String getAddress() {
        
        return address;
    }

    public void setAddress(String address) {
        
        this.address = address;
    }

    public String getPhone() {
        
        return phonenum;
    }

    public void setPhone(String phone) {
        
        this.phonenum = phone;
    }

    public String getName() {
        
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
    }
}
}