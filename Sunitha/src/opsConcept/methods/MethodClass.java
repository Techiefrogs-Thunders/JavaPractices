package opsConcept.methods;

public class MethodClass extends Parent {
    public static void main(String[] args) {
        MethodClass mc=new MethodClass();
        mc.display();
        SecondMethod sm=new SecondMethod();
        sm.display();
        
    }
    public void display(){
        System.out.println("from child");
    }
}

class Parent{
    final int i=10;
    i=10;
    protected void display(){ ///public-->defualt-->protected-->private
        System.out.println("from parent");
        System.out.println(i);
    }

}

class SecondMethod extends Parent{
   public void display(){
        System.out.println("from second child");
    }
}
