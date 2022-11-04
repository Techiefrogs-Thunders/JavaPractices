public class Variables1 {
	int a=10;//this is instance variable should be placed in between class(variables) and method(meth1)
	static int b= 20;//this is static variable, where we should write 'static' it should be placed in between class(variables) and method(meth1)

	void meth1()
	{
		int c=30;//it is local variable it should be placed inside the method(meth1)
		System.out.println("instance varible--->"+a);
		System.out.println("static varible--->"+b);
		System.out.println("local varible--->"+c);
	}

	public static void main(String[] args) {
		
		Variables1 obj=new Variables1();
		obj.meth1();
	}

}