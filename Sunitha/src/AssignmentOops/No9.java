package AssignmentOops;

public class No9 {  //formula (3+7i)+(6+9i)=9+16i
    public static void main(String[] args) {
        Complex c=new Complex(2, 3);
        Complex c1=new Complex(4, 5);
        //int eql=c.sum(c1);
        Complex eql= c.sum(c1);
        Complex diff=c.difference(c1);
        System.out.println("sum value: "+eql);
        System.out.println("difference value: "+diff);
    }
}
class Complex {
        int real,imaginary;
    Complex(int r1,int i1){
        this.real=r1; this.imaginary=i1;
}
public Complex sum(Complex other) {
    int r=this.real+other.real;
    int i=this.imaginary+other.imaginary;
    return new Complex(r, i);  
}
public Complex difference(Complex other) {
    int r=this.real-other.real;
    int i=this.real-other.real;
    return new Complex(r, i);
    
}
public double getReal() {
    return real;
}
public double getImaginary() {
    return imaginary;
}
public String matches() {
    System.out.println();
    return real+" "+imaginary+"i";
    
}
    
}
