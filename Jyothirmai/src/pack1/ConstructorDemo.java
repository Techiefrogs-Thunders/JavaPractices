package pack1;

public class ConstructorDemo {

    int i;
    String str;
    int rollNo;
    String name;

    ConstructorDemo(){
        this("visala",50);
        i=20;
        str="hello";
        System.out.println("In constructor");
    }

    ConstructorDemo(int i, String str){
    this.i = i;
    this.str = str;

    System.out.println("In parameter new constructors");
    }

    ConstructorDemo(String name, int rollNo){
        this(rollNo,name);
        this.rollNo=rollNo;
        this.name=name;
        System.out.println("In parameter constructor");
    }
    void display(){
         System.out.println(i+"  "+str);
    }
    public static void main(String[] args) {

        PrivateAccessModifier pObj = new PrivateAccessModifier();
        pObj.display();
        System.out.println(pObj.k);
       // ConstructorDemo cDemo=new ConstructorDemo();
       // cDemo.i=30;
       //   cDemo.display();
        //System.out.println(cDemo.i+" "+cDemo.str);

        /*ConstructorDemo cDemo1=new ConstructorDemo();
        cDemo1.i=50;
        cDemo1.display();
        //System.out.println(cDemo1.i+" "+cDemo1.str);

        int l = 80;
        String s = "avinash";
        int rollNo = 50;
        String name = "jyothirmai";

        ConstructorDemo cDemo2=new ConstructorDemo(60,"jyothi");
        cDemo2.display();
        //System.out.println(cDemo2.i+" "+cDemo2.str);

        ConstructorDemo cDemo3 = new ConstructorDemo(l,s);
        cDemo3.display();
        //System.out.println(cDemo3.i+" "+cDemo3.str);

        ConstructorDemo cDemo4 = new ConstructorDemo(name,rollNo);
        cDemo4.display();*/
    }
}
