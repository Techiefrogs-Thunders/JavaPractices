

public class Encapsulation1 {
    public static void main(String[] args) {
    Superclass superclass=new Superclass();
    System.out.println("Employee name: "+superclass.getEmployeename());
    System.out.println("Employee Id: "+superclass.getEmployeeId());
    }
}
class Superclass{
    private String Employeename="Akhila Kakarla";
    private int EmployeeId=256;
    public String getEmployeename()
    {
        return Employeename;
    }
    public void setEmployeename(String name)
    {
        this.Employeename=name;
    }
    public int getEmployeeId()
    {
        return EmployeeId;
    }
    public void setEmployeeId(int id)
    {
        this.EmployeeId=id;
    }

}