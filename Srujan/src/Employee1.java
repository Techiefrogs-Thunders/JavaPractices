public class Employee1 extends Member {
	String specialization="Sr Engineer";
	String department="IT sector";
	 public void meth1()
	 {
		 System.out.println("Print name: " + name);
		 System.out.println("Print age: " + age);
		 System.out.println("Print phonenumber: " + phonenumber);
		 System.out.println("Print address: " + address);
		 System.out.println("Print salary: " + salary);
	 }
	public static void main(String[] args) {
		Employee1 obj=new Employee1();
		obj.meth1();


	}

}