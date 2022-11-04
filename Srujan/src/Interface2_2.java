public class Interface2_2 extends Interface2 {

public void meth2() {
		
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		Inheritance1 obj=new Inheritance1();
		obj.meth1();
		Inheritance1_1 aobj=	new Inheritance1_1();
		aobj.meth2();
		Inheritance1 bobj=new Inheritance1_1();
		bobj.meth1();
	}

}