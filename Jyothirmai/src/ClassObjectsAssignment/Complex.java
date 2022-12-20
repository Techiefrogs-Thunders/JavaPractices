package ClassObjectsAssignment;

public class Complex {
    int real;
    int imaginary;
    Complex(int r, int i){
        real = r;
        imaginary = i;
    }
    static Complex add(Complex a,Complex b){
           Complex res=new Complex(0,0);
           res.real=a.real+b.real;
           res.imaginary=a.imaginary+b.imaginary;
           return res;
    }
    static Complex sub(Complex a,Complex b){
        Complex res1 = new Complex(0, 0);
        res1.real=a.real-b.real;
        res1.imaginary=a.imaginary-b.imaginary;
        return res1;
        
    }
    static Complex mul(Complex a,Complex b){
        Complex res2 = new Complex(0, 0);
        res2.real=a.real*b.real;
        res2.imaginary=a.imaginary*b.imaginary;
        return res2;
    }
    void printComplex(){
        System.out.println(this.real+" +i"+this.imaginary);
    }
    public static void main(String[] args) {
        Complex a = new Complex(4,5);
        Complex b = new Complex(9,4);
        add(a,b);
        sub(a,b);
        mul(a,b);
        Complex res = add(a,b);
        Complex res1 = sub(a,b);
        Complex res2 = mul(a,b);
        res.printComplex();
        res1.printComplex();
        res2.printComplex();
        
        }
    }
