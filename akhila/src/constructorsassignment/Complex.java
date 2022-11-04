package constructorsassignment;

public class Complex {
    int real;
    int image;
    public Complex(int r,int i)
    {
        this.real=r;
        this.image=i;
    }
    
    void show()
    {
        System.out.println(this.real+" +i"+this.image);
    }
    public static Complex add(Complex a,Complex b)
    {
        Complex res=new Complex(0,0);
        res.real=a.real+b.real;
        res.image=a.image+b.image;
        return res;
    }
    public static Complex sub(Complex a,Complex b)
    {
        Complex result=new Complex(0,0);
        result.real=a.real-b.real;
        result.image=a.image-b.image;
        return result;
    }
    public static Complex product(Complex a,Complex b)
    {
        Complex mul=new Complex(0,0);
        mul.real=a.real*b.real;
        mul.image=a.image*b.image;
        return mul;
    }
    public static void main(String[] args) {
       Complex a=new Complex(6,5);
       Complex b=new Complex(4,5);
       System.out.println("The addition of two complex numbers ");
       Complex res=add(a,b);
       res.show();
       System.out.println("The suubtraction of two complex numbers ");
       Complex result=sub(a,b);
       result.show();
       System.out.println("The multiplication of two complex numbers ");
       Complex mul=product(a,b);
       mul.show();
    }
}
