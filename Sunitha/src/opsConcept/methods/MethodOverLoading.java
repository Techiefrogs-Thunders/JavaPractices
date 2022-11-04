package opsConcept.methods;

public class MethodOverLoading { //have same method and variable name but with arguments is called method overloading
    
    public static void main(String[] args) {
        MethodOverLoading mo=new MethodOverLoading();
        Water w=new Water();
        Bottle b=new Bottle();
       // w.getMethod();
        //w.getMethod(888888, 999999);
       // w.getMethod(2222.3f);
        b.getMethod();
        b.getMethod(99.5f);
        //mo.getMethod();
        //w.getMethod(23456789);
       // mo.getMethod();  
    }
}
    class Water{
    int i,i1;
    float f,f1,f2;
    double d=77.77;
    String name="class";

public void getMethod() {
    System.out.println("java class training");
    System.out.println(name);
}
public int getMethod(int i, int i1) {
    i=i; i=i1;
    System.out.println(i + " ----"+ i1);
    return i1;
}
public float getMethod(float f){
    f=f;
    System.out.println(f);
    return f;
}
}
class Bottle extends Water{
    int i=987987654;
    float f=22.2f;
    double d=77.77;
    String name="class";
    public void name() {
        System.out.println("bottle");
        super.getMethod();
        super.getMethod(i,i1);
        super.getMethod(f);
        
    }

}