public class ClassB1 extends ClassA1 {

	int k=10;;
	
	ClassB1(){
		
		
	}
	void show()//overrides
	{
		System.out.println("k value is :"+k);
	}
	public static void main(String[] args) {
ClassA1 obj=new ClassB1();
obj.show();
	}

}