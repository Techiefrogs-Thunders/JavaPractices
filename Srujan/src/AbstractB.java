public  class AbstractB extends AbstractA{

	void meth1()
	{
		System.out.println("abstract method overridden");
	}

	public static void main(String[] args) {
		AbstractA aobj=new AbstractB();
		aobj.meth1();
		aobj.meth2();
	}

}