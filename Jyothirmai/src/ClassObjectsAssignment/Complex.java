package ClassObjectsAssignment;

public class Complex {
    int real;
    int imaginary;
    Complex(int r, int i){
        real = r;
        imaginary = i;
    }
    static Complex add(Complex a,Complex b){
           return new Complex((a.real+b.real),(a.imaginary+b.imaginary));
    }
    static Complex sub(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.imaginary-b.imaginary));
    }
    static Complex mul(Complex a,Complex b){
        return new Complex((a.real*b.real)-(a.imaginary*b.imaginary),(a.real*b.imaginary)+(a.imaginary*b.real));
    }
    void printComplex(){
        if(real==0 && imaginary !=0){
            System.out.println(imaginary+"i");
    }
    else if(imaginary==0 && real!=0){
        System.out.println(real);
    }
    else{
        System.out.println(real+"+"+imaginary+"i");
    }
    }
    public static void main(String[] args) {
        Complex a = new Complex(4,5);
        Complex b = new Complex(9,4);
        Complex e =add(a,b);
        Complex f = sub(a,b);
        Complex g = mul(a,b);
        e.printComplex();
        f.printComplex();
        g.printComplex();
        }
    }
