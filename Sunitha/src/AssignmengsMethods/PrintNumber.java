package AssignmengsMethods;

public class PrintNumber {
    public static void main(String[] args) {
        NumberPri n=new NumberPri();
        float f1=n.printN(5666.5f);
        int a1=n.printN(555555);
        int s1=n.printN(121);
        System.out.println(f1+a1+s1);
        n.Mname();
    }
}
class NumberPri{
    int a;
    float f=33.4f;
    long l=656566;
    short s=121;
    public int printN(int a) {
        System.out.println(a);
        return a;
    }
    public float printN(float f) {
        System.out.println(f);
        return f;
    }
    public short printN(short s) {
        System.out.println(s);
        return s;
    }
    public void Mname() {
        System.out.println("short:-"+s+" Long:- "+l+" float:- "+f);
        
    }
}

