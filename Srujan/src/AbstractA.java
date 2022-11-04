public abstract class AbstractA {
	abstract void meth1();
	void meth2()
	{
		System.out.println("AbstarctA meth2() called");
	}
	static void meth3()
	{
		System.out.println("AbstarctA static meth3 called");
	}
	AbstractA()
	{
		System.out.println("AbstarctA constructor");
	}
	public static void main(String[] args) {
		
		AbstractA.meth3();
	}

}