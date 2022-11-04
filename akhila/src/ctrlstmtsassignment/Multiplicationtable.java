package ctrlstmtsassignment;

public class Multiplicationtable {
    int n=5;
    void meth1()
    {
        int i=1,mul;
        while(i<=10)
        {
            mul=n*i;
            System.out.println(n+"*"+i+"="+mul);
            i++;
        }
    }
    public static void main(String[] args) {
        new Multiplicationtable().meth1();
    }
}
