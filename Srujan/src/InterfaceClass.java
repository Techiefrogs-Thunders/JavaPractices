public class InterfaceClass implements InterfaceA,InterfaceB {
	
	@Override
	public void meth1() {
		System.out.println("InterfaceA abstract ovrrriden");
	}
@Override
	public void show() {
	System.out.println("InterfaceB abstract ovrrriden");
	}
	public static void main(String[] args) {
		InterfaceA aobj=new InterfaceClass();
		aobj.meth1();
		aobj.meth2();
		InterfaceB bobj=new InterfaceClass();
		bobj.show();
	}
}