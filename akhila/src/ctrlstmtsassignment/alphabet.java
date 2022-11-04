package ctrlstmtsassignment;

public class alphabet {
    char ch='$';
    void meth1()
    {
        if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
        {
            System.out.println(ch+"is alphabet");
        }
        else{
            System.out.println(ch+" is not an alphabet");
        }
    }
    public static void main(String[] args) {
        new alphabet().meth1();
    }
}
