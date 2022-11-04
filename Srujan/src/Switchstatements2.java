package srujan;

public class ClassB 
{
public void meth1()
{
System.out.println("implementing switch statement");	
int a=65;
byte b1=30;
switch(30)
{
case 30:
	System.out.println("case 10 got triggered");
	break;
case 'A':
	System.out.println("case A got triggered");
case 300:
	System.out.println("case 300 got triggered");
case 'x':
	System.out.println("case x got triggered");
case 50:
	System.out.println("case 50 got triggered");
}
System.out.println("compiler comes out from switch");
}
	public static void main(String[] args)
	{
	ClassB obj=new ClassB();
	obj.meth1();
	}
	}