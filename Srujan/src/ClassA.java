public class ClassA //class
{
public void meth1(int a)//method
{
	System.out.println("meth1 execution starts here");
if(a<10)
{
System.out.println("print postive");	
}
else{

    System.out.println("Print a value");
}
}
public static void main(String[] args) //main method
{
	ClassA obj=new ClassA();
	obj.meth1(20);
}
}	

