package ctrlstmtsassignment;



public class Largest {
    int a=10;
    int b=20;
    int c=5;
    void meth1()
    {
        if(a>b&&a>c){
            System.out.println(a+" is largest");
        }
        else if(b>c)
        {
            System.out.println(b+" is largest");
        }
        else
        {
            System.out.println(c+" is largest");
        }
    }
    public static void main(String[] args) {
        new Largest().meth1();
    }
}
