public class Manager extends Member {
	String specialization="Engineer";
	String department="IT";
	
	public void meth2()
	{
		System.out.println("Print name: " + name);
		 System.out.println("Print age: " + age);
		 System.out.println("Print phonenumber: " + phonenumber);
		 System.out.println("Print address: " + address);
		 System.out.println("Print salary: " + salary);
	}
	public static void main(String[] args) {
		Manager obj=new Manager();
		obj.meth2();

	}

}