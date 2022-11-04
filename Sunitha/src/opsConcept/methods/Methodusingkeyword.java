package opsConcept.methods;

public class Methodusingkeyword {
    public static void main(String[] args) {
        Water w=new Water();
        w.getMethod();
    }
}
class Bottle{
    int i=987987654;
    float f=22.2f;
    double d=77.77;
    String name="class";
public void getMethod() {
   // System.out.println("java class training");
    //System.out.println(name);
    System.out.println(d);
    System.out.println(f);
}
}
class Water extends Bottle{
    int i=7987654;
    float f=33.3f;
    double d=99.99;
    String name="bottle class";
public void getMethod() {
    System.out.println(name);
    System.out.println(f);
}

}
